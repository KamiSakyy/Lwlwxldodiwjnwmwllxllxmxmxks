package my;

import aa.w;
import dw.k7;
import dw.p7;
import java.util.List;
import ly.c0;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        k7 k7Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            p7 p7Var = p7.a;
            k7Var = p7.c(eVar, wVar);
        }
        return new c0(str, k7Var);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c0 c0Var = (c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, c0Var.a);
        k7 k7Var = c0Var.b;
        if (k7Var != null) {
            p7 p7Var = p7.a;
            p7.d(fVar, wVar, k7Var);
        }
    }
}
