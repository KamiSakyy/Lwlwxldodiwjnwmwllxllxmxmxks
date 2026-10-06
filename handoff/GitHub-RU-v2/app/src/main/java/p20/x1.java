package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x1 implements aaShadow.a {
    public static final x1 a = new x1();
    public static final List b = sy.d0Shadow.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.m3 m3Var = null;
        while (eVar.r0(b) == 0) {
            m3Var = (u10.m3) aa.c.c(b2.a, false).a(eVar, wVar);
        }
        if (m3Var != null) {
            return new u10.i3(m3Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.i3 i3Var = (u10.i3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i3Var, "value");
        fVar.z0("viewer");
        aa.c.c(b2.a, false).b(fVar, wVar, i3Var.a);
    }
}
