package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xh0 implements aaShadow.w0 {
    public static final rh0 Companion = new rh0();
    public String r;
    public aa.u0 s;

    public xh0(aa.u0 u0Var, String str) {
        k71.k.g(str, "login");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.g7.a;
        List list2 = h10.g7.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh0)) {
            return false;
        }
        xh0 xh0Var = (xh0) obj;
        if (!k71.k.b(this.r, xh0Var.r) || !this.s.equals(xh0Var.s)) {
            return false;
        }
        Object obj2 = aa.t0.d;
        return obj2.equals(obj2);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.e10.a, false);
    }

    public final int hashCode() {
        return aa.t0.d.hashCode() + f4.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "830b01fc82bca681451689481ef34b18650ed76fb745505f4f3488c966e2c913";
    }

    public final String j() {
        Companion.getClass();
        return "query UserLists($login: String!, $first: Int, $after: String) { user(login: $login) { id hasCreatedLists suggestedListNames { id name } lists(first: $first, after: $after) { nodes { __typename ...UserListFragment id } } __typename } id __typename }  fragment UserListFragment on UserList { id name isPrivate description items { totalCount } slug __typename }";
    }

    public final String name() {
        return "UserLists";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        aa.c.d(aa.c.b(tp.a.a)).d(fVar, wVar, this.s);
    }

    public final String toString() {
        StringBuilder t = f4.t(this.s, "UserListsQuery(login=", this.r, ", first=", ", after=");
        t.append(aa.t0.d);
        t.append(")");
        return t.toString();
    }
}
