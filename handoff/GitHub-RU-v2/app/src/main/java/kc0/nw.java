package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nw implements aaShadow.w0 {
    public static final kw Companion = new kw();
    public final String r;
    public final String s;

    public nw(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.z3.a;
        List list2 = en0.z3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw)) {
            return false;
        }
        nw nwVar = (nw) obj;
        return k71.k.b(this.r, nwVar.r) && k71.k.b(this.s, nwVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.km.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "5c2ac3b58f8bafde1ab53dcbd47f6ae7271d22666755d65c0151d6d55385bc36";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryId($owner: String!, $name: String!) { repository(owner: $owner, name: $name) { id __typename } }";
    }

    public final String name() {
        return "RepositoryId";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("RepositoryIdQuery(owner=", this.r, ", name=", this.s, ")");
    }
}
