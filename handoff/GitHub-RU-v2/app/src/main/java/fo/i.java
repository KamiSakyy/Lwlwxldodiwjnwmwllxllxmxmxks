package fo;

import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackType;
import java.util.ArrayList;
import jn0.yf0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements z01.j, yn.a, yf0 {
    public final /* synthetic */ int r;

    public final y71.i a(String str, CopilotCodeReviewFeedbackType copilotCodeReviewFeedbackType, ArrayList arrayList, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "commentId");
                k71.k.g(copilotCodeReviewFeedbackType, "feedback");
                return sy.c0.j();
            default:
                k71.k.g(str, "commentId");
                k71.k.g(copilotCodeReviewFeedbackType, "feedback");
                return t1.S("provideCopilotCodeReviewFeedback", "3.17");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
