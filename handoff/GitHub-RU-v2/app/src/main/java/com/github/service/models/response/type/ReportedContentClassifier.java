package com.github.service.models.response.type;

import d71.a;
import kotlin.NoWhenBranchMatchedException;
import r01.u;
import r01.v;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ReportedContentClassifier {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ReportedContentClassifier[] $VALUES;
    public static final u Companion;
    private final String rawValue;
    public static final ReportedContentClassifier SPAM = new ReportedContentClassifier("SPAM", 0, "SPAM");
    public static final ReportedContentClassifier ABUSE = new ReportedContentClassifier("ABUSE", 1, "ABUSE");
    public static final ReportedContentClassifier OFF_TOPIC = new ReportedContentClassifier("OFF_TOPIC", 2, "OFF_TOPIC");
    public static final ReportedContentClassifier OUTDATED = new ReportedContentClassifier("OUTDATED", 3, "OUTDATED");
    public static final ReportedContentClassifier DUPLICATE = new ReportedContentClassifier("DUPLICATE", 4, "DUPLICATE");
    public static final ReportedContentClassifier RESOLVED = new ReportedContentClassifier("RESOLVED", 5, "RESOLVED");
    public static final ReportedContentClassifier UNKNOWN__ = new ReportedContentClassifier("UNKNOWN__", 6, "UNKNOWN__");

    private static final /* synthetic */ ReportedContentClassifier[] $values() {
        return new ReportedContentClassifier[]{SPAM, ABUSE, OFF_TOPIC, OUTDATED, DUPLICATE, RESOLVED, UNKNOWN__};
    }

    static {
        ReportedContentClassifier[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new u();
    }

    private ReportedContentClassifier(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ReportedContentClassifier valueOf(String str) {
        return (ReportedContentClassifier) Enum.valueOf(ReportedContentClassifier.class, str);
    }

    public static ReportedContentClassifier[] values() {
        return (ReportedContentClassifier[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public final String toApiReturnString() {
        switch (v.a[ordinal()]) {
            case 1:
                return "spam";
            case 2:
                return "abuse";
            case 3:
                return "off-topic";
            case 4:
                return "outdated";
            case 5:
                return "duplicate";
            case 6:
                return "resolved";
            case 7:
                return "unknown";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}
