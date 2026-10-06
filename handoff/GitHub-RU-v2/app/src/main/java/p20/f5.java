package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f5 implements aaShadow.a {
    public static final f5 a = new f5();
    public static final List b = sy.d0.n("deleteMobileDeviceToken");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.b8 b8Var = null;
        while (eVar.r0(b) == 0) {
            b8Var = (u10.b8) aa.c.b(aa.c.c(g5.a, false)).a(eVar, wVar);
        }
        return new u10.a8(b8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.a8 a8Var = (u10.a8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a8Var, "value");
        fVar.z0("deleteMobileDeviceToken");
        aa.c.b(aa.c.c(g5.a, false)).b(fVar, wVar, a8Var.a);
    }
}
