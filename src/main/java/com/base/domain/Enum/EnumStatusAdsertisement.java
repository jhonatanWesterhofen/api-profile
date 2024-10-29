package com.base.domain.Enum;

import com.base.domain.Utils.EnumUtil;
import com.base.domain.repositories.IEnum;

public enum EnumStatusAdsertisement implements IEnum {

    ATIVO("ATIVO", "Anúncio ativo"),
    VENDIDO("VENDIDO", "Anúncio vemdido"),
    EXPIRADO("EXPIRADO", "Anúncio expirado"),
    PENDENTE("PENDENTE", "Anúncio pendente"),
    PAUSADO("PAUSADO", "Anúncio pausado"),
    INATIVO("INATIVO", "Anúncio inativo");

    private EnumStatusAdsertisement(String key, String value) {
        this.key = key;
        this.value = value;
    }

    private String key;

    private String value;

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean containsInEnum(String key) {
        return parseByKey(key) != null;
    }

    public static EnumStatusAdsertisement parseByKey(String key) {
        return EnumUtil.parseByKey(EnumStatusAdsertisement.class, key);
    }

    public static EnumStatusAdsertisement parseByValue(String value) {
        return EnumUtil.parseByValue(EnumStatusAdsertisement.class, value);
    }

}
