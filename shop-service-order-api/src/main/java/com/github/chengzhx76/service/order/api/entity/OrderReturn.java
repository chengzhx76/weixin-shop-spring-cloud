package com.github.chengzhx76.service.order.api.entity;


import com.github.chengzhx76.shop.common.entity.DataEntity;

import java.math.BigDecimal;

/**
 * Desc: 退单主
 * Author: cheng
 * Date: 2016/6/6
 */
public class OrderReturn extends DataEntity<OrderReturn> {
    private String accessId;
    private String returnId;
    private String orderInfoOid;
    private String orderInfoId;
    private BigDecimal refundPayable;
    private BigDecimal refundPaid;
    private BigDecimal salePriceTatal;
    private String consignee;
    private String mobile;
    private String address;
    private String province;
    private String city;
    private String country;
    private String returnStatusId;
    private BigDecimal freight;
    private BigDecimal productTotalPrice;
    private String remarkSystem;
    private String ip;
    private String postCode;
    private String telephone;
    private String email;
    private String returnReasonId;
    private String customReturnReason;
    private String refundTypeId;
    private BigDecimal customPrice;

    public String getAccessId() {
        return accessId;
    }

    public void setAccessId(String accessId) {
        this.accessId = accessId;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getOrderInfoOid() {
        return orderInfoOid;
    }

    public void setOrderInfoOid(String orderInfoOid) {
        this.orderInfoOid = orderInfoOid;
    }

    public String getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(String orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public BigDecimal getRefundPayable() {
        return refundPayable;
    }

    public void setRefundPayable(BigDecimal refundPayable) {
        this.refundPayable = refundPayable;
    }

    public BigDecimal getRefundPaid() {
        return refundPaid;
    }

    public void setRefundPaid(BigDecimal refundPaid) {
        this.refundPaid = refundPaid;
    }

    public BigDecimal getSalePriceTatal() {
        return salePriceTatal;
    }

    public void setSalePriceTatal(BigDecimal salePriceTatal) {
        this.salePriceTatal = salePriceTatal;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getReturnStatusId() {
        return returnStatusId;
    }

    public void setReturnStatusId(String returnStatusId) {
        this.returnStatusId = returnStatusId;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(BigDecimal productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    public String getRemarkSystem() {
        return remarkSystem;
    }

    public void setRemarkSystem(String remarkSystem) {
        this.remarkSystem = remarkSystem;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReturnReasonId() {
        return returnReasonId;
    }

    public void setReturnReasonId(String returnReasonId) {
        this.returnReasonId = returnReasonId;
    }

    public String getCustomReturnReason() {
        return customReturnReason;
    }

    public void setCustomReturnReason(String customReturnReason) {
        this.customReturnReason = customReturnReason;
    }

    public String getRefundTypeId() {
        return refundTypeId;
    }

    public void setRefundTypeId(String refundTypeId) {
        this.refundTypeId = refundTypeId;
    }

    public BigDecimal getCustomPrice() {
        return customPrice;
    }

    public void setCustomPrice(BigDecimal customPrice) {
        this.customPrice = customPrice;
    }
}
