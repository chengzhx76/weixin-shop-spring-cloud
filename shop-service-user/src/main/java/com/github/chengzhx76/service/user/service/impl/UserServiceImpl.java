package com.github.chengzhx76.service.user.service.impl;


import com.github.chengzhx76.service.user.api.entity.*;
import com.github.chengzhx76.service.user.api.entity.enumType.Credit;
import com.github.chengzhx76.service.user.api.entity.enumType.SourceFrom;
import com.github.chengzhx76.service.user.api.service.UserService;
import com.github.chengzhx76.service.user.dao.*;
import com.github.chengzhx76.shop.common.entity.enums.Sex;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Desc: 用户
 * Author: cheng
 * Date: 2016/7/7
 */
@RestController
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccountDaoMapper accountDao;
    @Autowired
    private AccountLevelDaoMapper accountLevelDao;
    @Autowired
    private MemberDaoMapper memberDao;
    @Autowired
    private DeliveryAddressDaoMapper deliveryAddressDao;
    @Autowired
    private BehaviorDaoMapper behaviorDao;
    @Autowired
    private BonusPointRecordDaoMapper bonusPointRecordDao;
    @Autowired
    private CouponRecordDaoMapper couponRecordDao;
    @Autowired
    private CashRecordDaoMapper cashRecordDao;
    @Autowired
    private ProductFocusDaoMapper productFocusDao;

    @Override
    public Account getAccountByLoginName(String loginName) {
        return accountDao.load(new Account(null, loginName));
    }

    @Override
    public Account getAccountById(String id) {
        return accountDao.load(new Account(id, null));
    }

    @Override
    public void saveAccess(String phone, String password, String nickname, String ip) {

        if (null != getAccountByLoginName(phone)) {
            logger.info("当前用户{}已存在", phone);
            throw new IllegalArgumentException("当前用户"+phone+"已存在");
        }

        AccountLevel level = new AccountLevel();
        level.setLevel(1);
        level.setEnable(true);

        AccountLevel accountLevel = accountLevelDao.load(level);
        Account account = new Account();
        account.setUsername(phone);
        account.setPassword(password);
        account.setNickname(nickname);
        account.setAccountLevelId(accountLevel.getId());
        account.setBalance(new BigDecimal(0));
        account.setBonusPointUpgrade(accountLevel.getNextLevelNeedPoint());
        account.setBonusPointUsable(0);
        account.setCredit(Credit.WELL);
        account.setEmployee(false);
        account.setIp(ip);
        account.setSourceFrom(SourceFrom.NO);
        account.preInsert();
        accountDao.save(account);

        Member member = new Member();
        member.setAccountId(account.getId());
        member.setMobile(phone);
        member.setSex(Sex.UNKNOW);
        member.preInsert();
        memberDao.save(member);
    }

    @Override
    public String validateLogin(String loginName, String password, String loginIp) {
        Account userAccount = accountDao.load(new Account(null, loginName));
        if (null != userAccount) {
            if (!password.equals(userAccount.getPassword())) {
                return "PASSWDFAIL";
            }
        }else {
            return "NOTUSER";
        }
        // 登陆成功保存登陆者的IP
        userAccount.setIp(loginIp);
        userAccount.preUpdate();
        accountDao.update(userAccount);
        return "SUCCESS";
    }

    @Override
    public DeliveryAddress getDefaultAddress(String userId) {
        return deliveryAddressDao.load(new DeliveryAddress(userId, true));
    }

    @Override
    public DeliveryAddress getDeliveryAddress(String id, String userId) {
        DeliveryAddress address = new DeliveryAddress();
        address.setId(id);
        address.setAccountId(userId);
        return deliveryAddressDao.load(address);
    }

    @Override
    public List<DeliveryAddress> getAllDeliveryAddr(String userId) {
        return deliveryAddressDao.loadAll(new DeliveryAddress(userId, null));
    }

    @Override
    public Account getAccount(String userId) {
        Account account = new Account();
        account.setId(userId);
        return accountDao.load(account);
    }

    @Override
    public Account getAccountByUsername(String username) {
        Account account = new Account();
        account.setUsername(username);
        return accountDao.load(account);
    }

    @Override
    public void updateAccount(Account account) {
        account.preUpdate();
        accountDao.update(account);
    }

    @Override
    public void addBehavior(Behavior behavior) {
        behavior.preInsert();
        behaviorDao.save(behavior);
    }

    @Override
    public BonusPointRecord getBonusPointRecord(String userId) {
        return bonusPointRecordDao.loadNewByUSerId(new BonusPointRecord(userId));
    }

    @Override
    public List<BonusPointRecord> getByUserIdAndCurrentMonth(String userId) {
        Date currentMonth = DateTime.now().dayOfMonth().withMinimumValue().hourOfDay().withMinimumValue().millisOfDay().withMinimumValue().toDate();
        BonusPointRecord bonusPointRecord = new BonusPointRecord();
        bonusPointRecord.setAccountId(userId);
        bonusPointRecord.setCreateDate(currentMonth);
        return bonusPointRecordDao.loadByUSerIdAndCurrentMonth(bonusPointRecord);
    }

    @Override
    public void addBonusPointRecord(BonusPointRecord bonusPointRecord) {
        bonusPointRecord.preInsert();
        bonusPointRecordDao.save(bonusPointRecord);
    }

    @Override
    public CouponRecord getCouponRecordByUser(String userId) {
        return couponRecordDao.loadByUser(new CouponRecord(userId));
    }

    @Override
    public void addCouponRecord(CouponRecord couponRecor) {
        couponRecor.preInsert();
        couponRecordDao.save(couponRecor);
    }

    @Override
    public CashRecord getNewCashRecord(String userId) {
        return cashRecordDao.loadNewByUser(new CashRecord(userId));
    }

    @Override
    public void addCashRecord(CashRecord cashRecord) {
        cashRecord.preInsert();
        cashRecordDao.save(cashRecord);
    }

    @Override
    public void addProductFocus(String userId, String productId) {
        ProductFocus focus = new ProductFocus(userId, productId);
        focus.preInsert();
        productFocusDao.save(focus);
    }

    @Override
    public void deleteProductFocus(String userId, String productId) {
        ProductFocus focus = new ProductFocus(userId, productId);
//        focus.setStatus(Status.DELETE);
        focus.preUpdate();
        productFocusDao.delete(focus);
    }

    @Override
    public boolean isProductFocus(String userId, String productId) {
        ProductFocus focus = productFocusDao.load(new ProductFocus(userId, productId));
        return focus!=null;
    }

    @Override
    public Member getMemberById(String userId) {
        return memberDao.load(new Member(userId));
    }

    @Override
    public Member getMemberByAccountId(String userId) {
        Member member = new Member();
        member.setAccountId(userId);
        return memberDao.load(member);
    }

    @Override
    public AccountLevel getAccountLevelById(String id) {
        AccountLevel level = new AccountLevel();
        level.setId(id);
        return accountLevelDao.load(level);
    }

    @Override
    public AccountLevel getAccountLevelByLevel(int level) {
        AccountLevel accountLevel = new AccountLevel();
        accountLevel.setLevel(level);
        accountLevel.setEnable(true);
        return accountLevelDao.load(accountLevel);
    }
}
