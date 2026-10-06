package p20;

import java.util.List;
import u10.y40;
import u10.z40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cs implements aaShadow.a {
    public static final cs a = new cs();
    public static final List b = sy.d0Shadow.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y40 y40Var = null;
        while (eVar.r0(b) == 0) {
            y40Var = (y40) aa.c.b(aa.c.c(bs.a, false)).a(eVar, wVar);
        }
        return new z40(y40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z40 z40Var = (z40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z40Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(bs.a, false)).b(fVar, wVar, z40Var.a);
    }
}
