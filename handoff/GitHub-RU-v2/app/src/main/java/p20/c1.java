package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 implements aaShadow.a {
    public static final c1 a = new c1();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        la0.e eVar2 = la0.e.a;
        la0.c c = la0.e.c(eVar, wVar);
        if (str != null) {
            return new u10.z1(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.z1 z1Var = (u10.z1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, z1Var.a);
        la0.e eVar = la0.e.a;
        la0.e.d(fVar, wVar, z1Var.b);
    }
}
