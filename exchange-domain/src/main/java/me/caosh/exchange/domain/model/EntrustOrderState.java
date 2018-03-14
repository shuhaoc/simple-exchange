package me.caosh.exchange.domain.model;

/**
 * @author caosh/caoshuhao@touker.com
 * @date 2018/3/14
 */
public enum EntrustOrderState {
    /**
     * 等待成交
     */
    WAITING,

    /**
     * 部分成交
     */
    PARTIAL_DEALT,

    /**
     * 全部成交
     */
    DEALT,

    /**
     * 全部撤单
     */
    REVOKED,

    /**
     * 部分成交、部分撤单
     */
    PARTIAL_DEALT_REVOKED,
}
