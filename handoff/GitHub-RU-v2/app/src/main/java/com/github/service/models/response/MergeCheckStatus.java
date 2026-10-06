package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class MergeCheckStatus {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ MergeCheckStatus[] $VALUES;
    public static final MergeCheckStatus ACTION_REQUIRED = new MergeCheckStatus("ACTION_REQUIRED", 0);
    public static final MergeCheckStatus CANCELLED = new MergeCheckStatus("CANCELLED", 1);
    public static final MergeCheckStatus NEUTRAL = new MergeCheckStatus("NEUTRAL", 2);
    public static final MergeCheckStatus SKIPPED = new MergeCheckStatus("SKIPPED", 3);
    public static final MergeCheckStatus STALE = new MergeCheckStatus("STALE", 4);
    public static final MergeCheckStatus FAILURE = new MergeCheckStatus("FAILURE", 5);
    public static final MergeCheckStatus SUCCESS = new MergeCheckStatus("SUCCESS", 6);
    public static final MergeCheckStatus PENDING = new MergeCheckStatus("PENDING", 7);

    private static final /* synthetic */ MergeCheckStatus[] $values() {
        return new MergeCheckStatus[]{ACTION_REQUIRED, CANCELLED, NEUTRAL, SKIPPED, STALE, FAILURE, SUCCESS, PENDING};
    }

    static {
        MergeCheckStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private MergeCheckStatus(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static MergeCheckStatus valueOf(String str) {
        return (MergeCheckStatus) Enum.valueOf(MergeCheckStatus.class, str);
    }

    public static MergeCheckStatus[] values() {
        return (MergeCheckStatus[]) $VALUES.clone();
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}
