package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x5 implements aa.a {
    public static final x5 a = new x5();
    public static final List b = sy.d0.n("createDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.v8 v8Var = null;
        while (eVar.r0(b) == 0) {
            v8Var = (jo.v8) aa.c.b(aa.c.c(v5.a, false)).a(eVar, wVar);
        }
        return new jo.x8(v8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.x8 x8Var = (jo.x8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x8Var, "value");
        fVar.z0("createDashboardSearchShortcut");
        aa.c.b(aa.c.c(v5.a, false)).b(fVar, wVar, x8Var.a);
    }
}
