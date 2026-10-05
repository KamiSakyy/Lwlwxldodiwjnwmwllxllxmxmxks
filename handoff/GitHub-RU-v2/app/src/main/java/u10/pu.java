package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pu implements aa.w0 {
    public static final lu Companion = new lu();
    public final String r;
    public final String s;

    public pu(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.s3.a;
        List list2 = fc0.s3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu)) {
            return false;
        }
        pu puVar = (pu) obj;
        return k71.k.b(this.r, puVar.r) && k71.k.b(this.s, puVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.zk.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "9d15c0d236dfee69b068874d0300226dd06eeac196c25c04b86d244500dab428";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryDefaultBranch($owner: String!, $repo: String!) { repository(owner: $owner, name: $repo) { defaultBranchRef { __typename ...RepoBranchFragment id } id __typename } }  fragment RepoBranchFragment on Ref { id name target { id oid } repository { id __typename } __typename }";
    }

    public final String name() {
        return "RepositoryDefaultBranch";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repo");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("RepositoryDefaultBranchQuery(owner=", this.r, ", repo=", this.s, ")");
    }
}
