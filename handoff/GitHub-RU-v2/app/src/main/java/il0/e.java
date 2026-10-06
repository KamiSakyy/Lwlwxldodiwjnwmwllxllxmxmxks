package il0;

import aa.n0;
import aa.p0;
import aa.q0;
import gn0.d6;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements n0 {
    public static final a Companion = new a();
    public d6 r;

    public e(d6 d6Var) {
        this.r = d6Var;
    }

    public final aa.m d() {
        wh.Companion.getClass();
        q0 q0Var = wh.e1;
        k71.k.g(q0Var, "type");
        List list = kl0.a.a;
        List list2 = kl0.a.a;
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
        return aa.c.c(jl0.b.a, false);
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
        aa.c.c(hn0.a.h, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "CreateNewListMutation(input=" + this.r + ")";
    }

    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
