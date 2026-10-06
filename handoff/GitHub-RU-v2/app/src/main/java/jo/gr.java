package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gr implements aaShadow.n0 {
    public static final dr Companion = new dr();
    public String r;
    public m10.c8 s;
    public aa.u0 t;
    public aa1.b u;

    public gr(String str, m10.c8 c8Var, aa.u0 u0Var, aa1.b bVar) {
        k71.k.g(str, "commentId");
        this.r = str;
        this.s = c8Var;
        this.t = u0Var;
        this.u = bVar;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.j3.a;
        List list2 = h10.j3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr)) {
            return false;
        }
        gr grVar = (gr) obj;
        return k71.k.b(this.r, grVar.r) && this.s == grVar.s && this.t.equals(grVar.t) && this.u.equals(grVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ji.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f4.a(this.t, (this.s.hashCode() + (this.r.hashCode() * 31)) * 31, 31);
    }

    public final String i() {
        return "755796d4e3d52c9b3abc11497f67ac6645cd384d2bf432b667e02468e490bb17";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ProvideCopilotCodeReviewFeedback($commentId: ID!, $feedback: CopilotCodeReviewFeedbackType!, $feedbackChoice: [CopilotCodeReviewFeedbackOption!], $textResponse: String) { provideCopilotCodeReviewFeedback(input: { commentId: $commentId feedback: $feedback feedbackChoice: $feedbackChoice textResponse: $textResponse } ) { comment { id __typename } } }";
    }

    public final String name() {
        return "ProvideCopilotCodeReviewFeedback";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("commentId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("feedback");
        fVar.I(this.s.r);
        fVar.z0("feedbackChoice");
        aa.c.d(aa.c.b(aa.c.a(n10.a.n))).d(fVar, wVar, this.t);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("textResponse");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return "ProvideCopilotCodeReviewFeedbackMutation(commentId=" + this.r + ", feedback=" + this.s + ", feedbackChoice=" + this.t + ", textResponse=" + this.u + ")";
    }
}
