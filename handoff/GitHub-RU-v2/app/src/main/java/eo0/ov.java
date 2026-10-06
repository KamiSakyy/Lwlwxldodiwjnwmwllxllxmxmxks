package eo0;

import java.util.List;
import jn0.j90;
import jn0.k90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ov implements aaShadow.a {
    public static final ov a = new ov();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j90 j90Var = null;
        while (eVar.r0(b) == 0) {
            j90Var = (j90) aa.c.b(aa.c.c(nv.a, true)).a(eVar, wVar);
        }
        return new k90(j90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k90 k90Var = (k90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k90Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(nv.a, true)).b(fVar, wVar, k90Var.a);
    }
}
