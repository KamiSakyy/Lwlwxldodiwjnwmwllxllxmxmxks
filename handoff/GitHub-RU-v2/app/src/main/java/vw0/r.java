package vw0;

import aa.w;
import java.util.List;
import sy.d0;
import uu0.o6;
import uu0.t6;
import uw0.c0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        o6 o6Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            t6 t6Var = t6.a;
            o6Var = t6.c(eVar, wVar);
        }
        return new c0(str, o6Var);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c0 c0Var = (c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, c0Var.a);
        o6 o6Var = c0Var.b;
        if (o6Var != null) {
            t6 t6Var = t6.a;
            t6.d(fVar, wVar, o6Var);
        }
    }
}
