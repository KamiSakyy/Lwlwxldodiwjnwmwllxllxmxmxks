package p20;

import java.util.List;
import u10.f20;
import u10.i20;
import u10.j20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hq implements aaShadow.a {
    public static final hq a = new hq();
    public static final List b = sy.d0Shadow.o("actor", "unlockedRecord");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f20 f20Var = null;
        j20 j20Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                f20Var = (f20) aa.c.b(aa.c.c(fq.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new i20(f20Var, j20Var);
                }
                j20Var = (j20) aa.c.b(aa.c.c(iq.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i20 i20Var = (i20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i20Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(fq.a, true)).b(fVar, wVar, i20Var.a);
        fVar.z0("unlockedRecord");
        aa.c.b(aa.c.c(iq.a, true)).b(fVar, wVar, i20Var.b);
    }
}
