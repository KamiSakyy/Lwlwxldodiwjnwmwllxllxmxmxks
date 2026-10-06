package com.github.service.models.response.copilot;

import d71.a;
import v8.l0;
import zz0.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class CopilotCodeReviewFeedbackOption {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CopilotCodeReviewFeedbackOption[] $VALUES;
    public static final b Companion;
    private String rawValue;
    public static final CopilotCodeReviewFeedbackOption INCORRECT = new CopilotCodeReviewFeedbackOption("INCORRECT", 0, "INCORRECT");
    public static final CopilotCodeReviewFeedbackOption INCORRECT_LINE = new CopilotCodeReviewFeedbackOption("INCORRECT_LINE", 1, "INCORRECT_LINE");
    public static final CopilotCodeReviewFeedbackOption OFFENSIVE_OR_DISCRIMINATORY = new CopilotCodeReviewFeedbackOption("OFFENSIVE_OR_DISCRIMINATORY", 2, "OFFENSIVE_OR_DISCRIMINATORY");
    public static final CopilotCodeReviewFeedbackOption POORLY_FORMATTED = new CopilotCodeReviewFeedbackOption("POORLY_FORMATTED", 3, "POORLY_FORMATTED");
    public static final CopilotCodeReviewFeedbackOption UNHELPFUL = new CopilotCodeReviewFeedbackOption("UNHELPFUL", 4, "UNHELPFUL");
    public static final CopilotCodeReviewFeedbackOption SUGGESTION_INVALID = new CopilotCodeReviewFeedbackOption("SUGGESTION_INVALID", 5, "SUGGESTION_INVALID");
    public static final CopilotCodeReviewFeedbackOption SUGGESTION_OFFENSIVE_OR_DISCRIMINATORY = new CopilotCodeReviewFeedbackOption("SUGGESTION_OFFENSIVE_OR_DISCRIMINATORY", 6, "SUGGESTION_OFFENSIVE_OR_DISCRIMINATORY");
    public static final CopilotCodeReviewFeedbackOption SUGGESTION_POORLY_FORMATTED = new CopilotCodeReviewFeedbackOption("SUGGESTION_POORLY_FORMATTED", 7, "SUGGESTION_POORLY_FORMATTED");
    public static final CopilotCodeReviewFeedbackOption SUGGESTION_UNHELPFUL = new CopilotCodeReviewFeedbackOption("SUGGESTION_UNHELPFUL", 8, "SUGGESTION_UNHELPFUL");
    public static final CopilotCodeReviewFeedbackOption UNKNOWN__ = new CopilotCodeReviewFeedbackOption("UNKNOWN__", 9, "UNKNOWN__");

    private static final /* synthetic */ CopilotCodeReviewFeedbackOption[] $values() {
        return new CopilotCodeReviewFeedbackOption[]{INCORRECT, INCORRECT_LINE, OFFENSIVE_OR_DISCRIMINATORY, POORLY_FORMATTED, UNHELPFUL, SUGGESTION_INVALID, SUGGESTION_OFFENSIVE_OR_DISCRIMINATORY, SUGGESTION_POORLY_FORMATTED, SUGGESTION_UNHELPFUL, UNKNOWN__};
    }

    static {
        CopilotCodeReviewFeedbackOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new b();
    }

    private CopilotCodeReviewFeedbackOption(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static CopilotCodeReviewFeedbackOption valueOf(String str) {
        return (CopilotCodeReviewFeedbackOption) Enum.valueOf(CopilotCodeReviewFeedbackOption.class, str);
    }

    public static CopilotCodeReviewFeedbackOption[] values() {
        return (CopilotCodeReviewFeedbackOption[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}
