package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z6 implements aa.n0 {
    public static final w6 Companion = new w6();
    public final pz0.x5 r;

    public z6(pz0.x5 x5Var) {
        this.r = x5Var;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.e0.a;
        List list2 = kz0.e0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6) && k71.k.b(this.r, ((z6) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.p4.a, false);
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
        aa.c.c(qz0.a.f, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateCommitOnBranchMutation(input=" + this.r + ")";
    }
}
