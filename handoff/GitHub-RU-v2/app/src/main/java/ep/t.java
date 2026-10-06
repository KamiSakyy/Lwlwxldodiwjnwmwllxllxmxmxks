package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t implements aaShadow.a {
    public static final t a = new t();
    public static final List b = sy.d0Shadow.n("createUserDashboardPin");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.d0 d0Var = null;
        while (eVar.r0(b) == 0) {
            d0Var = (jo.d0) aa.c.b(aa.c.c(s.a, false)).a(eVar, wVar);
        }
        return new jo.e0(d0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.e0 e0Var = (jo.e0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("createUserDashboardPin");
        aa.c.b(aa.c.c(s.a, false)).b(fVar, wVar, e0Var.a);
    }
}
