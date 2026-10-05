package uy;

import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackOption;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CopilotCodeReviewFeedbackOption.values().length];
        try {
            iArr[CopilotCodeReviewFeedbackOption.INCORRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackOption.INCORRECT_LINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackOption.OFFENSIVE_OR_DISCRIMINATORY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackOption.POORLY_FORMATTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackOption.UNHELPFUL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackOption.SUGGESTION_INVALID.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackOption.SUGGESTION_OFFENSIVE_OR_DISCRIMINATORY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackOption.SUGGESTION_POORLY_FORMATTED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackOption.SUGGESTION_UNHELPFUL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackOption.UNKNOWN__.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
    }
}
