package com.github.rudroid.issueorpullrequest.ui.copilot.codereview;

import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackOption;

/* loaded from: /home/user/work/p/classes.dex */
public final class o {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16733a;

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
            f16733a = iArr;
        }
    }
}
