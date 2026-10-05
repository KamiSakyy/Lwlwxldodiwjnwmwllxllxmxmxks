package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ej implements aa.n0 {
    public static final bj Companion = new bj();
    public final List r;

    public ej(List list) {
        k71.k.g(list, "ids");
        this.r = list;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.e2.a;
        List list2 = en0.e2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ej) && k71.k.b(this.r, ((ej) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.sc.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "9751d429d052f3c19053da3e8d32812b85690c207e569cad98a34efc42c28246";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationsAsRead($ids: [ID!]!) { markNotificationsAsRead(input: { ids: $ids } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationsAsRead";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ids");
        aa.c.a(aa.c.a).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.h("MarkNotificationsAsReadMutation(ids=", ")", this.r);
    }
}
