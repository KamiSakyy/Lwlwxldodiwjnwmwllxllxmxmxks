package mo;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 implements aa.a {
    public static final o1 a = new o1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        s sVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        j jVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            sVar = a1.c(eVar, wVar);
        } else {
            sVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            jVar = r0.c(eVar, wVar);
        }
        return new g0(str, sVar, jVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g0 g0Var = (g0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, g0Var.a);
        s sVar = g0Var.b;
        if (sVar != null) {
            a1.d(fVar, wVar, sVar);
        }
        j jVar = g0Var.c;
        if (jVar != null) {
            r0.d(fVar, wVar, jVar);
        }
    }
}
