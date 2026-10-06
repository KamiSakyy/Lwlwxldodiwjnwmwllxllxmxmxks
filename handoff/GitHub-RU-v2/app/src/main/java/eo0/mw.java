package eo0;

import java.util.List;
import jn0.ra0;
import jn0.ua0;
import jn0.wa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mw implements aaShadow.a {
    public static final mw a = new mw();
    public static final List b = sy.d0Shadow.o(new String[]{"actor", "issue"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ra0 ra0Var = null;
        ua0 ua0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ra0Var = (ra0) aa.c.b(aa.c.c(iw.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new wa0(ra0Var, ua0Var);
                }
                ua0Var = (ua0) aa.c.b(aa.c.c(kw.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wa0 wa0Var = (wa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wa0Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(iw.a, true)).b(fVar, wVar, wa0Var.a);
        fVar.z0("issue");
        aa.c.b(aa.c.c(kw.a, true)).b(fVar, wVar, wa0Var.b);
    }
}
