package iy0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b1 implements aa.a {
    public static final List a = sy.d0Shadow.n("__typename");

    public static t0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        w c = x.c(eVar, wVar);
        if (str != null) {
            return new t0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, t0 t0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, t0Var.a);
        List list = xShadow.a;
        x.d(fVar, wVar, t0Var.b);
    }
}
