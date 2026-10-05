package d20;

import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import hc0.pm;
import java.util.List;
import k71.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements w0 {
    public static final k Companion = new k();

    public final aa.m d() {
        pm.Companion.getClass();
        q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = f20.c.a;
        List list2 = f20.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == m.class;
    }

    public final p0 g() {
        return aa.c.c(e20.g.a, false);
    }

    public final int hashCode() {
        return x.a(m.class).hashCode();
    }

    public final String i() {
        return "1a5b8337560741bc6d794da6560b31a4b023c9381d29af83a2a193698fb34794";
    }

    public final String j() {
        Companion.getClass();
        return "query MobileUpdatesUrl { mobileUpdatesUrl }";
    }

    public final String name() {
        return "MobileUpdatesUrl";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p0<T1,T2,T3,T4> {
        public p0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
