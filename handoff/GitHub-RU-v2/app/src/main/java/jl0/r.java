package jl0;

import aa.w;
import il0.c0;
import java.util.List;
import oj0.a4;
import oj0.f4;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = d0Shadow.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        a4 a4Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            f4 f4Var = f4.a;
            a4Var = f4.c(eVar, wVar);
        }
        return new c0(str, a4Var);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c0 c0Var = (c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, c0Var.a);
        a4 a4Var = c0Var.b;
        if (a4Var != null) {
            f4 f4Var = f4.a;
            f4.d(fVar, wVar, a4Var);
        }
    }
}
