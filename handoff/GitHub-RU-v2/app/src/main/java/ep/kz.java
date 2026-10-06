package ep;

import java.util.List;
import jo.te0;
import jo.xe0;
import jo.ye0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kz implements aaShadow.a {
    public static final kz a = new kz();
    public static final List b = sy.d0.o("actor", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        te0 te0Var = null;
        xe0 xe0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                te0Var = (te0) aa.c.b(aa.c.c(gz.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new ye0(te0Var, xe0Var);
                }
                xe0Var = (xe0) aa.c.b(aa.c.c(jz.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ye0 ye0Var = (ye0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ye0Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(gz.a, true)).b(fVar, wVar, ye0Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(jz.a, true)).b(fVar, wVar, ye0Var.b);
    }
}
