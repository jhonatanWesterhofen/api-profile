package com.base.domain.Utils;

import com.base.domain.repositories.IEnum;

/**
 *
 * @author Jhonatan
 */
public class EnumUtil {

    public static <T extends IEnum> T parseByKey(Class<T> enumValue, String key) {
        try {
            if (key != null && !key.trim().isEmpty()) {
                for (var value : enumValue.getEnumConstants()) {
                    if (value.getKey().equalsIgnoreCase(key.toLowerCase())) {
                        return value;
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }

        return null;
    }

    public static <T extends IEnum> T parseByValue(Class<T> enumValue, String value) {
        try {
            if (value != null && !value.trim().isEmpty()) {
                for (var enumVal : enumValue.getEnumConstants()) {
                    if (enumVal.getValue().equalsIgnoreCase(value)) {
                        return enumVal;
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }

        return null;
    }
}