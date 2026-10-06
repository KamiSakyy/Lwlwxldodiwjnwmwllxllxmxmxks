package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t2 implements aaShadow.n0 {
    public static final r2 Companion = new r2();
    public String r;

    public t2(String str) {
        k71.k.g(str, "pull_id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.p.a;
        List list2 = h10.p.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2) && k71.k.b(this.r, ((t2) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.n1.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "afa9a4980554f8be9be63b1bc167fc9decaf025a353379c4aebcbdf7ed2c3f4c";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ApproveActionRequiredRunsMutation($pull_id: ID!) { approveActionRequiredWorkflowRuns(input: { pullRequestId: $pull_id } ) { clientMutationId } }";
    }

    public final String name() {
        return "ApproveActionRequiredRunsMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("pull_id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("ApproveActionRequiredRunsMutation(pull_id=", this.r, ")");
    }
}
