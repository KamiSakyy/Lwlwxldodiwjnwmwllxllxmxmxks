package uy;

import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackType;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CopilotCodeReviewFeedbackType.values().length];
        try {
            iArr[CopilotCodeReviewFeedbackType.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackType.NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CopilotCodeReviewFeedbackType.UNKNOWN__.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
