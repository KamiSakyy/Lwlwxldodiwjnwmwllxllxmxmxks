package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xm implements aaShadow.w0 {
    public static final rm Companion = new rm();
    public String r;
    public aa1.b s;
    public aa1.b t;

    public xm(String str, aa1.b bVar, aa1.b bVar2) {
        k71.k.g(str, "login");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.t2.a;
        List list2 = en0.t2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm)) {
            return false;
        }
        xm xmVar = (xm) obj;
        return k71.k.b(this.r, xmVar.r) && k71.k.b(this.s, xmVar.s) && k71.k.b(this.t, xmVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ef.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "1d5ca219560ecf1b36c738add5ff71b2b83f001d8cbf930b0e97e57a9830bae7";
    }

    public final String j() {
        Companion.getClass();
        return "query OrganizationTeams($login: String!, $query: String, $after: String) { organization(login: $login) { teams(first: 50, query: $query, orderBy: { field: NAME direction: ASC } , after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename id name avatarUrl } } id __typename } }";
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
