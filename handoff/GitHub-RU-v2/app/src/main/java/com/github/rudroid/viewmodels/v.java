package com.github.rudroid.viewmodels;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.viewmodel.d;
import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackOption;
import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackType;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v extends androidx.lifecycle.k1 implements com.github.rudroid.utilities.viewmodel.d {
    public final /* synthetic */ d.a s;
    public oj.a t;
    public com.github.rudroid.activities.util.c u;
    public com.github.rudroid.issueorpullrequest.ui.copilot.codereview.l v;
    public y71.y1 w;
    public y71.i1 x;
    public y71.y1 y;
    public y71.i1 z;

    public v(oj.a aVar, com.github.rudroid.activities.util.c cVar, com.github.rudroid.issueorpullrequest.ui.copilot.codereview.l lVar) {
        k71.k.g(aVar, "submitCopilotReviewFeedbackUseCase");
        k71.k.g(cVar, "accountHolder");
        this.s = new d.a();
        this.t = aVar;
        this.u = cVar;
        this.v = lVar;
        d71.a entries = CopilotCodeReviewFeedbackOption.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((CopilotCodeReviewFeedbackOption) obj) != CopilotCodeReviewFeedbackOption.UNKNOWN__) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.p((CopilotCodeReviewFeedbackOption) obj2, false));
        }
        y71.y1 c = y71.n1.c(new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.n(arrayList2, (String) null));
        this.w = c;
        this.x = new y71.i1(c);
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        y71.y1 c2 = y71.n1.c(g1.a.a());
        this.y = c2;
        this.z = new y71.i1(c2);
    }

    public final void P(String str, CopilotCodeReviewFeedbackType copilotCodeReviewFeedbackType) {
        k71.k.g(str, "commentId");
        k71.k.g(copilotCodeReviewFeedbackType, "feedbackType");
        com.github.rudroid.utilities.w0.n(this.y);
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new u(this, str, copilotCodeReviewFeedbackType, null), 3);
    }
}
