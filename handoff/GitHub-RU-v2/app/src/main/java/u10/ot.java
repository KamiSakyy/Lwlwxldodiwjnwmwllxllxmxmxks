package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ot implements aaShadow.w0 {
    public static final lt Companion = new lt();
    public final String r;
    public final String s;
    public final String t;

    public ot(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "qualifiedName");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.o3.a;
        List list2 = fc0.o3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot)) {
            return false;
        }
        ot otVar = (ot) obj;
        return k71.k.b(this.r, otVar.r) && k71.k.b(this.s, otVar.s) && k71.k.b(this.t, otVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.hk.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "0570e048562a93b6b3a3a47aada7a7d3298efba4664636bd5b6e8a9600c72703";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryBranch($owner: String!, $name: String!, $qualifiedName: String!) { repository(owner: $owner, name: $name) { id branchInfo: ref(qualifiedName: $qualifiedName) { __typename ...RepositoryBranchInfoFragment id } __typename } }  fragment RepositoryBranchInfoFragment on Ref { id name viewerCanCommitToBranch target { __typename id ... on Commit { oid statusCheckRollup { state id __typename } } } __typename }";
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
