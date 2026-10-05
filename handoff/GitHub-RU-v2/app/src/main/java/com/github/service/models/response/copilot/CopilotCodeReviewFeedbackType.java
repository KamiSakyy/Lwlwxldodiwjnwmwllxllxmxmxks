package com.github.service.models.response.copilot;

import d71.a;
import kotlin.NoWhenBranchMatchedException;
import v8.l0;
import zz0.c;
import zz0.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class CopilotCodeReviewFeedbackType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CopilotCodeReviewFeedbackType[] $VALUES;
    public static final c Companion;
    private final String rawValue;
    public static final CopilotCodeReviewFeedbackType POSITIVE = new CopilotCodeReviewFeedbackType("POSITIVE", 0, "POSITIVE");
    public static final CopilotCodeReviewFeedbackType NEGATIVE = new CopilotCodeReviewFeedbackType("NEGATIVE", 1, "NEGATIVE");
    public static final CopilotCodeReviewFeedbackType UNKNOWN__ = new CopilotCodeReviewFeedbackType("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ CopilotCodeReviewFeedbackType[] $values() {
        return new CopilotCodeReviewFeedbackType[]{POSITIVE, NEGATIVE, UNKNOWN__};
    }

    static {
        CopilotCodeReviewFeedbackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new c();
    }

    private CopilotCodeReviewFeedbackType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static CopilotCodeReviewFeedbackType valueOf(String str) {
        return (CopilotCodeReviewFeedbackType) Enum.valueOf(CopilotCodeReviewFeedbackType.class, str);
    }

    public static CopilotCodeReviewFeedbackType[] values() {
        return (CopilotCodeReviewFeedbackType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public final String toApiReturnString() {
        int i = d.a[ordinal()];
        if (i == 1) {
            return "positive";
        }
        if (i == 2) {
            return "negative";
        }
        if (i == 3) {
            return "unknown";
        }
        throw new NoWhenBranchMatchedException();
    }
}
