package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class po implements aaShadow.w0 {
    public static final joShadow Companion = new joShadow();
    public String r;
    public aa1.b s;
    public aa1.b t;

    public po(String str, aa1.b bVar, aa1.b bVar2) {
        k71.k.g(str, "login");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.z2.a;
        List list2 = kz0.z2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po)) {
            return false;
        }
        po poVar = (po) obj;
        return k71.k.b(this.r, poVar.r) && k71.k.b(this.s, poVar.s) && k71.k.b(this.t, poVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.kg.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "1951104ec45309ee0cb2653ee67c6e0fa4b0840c5a4aac3b0b5f9fe0ca92e506";
    }

    public final String j() {
        Companion.getClass();
        return "query OrganizationTeams($login: String!, $query: String, $after: String) { organization(login: $login) { teams(first: 50, query: $query, orderBy: { field: NAME direction: ASC } , after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename id name avatarUrl } } id __typename } id __typename }";
    }

    public final String name() {
        return "OrganizationTeams";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        return f1.e.k(f1.e.o(this.s, "OrganizationTeamsQuery(login=", this.r, ", query=", ", after="), this.t, ")");
    }
}
