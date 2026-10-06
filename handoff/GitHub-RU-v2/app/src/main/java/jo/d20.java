package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d20 implements aaShadow.w0 {
    public static final a20 Companion = new a20();
    public final String r;
    public final String s;

    public d20(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.r4.a;
        List list2 = h10.r4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d20)) {
            return false;
        }
        d20 d20Var = (d20) obj;
        return k71.k.b(this.r, d20Var.r) && k71.k.b(this.s, d20Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.pq.a, false);
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
