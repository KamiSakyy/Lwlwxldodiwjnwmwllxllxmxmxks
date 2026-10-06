package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d00 implements aaShadow.w0 {
    public static final a00 Companion = new a00();
    public final String r;
    public final String s;

    public d00(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.k4.a;
        List list2 = kz0.k4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d00)) {
            return false;
        }
        d00 d00Var = (d00) obj;
        return k71.k.b(this.r, d00Var.r) && k71.k.b(this.s, d00Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ep.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "31c0f85c5ccd6d188e9d1cf70932f632bfa65dd918e83bffebe194eacbbbeb6a";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryId($owner: String!, $name: String!) { repository(owner: $owner, name: $name) { id __typename } id __typename }";
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
