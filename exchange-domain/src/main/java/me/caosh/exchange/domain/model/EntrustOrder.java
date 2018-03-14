package me.caosh.exchange.domain.model;

import org.joda.time.LocalDateTime;

import java.math.BigDecimal;

/**
 * @author caosh/caoshuhao@touker.com
 * @date 2018/3/14
 */
public class EntrustOrder {
    private int entrustId;
    private TradeUser tradeUser;
    private TradeUser counterParty;
    private Security security;
    private TradeDirection tradeDirection;
    private BigDecimal price;
    private int quantity;
    private LocalDateTime dealTime;

}
