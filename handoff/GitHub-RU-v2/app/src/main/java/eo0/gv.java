package eo0;

import java.util.List;
import jn0.y80;
import jn0.z80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gv implements aaShadow.a {
    public static final gv a = new gv();
    public static final List b = sy.d0.n("unminimizedComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z80 z80Var = null;
        while (eVar.r0(b) == 0) {
            z80Var = (z80) aa.c.b(aa.c.c(hv.a, true)).a(eVar, wVar);
        }
        return new y80(z80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y80 y80Var = (y80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y80Var, "value");
        fVar.z0("unminimizedComment");
        aa.c.b(aa.c.c(hv.a, true)).b(fVar, wVar, y80Var.a);
    }
}
