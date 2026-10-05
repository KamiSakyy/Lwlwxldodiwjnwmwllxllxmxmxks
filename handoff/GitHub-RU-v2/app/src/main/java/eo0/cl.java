package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cl implements aa.a {
    public static final cl a = new cl();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        ap0.l0 l0Var = ap0.l0.a;
        ap0.i0 c = ap0.l0.c(eVar, wVar);
        if (str != null) {
            return new jn0.nu(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.nu nuVar = (jn0.nu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nuVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, nuVar.a);
        ap0.l0 l0Var = ap0.l0.a;
        ap0.l0.d(fVar, wVar, nuVar.b);
    }
}
