package oa0;

import java.util.List;
import na0.k0;
import na0.o0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aa.a {
    public static final b0 a = new b0();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        o0 o0Var = null;
        while (eVar.r0(b) == 0) {
            o0Var = (o0) aa.c.b(aa.c.c(f0.a, false)).a(eVar, wVar);
        }
        return new k0(o0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k0 k0Var = (k0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k0Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(f0.a, false)).b(fVar, wVar, k0Var.a);
    }
}
