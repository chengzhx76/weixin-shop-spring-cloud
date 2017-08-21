package com.github.chengzhx76.service.user.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

import java.util.Date;

/**
 * Desc: 用户基础信息
 * Author: cheng
 * Date: 2016/6/3
 */
public class Member extends DataEntity<Member> {
    private String accountId;
    private String name;
    private String employer;
    private String mobile;
    private String address;
    private String email;
    private String idcard;
    private String sex;
    private Date birthday;
    private int regionProvinceId;
    private int regionCityId;
    private int regionCountryId;
    private String telephone;
    private String postCode;
    private String incomeMonth;
    private String job;
    private String hobby;

    public Member() {
    }
    public Member(String id) {
        super.id = id;
    }
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getRegionProvinceId() {
        return regionProvinceId;
    }

    public void setRegionProvinceId(int regionProvinceId) {
        this.regionProvinceId = regionProvinceId;
    }

    public int getRegionCityId() {
        return regionCityId;
    }

    public void setRegionCityId(int regionCityId) {
        this.regionCityId = regionCityId;
    }

    public int getRegionCountryId() {
        return regionCountryId;
    }

    public void setRegionCountryId(int regionCountryId) {
        this.regionCountryId = regionCountryId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getIncomeMonth() {
        return incomeMonth;
    }

    public void setIncomeMonth(String incomeMonth) {
        this.incomeMonth = incomeMonth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
