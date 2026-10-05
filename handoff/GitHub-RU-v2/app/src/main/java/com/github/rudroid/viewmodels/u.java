package com.github.rudroid.viewmodels;

import com.github.service.models.response.copilot.CopilotCodeReviewFeedbackType;
import java.util.ArrayList;
import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.CopilotReviewFeedbackViewModel$submitCopilotReviewFeedback$1", f = "CopilotReviewFeedbackViewModel.kt", l = {95}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class u extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ v w;
    public final /* synthetic */ String x;
    public final /* synthetic */ CopilotCodeReviewFeedbackType y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, String str, CopilotCodeReviewFeedbackType copilotCodeReviewFeedbackType, a71.c cVar) {
        super(2, cVar);
        this.w = vVar;
        this.x = str;
        this.y = copilotCodeReviewFeedbackType;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new u(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        v vVar = this.w;
        y71.i1 i1Var = vVar.x;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            oj.a aVar2 = vVar.t;
            oa.j d = vVar.u.d();
            com.github.rudroid.issueorpullrequest.ui.copilot.codereview.l lVar = vVar.v;
            com.github.rudroid.issueorpullrequest.ui.copilot.codereview.n nVar = (com.github.rudroid.issueorpullrequest.ui.copilot.codereview.n) i1Var.r.getValue();
            lVar.getClass();
            k71.k.g(nVar, "feedback");
            List list = nVar.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((com.github.rudroid.issueorpullrequest.ui.copilot.codereview.p) obj2).b) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                arrayList2.add(((com.github.rudroid.issueorpullrequest.ui.copilot.codereview.p) obj3).a);
            }
            String str = ((com.github.rudroid.issueorpullrequest.ui.copilot.codereview.n) i1Var.r.getValue()).b;
            com.github.rudroid.issueorpullrequest.ui.copilot.codereview.q qVar = new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.q(vVar, 1);
            aVar2.getClass();
            String str2 = this.x;
            k71.k.g(str2, "commentId");
            CopilotCodeReviewFeedbackType copilotCodeReviewFeedbackType = this.y;
            k71.k.g(copilotCodeReviewFeedbackType, "feedback");
            y71.y J = b31.b.J(((z01.j) aVar2.a.a(d)).a(str2, copilotCodeReviewFeedbackType, x61.m.S(arrayList2), str), d, qVar);
            t tVar = new t(vVar);
            this.v = 1;
            if (J.b(tVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
