package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tz implements aaShadow.w0 {
    public static final pz Companion = new pz();
    public String r;
    public String s;

    public tz(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.i4.a;
        List list2 = kz0.i4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz)) {
            return false;
        }
        tz tzVar = (tz) obj;
        return k71.k.b(this.r, tzVar.r) && k71.k.b(this.s, tzVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.xo.a, false);
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
