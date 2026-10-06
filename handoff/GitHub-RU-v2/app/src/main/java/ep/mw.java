package ep;

import java.util.List;
import jo.na0;
import jo.ra0;
import jo.sa0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mw implements aaShadow.a {
    public static final mw a = new mw();
    public static final List b = sy.d0.o("actor", "unlockedRecord");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        na0 na0Var = null;
        sa0 sa0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                na0Var = (na0) aa.c.b(aa.c.c(jw.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new ra0(na0Var, sa0Var);
                }
                sa0Var = (sa0) aa.c.b(aa.c.c(nw.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ra0 ra0Var = (ra0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ra0Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(jw.a, true)).b(fVar, wVar, ra0Var.a);
        fVar.z0("unlockedRecord");
        aa.c.b(aa.c.c(nw.a, true)).b(fVar, wVar, ra0Var.b);
    }
}
