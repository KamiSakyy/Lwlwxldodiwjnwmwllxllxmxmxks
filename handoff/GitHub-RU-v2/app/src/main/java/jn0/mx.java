package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mx implements aaShadow.w0 {
    public static final jx Companion = new jx();
    public String r;
    public String s;
    public String t;

    public mx(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "qualifiedName");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.b4.a;
        List list2 = kz0.b4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx)) {
            return false;
        }
        mx mxVar = (mx) obj;
        return k71.k.b(this.r, mxVar.r) && k71.k.b(this.s, mxVar.s) && k71.k.b(this.t, mxVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.fn.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "5ae09a806fd543eb1292e24076f84a964e68c6a74e62badf03b49510957fbd93";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryBranch($owner: String!, $name: String!, $qualifiedName: String!) { repository(owner: $owner, name: $name) { id branchInfo: ref(qualifiedName: $qualifiedName) { __typename ...RepositoryBranchInfoFragment id } __typename } id __typename }  fragment RepositoryBranchInfoFragment on Ref { id name viewerCanCommitToBranch target { __typename id ... on Commit { oid statusCheckRollup { state id __typename } } } __typename }";
    }

    public final String name() {
        return "RepositoryBranch";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("qualifiedName");
        bVar.b(fVar, wVar, this.t);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("RepositoryBranchQuery(owner=", this.r, ", name=", this.s, ", qualifiedName="), this.t, ")");
    }
}
