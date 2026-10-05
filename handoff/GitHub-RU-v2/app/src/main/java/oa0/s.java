package oa0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s implements aa.a {
    public static final s a = new s();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        na0.d0 d0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        na0.b0 b0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            d0Var = w.c(eVar, wVar);
        } else {
            d0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            b0Var = u.c(eVar, wVar);
        }
        return new na0.z(str, d0Var, b0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.z zVar = (na0.z) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, zVar.a);
        na0.d0 d0Var = zVar.b;
        if (d0Var != null) {
            w.d(fVar, wVar, d0Var);
        }
        na0.b0 b0Var = zVar.c;
        if (b0Var != null) {
            u.d(fVar, wVar, b0Var);
        }
    }
}
