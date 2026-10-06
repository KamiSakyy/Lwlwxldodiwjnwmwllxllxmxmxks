package com.github.service.models.response.type;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class MobileAuthRequestType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MobileAuthRequestType[] $VALUES;
    public static final MobileAuthRequestType TWO_FACTOR_LOGIN = new MobileAuthRequestType("TWO_FACTOR_LOGIN", 0);
    public static final MobileAuthRequestType DEVICE_VERIFICATION = new MobileAuthRequestType("DEVICE_VERIFICATION", 1);
    public static final MobileAuthRequestType TWO_FACTOR_PASSWORD_RESET = new MobileAuthRequestType("TWO_FACTOR_PASSWORD_RESET", 2);
    public static final MobileAuthRequestType TWO_FACTOR_SUDO_CHALLENGE = new MobileAuthRequestType("TWO_FACTOR_SUDO_CHALLENGE", 3);
    public static final MobileAuthRequestType UNKNOWN = new MobileAuthRequestType("UNKNOWN", 4);

    private static final /* synthetic */ MobileAuthRequestType[] $values() {
        return new MobileAuthRequestType[]{TWO_FACTOR_LOGIN, DEVICE_VERIFICATION, TWO_FACTOR_PASSWORD_RESET, TWO_FACTOR_SUDO_CHALLENGE, UNKNOWN};
    }

    static {
        MobileAuthRequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private MobileAuthRequestType(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MobileAuthRequestType valueOf(String str) {
        return (MobileAuthRequestType) Enum.valueOf(MobileAuthRequestType.class, str);
    }

    public static MobileAuthRequestType[] values() {
        return (MobileAuthRequestType[]) $VALUES.clone();
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}
