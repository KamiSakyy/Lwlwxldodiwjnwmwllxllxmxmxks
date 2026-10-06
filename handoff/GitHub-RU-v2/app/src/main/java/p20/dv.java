package p20;

import java.util.List;
import u10.l90;
import u10.m90;
import u10.n90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dv implements aaShadow.a {
    public static final dv a = new dv();
    public static final List b = sy.d0.o("user", "organization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        n90 n90Var = null;
        m90 m90Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                n90Var = (n90) aa.c.b(aa.c.c(fv.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new l90(n90Var, m90Var);
                }
                m90Var = (m90) aa.c.b(aa.c.c(ev.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l90 l90Var = (l90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l90Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(fv.a, true)).b(fVar, wVar, l90Var.a);
        fVar.z0("organization");
        aa.c.b(aa.c.c(ev.a, true)).b(fVar, wVar, l90Var.b);
    }
}
