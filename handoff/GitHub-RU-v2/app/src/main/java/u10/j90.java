package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j90 implements aaShadow.w0 {
    public static final d90 Companion = new d90();
    public String r;
    public aa.u0 s;

    public j90(aa.u0 u0Var, String str) {
        k71.k.g(str, "login");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.c6.a;
        List list2 = fc0.c6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j90)) {
            return false;
        }
        j90 j90Var = (j90) obj;
        if (!k71.k.b(this.r, j90Var.r) || !this.s.equals(j90Var.s)) {
            return false;
        }
        Object obj2 = aa.t0.d;
        return obj2.equals(obj2);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.yu.a, false);
    }

    public final int hashCode() {
        return aa.t0.d.hashCode() + jo.f4.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "b6d679f81e69d9c858234aaf0c32a50379b292fd689ce40ae3baa4b6ece2f267";
    }

    public final String j() {
        Companion.getClass();
        return "query UserLists($login: String!, $first: Int, $after: String) { user(login: $login) { id hasCreatedLists suggestedListNames { id name } lists(first: $first, after: $after) { nodes { __typename ...UserListFragment id } } __typename } }  fragment UserListFragment on UserList { id name isPrivate description items { totalCount } slug __typename }";
    }

    public final String name() {
        return "UserLists";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        aa.c.d(aa.c.b(y20.a.a)).d(fVar, wVar, this.s);
    }

    public final String toString() {
        StringBuilder t = jo.f4.t(this.s, "UserListsQuery(login=", this.r, ", first=", ", after=");
        t.append(aa.t0.d);
        t.append(")");
        return t.toString();
    }
}
