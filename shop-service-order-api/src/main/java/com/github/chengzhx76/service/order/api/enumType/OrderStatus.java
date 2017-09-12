package com.github.chengzhx76.service.order.api.enumType;

/**
 * Desc:
 * Author: 光灿
 * Date: 2016/11/16
 */
public interface OrderStatus {
    /*INVALID("无效的订单"), // 前端用的


    WAIT_PAY("等待付款"), // 倒计时15分钟内付款 进入下一个流程，否则进入付款超时（已失效）
    ONGOING("进行中"),
    COMMENT("等待评论"), // 用户确认收货后
    FINISHED("完成"),

    PAY_OUT_TIME("付款超时"),
    WAIT_REFUND("等待退款"),
    REFUNDED("已退款"),
    CANCELED("已取消"),
    UNFINISHED("未完成");


    private String name;
    OrderStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }*/

    String INVALID = "0";

    String WAIT_PAY = "1";
    String ONGOING = "2";
    String COMMENT = "3";
    String FINISHED = "4";

    String PAY_OUT_TIME = "5";
    String WAIT_REFUND = "6";
    String REFUNDED = "7";
    String CANCELED = "8";
    String UNFINISHED = "9";

}
