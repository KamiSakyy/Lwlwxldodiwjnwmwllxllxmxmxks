package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k6 implements aaShadow.n0 {
    public static final h6 Companion = new h6();
    public gn0.i5 r;

    public k6(gn0.i5 i5Var) {
        this.r = i5Var;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.c0.a;
        List list2 = en0.c0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6) && k71.k.b(this.r, ((k6) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.e4.a, false);
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
        aa.c.c(hn0.a.e, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateCommitOnBranchMutation(input=" + this.r + ")";
    }
}
