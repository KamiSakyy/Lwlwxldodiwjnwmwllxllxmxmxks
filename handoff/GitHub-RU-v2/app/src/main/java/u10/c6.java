package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c6 implements aaShadow.n0 {
    public static final z5 Companion = new z5();
    public hc0.y4 r;

    public c6(hc0.y4 y4Var) {
        this.r = y4Var;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.b0.a;
        List list2 = fc0.b0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6) && k71.k.b(this.r, ((c6) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.y3.a, false);
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
        aa.c.c(ic0.a.e, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateCommitOnBranchMutation(input=" + this.r + ")";
    }
}
