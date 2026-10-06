package uw0;

import aa.n0;
import aa.p0;
import aa.q0;
import java.util.List;
import pz0.sk;
import pz0.u6;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements n0 {
    public static final a Companion = new a();
    public u6 r;

    public e(u6 u6Var) {
        this.r = u6Var;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = ww0.a.a;
        List list2 = ww0.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(this.r, ((e) obj).r);
    }

    public final p0 g() {
        return aa.c.c(vw0.b.a, false);
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
        aa.c.c(qz0.a.i, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateNewListMutation(input=" + this.r + ")";
    }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
    public Object m(Object p1, Object p2, Object p3) { return null; }
}
