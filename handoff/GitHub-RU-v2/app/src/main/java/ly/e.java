package ly;

import aa.n0;
import aa.p0;
import aa.q0;
import java.util.List;
import m10.vp;
import m10.y9;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements n0 {
    public static final a Companion = new a();
    public y9 r;

    public e(y9 y9Var) {
        this.r = y9Var;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = ny.a.a;
        List list2 = ny.a.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(this.r, ((e) obj).r);
    }

    public final p0 g() {
        return aa.c.c(my.b.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "ac115ea13a8a61332e2ab9ca27a2f29e2632082e0ab1f14d40188db4003936a9";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateNewList($input: CreateUserListInput!) { createUserList(input: $input) { list { __typename ...UserListFragment id } } }  fragment UserListFragment on UserList { id name isPrivate description items { totalCount } slug __typename }";
    }

    public final String name() {
        return "CreateNewList";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(n10.a.t, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateNewListMutation(input=" + this.r + ")";
    }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
