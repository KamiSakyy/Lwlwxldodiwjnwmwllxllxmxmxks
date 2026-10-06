package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i2 implements aaShadow.n0 {
    public static final g2 Companion = new g2();
    public String r;

    public i2(String str) {
        k71.k.g(str, "pull_id");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.n.a;
        List list2 = en0.n.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2) && k71.k.b(this.r, ((i2) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.g1.a, false);
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
