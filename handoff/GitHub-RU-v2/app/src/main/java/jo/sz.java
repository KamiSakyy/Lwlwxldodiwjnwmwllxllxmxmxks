package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sz implements aaShadow.w0 {
    public static final pz Companion = new pz();
    public String r;
    public String s;
    public String t;

    public sz(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "qualifiedName");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.j4.a;
        List list2 = h10.j4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz)) {
            return false;
        }
        sz szVar = (sz) obj;
        return k71.k.b(this.r, szVar.r) && k71.k.b(this.s, szVar.s) && k71.k.b(this.t, szVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.uo.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "5a18547ac2b80e54055683ae9285ac5a680e83fa4c2c89b7cfeba25ce04cc33c";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryBranchWithRepoPermissions($owner: String!, $name: String!, $qualifiedName: String!) { repository(owner: $owner, name: $name) { id viewerCanPush branchInfo: ref(qualifiedName: $qualifiedName) { __typename ...RepositoryBranchInfoFragment id } __typename } id __typename }  fragment RepositoryBranchInfoFragment on Ref { id name viewerCanCommitToBranch target { __typename id ... on Commit { oid statusCheckRollup { state id __typename } } } __typename }";
    }

    public final String name() {
        return "RepositoryBranchWithRepoPermissions";
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
        return com.github.rudroid.copilot.h1.p(a0.s0.o("RepositoryBranchWithRepoPermissionsQuery(owner=", this.r, ", name=", this.s, ", qualifiedName="), this.t, ")");
    }
}
