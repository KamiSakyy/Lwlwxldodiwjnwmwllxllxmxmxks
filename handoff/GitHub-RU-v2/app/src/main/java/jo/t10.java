package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t10 implements aa.w0 {
    public static final p10 Companion = new p10();
    public final String r;
    public final String s;

    public t10(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.p4.a;
        List list2 = h10.p4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t10)) {
            return false;
        }
        t10 t10Var = (t10) obj;
        return k71.k.b(this.r, t10Var.r) && k71.k.b(this.s, t10Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.iq.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "e147460705560dd10a69cea04155ceffa2623db5c516a9dbd757a07d263204ec";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryDefaultBranch($owner: String!, $repo: String!) { repository(owner: $owner, name: $repo) { defaultBranchRef { __typename ...RepoBranchFragment id } id __typename } id __typename }  fragment RepoBranchFragment on Ref { id name target { id oid } repository { id __typename } __typename }";
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
