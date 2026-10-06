package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z5 implements aaShadow.a {
    public static final z5 a = new z5();
    public static final List b = sy.d0Shadow.n("deleteMobileDeviceToken");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.d9 d9Var = null;
        while (eVar.r0(b) == 0) {
            d9Var = (jn0.d9) aa.c.b(aa.c.c(a6.a, false)).a(eVar, wVar);
        }
        return new jn0.c9(d9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.c9 c9Var = (jn0.c9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c9Var, "value");
        fVar.z0("deleteMobileDeviceToken");
        aa.c.b(aa.c.c(a6.a, false)).b(fVar, wVar, c9Var.a);
    }
}
