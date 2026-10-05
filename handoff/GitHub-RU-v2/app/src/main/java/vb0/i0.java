package vb0;

import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackType;
import java.util.ArrayList;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 implements z01.j, y90 {
    @Override // z01.j
    public final y71.i a(String str, CopilotCodeReviewFeedbackType copilotCodeReviewFeedbackType, ArrayList arrayList, String str2) {
        k71.k.g(str, "commentId");
        k71.k.g(copilotCodeReviewFeedbackType, "feedback");
        return y41.t1.S("provideCopilotCodeReviewFeedback", "3.10");
    }

    public final Object h() {
        return this;
    }
}
