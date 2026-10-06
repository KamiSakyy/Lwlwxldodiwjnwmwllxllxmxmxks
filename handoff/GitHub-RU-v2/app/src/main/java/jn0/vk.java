package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vk implements aaShadow.n0 {
    public static final sk Companion = new sk();
    public List r;

    public vk(List list) {
        k71.k.g(list, "ids");
        this.r = list;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.k2.a;
        List list2 = kz0.k2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk) && k71.k.b(this.r, ((vk) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.xd.a, false);
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
