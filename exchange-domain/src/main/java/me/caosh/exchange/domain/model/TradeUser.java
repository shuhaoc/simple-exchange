package me.caosh.exchange.domain.model;

import com.google.common.base.MoreObjects;

/**
 * @author caosh/caoshuhao@touker.com
 * @date 2018/3/14
 */
public class TradeUser {
    private final Integer userId;
    private final String realName;

    public TradeUser(Integer userId, String realName) {
        this.userId = userId;
        this.realName = realName;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(TradeUser.class).omitNullValues()
                .add("userId", userId)
                .add("realName", realName)
                .toString();
    }
}
