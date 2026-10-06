package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ContributionLevel {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ ContributionLevel[] $VALUES;
    public static final ContributionLevel UNKNOWN__ = new ContributionLevel("UNKNOWN__", 0);
    public static final ContributionLevel NONE = new ContributionLevel("NONE", 1);
    public static final ContributionLevel FIRST_QUARTILE = new ContributionLevel("FIRST_QUARTILE", 2);
    public static final ContributionLevel SECOND_QUARTILE = new ContributionLevel("SECOND_QUARTILE", 3);
    public static final ContributionLevel THIRD_QUARTILE = new ContributionLevel("THIRD_QUARTILE", 4);
    public static final ContributionLevel FOURTH_QUARTILE = new ContributionLevel("FOURTH_QUARTILE", 5);

    private static final /* synthetic */ ContributionLevel[] $values() {
        return new ContributionLevel[]{UNKNOWN__, NONE, FIRST_QUARTILE, SECOND_QUARTILE, THIRD_QUARTILE, FOURTH_QUARTILE};
    }

    static {
        ContributionLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private ContributionLevel(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static ContributionLevel valueOf(String str) {
        return (ContributionLevel) Enum.valueOf(ContributionLevel.class, str);
    }

    public static ContributionLevel[] values() {
        return (ContributionLevel[]) $VALUES.clone();
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}
