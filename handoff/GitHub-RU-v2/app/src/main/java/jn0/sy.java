package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sy implements aaShadow.w0 {
    public static final ly Companion = new ly();
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final aa1.b v;

    public sy(aa1.b bVar, String str, String str2, String str3, String str4) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        k71.k.g(str3, "baseRefName");
        k71.k.g(str4, "headRefName");
        k71.k.g(bVar, "after");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.f4.a;
        List list2 = kz0.f4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy)) {
            return false;
        }
        sy syVar = (sy) obj;
        return k71.k.b(this.r, syVar.r) && k71.k.b(this.s, syVar.s) && k71.k.b(this.t, syVar.t) && k71.k.b(this.u, syVar.u) && k71.k.b(this.v, syVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ao.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + a0.s0.b(30, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31), 31);
    }

    public final String i() {
        return "f723346b99aa966238db4ae77e56cf0ab77b26f80aebd6bd997d29196dd9ec6c";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryCompareRefsCommitList($ownerName: String!, $repoName: String!, $baseRefName: String!, $headRefName: String!, $first: Int!, $after: String) { repository(owner: $ownerName, name: $repoName) { id comparison: ref(qualifiedName: $baseRefName) { id compare(headRef: $headRefName) { id commits: commits(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename id ...commitFields } } __typename } __typename } __typename } id __typename }  fragment commitFields on Commit { id committedDate messageHeadline committedViaWeb authoredByCommitter abbreviatedOid committer { __typename avatarUrl name user { login id __typename } } author { __typename avatarUrl name user { __typename login id } } statusCheckRollup { id state __typename } __typename }";
    }

    public final String name() {
        return "RepositoryCompareRefsCommitList";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ownerName");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repoName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("headRefName");
        bVar.b(fVar, wVar, this.u);
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.v;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryCompareRefsCommitListQuery(ownerName=", this.r, ", repoName=", this.s, ", baseRefName=");
        f1.e.x(o, this.t, ", headRefName=", this.u, ", first=30, after=");
        return f1.e.k(o, this.v, ")");
    }
}
