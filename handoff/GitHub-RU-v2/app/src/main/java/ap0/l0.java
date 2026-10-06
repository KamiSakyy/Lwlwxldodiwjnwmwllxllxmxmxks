package ap0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l0 implements aa.a {
    public static final l0 a = new l0();
    public static final List b = sy.d0Shadow.n("__typename");

    public static i0 c(ea.e eVar, aa.w wVar) {
        g0 g0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        h0 h0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            g0Var = m0.c(eVar, wVar);
        } else {
            g0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DiscussionComment"}), set2, str, set)) {
            eVar.s0();
            h0Var = n0.c(eVar, wVar);
        }
        return new i0(str, g0Var, h0Var);
    }

    public static void d(ea.f fVar, aa.w wVar, i0 i0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, i0Var.a);
        g0 g0Var = i0Var.b;
        if (g0Var != null) {
            m0.d(fVar, wVar, g0Var);
        }
        h0 h0Var = i0Var.c;
        if (h0Var != null) {
            n0.d(fVar, wVar, h0Var);
        }
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (i0) obj);
    }
}
