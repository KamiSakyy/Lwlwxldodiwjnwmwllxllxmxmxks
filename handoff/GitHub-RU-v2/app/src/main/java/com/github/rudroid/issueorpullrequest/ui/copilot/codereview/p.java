package com.github.rudroid.issueorpullrequest.ui.copilot.codereview;

import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackOption;

/* loaded from: /home/user/work/p/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final CopilotCodeReviewFeedbackOption f16734a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16735b;

    public p(CopilotCodeReviewFeedbackOption copilotCodeReviewFeedbackOption, boolean z10) {
        k71.k.g(copilotCodeReviewFeedbackOption, "option");
        this.f16734a = copilotCodeReviewFeedbackOption;
        this.f16735b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f16734a == pVar.f16734a && this.f16735b == pVar.f16735b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16735b) + (this.f16734a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackOptionUiModel(option=" + this.f16734a + ", isSelected=" + this.f16735b + ")";
    }
}
