package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j7 implements aaShadow.n0 {
    public static final g7 Companion = new g7();
    public m10.x8 r;

    public j7(m10.x8 x8Var) {
        this.r = x8Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.f0.a;
        List list2 = h10.f0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7) && k71.k.b(this.r, ((j7) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.w4.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "3e360571673e5ed7d3c1a2555af10c5e75ef4f2b7f61110741b6c542dea34d1f";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateCommitOnBranch($input: CreateCommitOnBranchInput!) { createCommitOnBranch(input: $input) { commit { __typename ...CommitDiffEntryFragment id } } }  fragment CommitDiffEntryFragment on Commit { id abbreviatedOid oid messageHeadline messageBody __typename }";
    }

    public final String name() {
        return "CreateCommitOnBranch";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(n10.a.q, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateCommitOnBranchMutation(input=" + this.r + ")";
    }
}
