package me.caosh.exchange.domain.model;

import com.google.common.base.MoreObjects;

import java.math.BigDecimal;

/**
 * 证券，交易标的
 *
 * @author caosh/caoshuhao@touker.com
 * @date 2018/3/14
 */
public class Security {
    private final String code;
    private final String name;
    private final BigDecimal faceValue;

    public Security(String code, String name, BigDecimal faceValue) {
        this.code = code;
        this.name = name;
        this.faceValue = faceValue;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getFaceValue() {
        return faceValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Security security = (Security) o;

        return code.equals(security.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(Security.class).omitNullValues()
                .add("code", code)
                .add("name", name)
                .add("faceValue", faceValue)
                .toString();
    }
}
