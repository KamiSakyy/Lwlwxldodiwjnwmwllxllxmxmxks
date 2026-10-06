package eo0;

import java.util.List;
import jn0.f40;
import jn0.g40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bs implements aaShadow.a {
    public static final bs a = new bs();
    public static final List b = sy.d0.n("labelableRecord");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f40 f40Var = null;
        while (eVar.r0(b) == 0) {
            f40Var = (f40) aa.c.b(aa.c.c(as.a, true)).a(eVar, wVar);
        }
        return new g40(f40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g40 g40Var = (g40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g40Var, "value");
        fVar.z0("labelableRecord");
        aa.c.b(aa.c.c(as.a, true)).b(fVar, wVar, g40Var.a);
    }
}
