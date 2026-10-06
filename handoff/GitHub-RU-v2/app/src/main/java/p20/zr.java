package p20;

import java.util.List;
import u10.l40;
import u10.p40;
import u10.u40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zr implements aaShadow.a {
    public static final zr a = new zr();
    public static final List b = sy.d0.o("actor", "issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l40 l40Var = null;
        p40 p40Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l40Var = (l40) aa.c.b(aa.c.c(rr.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new u40(l40Var, p40Var);
                }
                p40Var = (p40) aa.c.b(aa.c.c(ur.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u40 u40Var = (u40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u40Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(rr.a, true)).b(fVar, wVar, u40Var.a);
        fVar.z0("issue");
        aa.c.b(aa.c.c(ur.a, true)).b(fVar, wVar, u40Var.b);
    }
}
