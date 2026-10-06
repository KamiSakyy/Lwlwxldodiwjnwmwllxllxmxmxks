package cq;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 implements aa.a {
    public static final t0 a = new t0();
    public static final List b = sy.d0Shadow.n("__typename");

    public static q0 c(ea.e eVar, aa.w wVar) {
        o0 o0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        p0 p0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            o0Var = u0.c(eVar, wVar);
        } else {
            o0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DiscussionComment"}), set2, str, set)) {
            eVar.s0();
            p0Var = v0.c(eVar, wVar);
        }
        return new q0(str, o0Var, p0Var);
    }

    public static void d(ea.f fVar, aa.w wVar, q0 q0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q0Var.a);
        o0 o0Var = q0Var.b;
        if (o0Var != null) {
            u0.d(fVar, wVar, o0Var);
        }
        p0 p0Var = q0Var.c;
        if (p0Var != null) {
            v0.d(fVar, wVar, p0Var);
        }
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (q0) obj);
    }
}
