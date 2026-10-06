package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ql implements aaShadow.a {
    public static final ql a = new ql();
    public static final List b = sy.d0Shadow.n("deleteUserDashboardPin");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.hv hvVar = null;
        while (eVar.r0(b) == 0) {
            hvVar = (jo.hv) aa.c.b(aa.c.c(rl.a, false)).a(eVar, wVar);
        }
        return new jo.gv(hvVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.gvShadow gvVar = (jo.gv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gvVar, "value");
        fVar.z0("deleteUserDashboardPin");
        aa.c.b(aa.c.c(rl.a, false)).b(fVar, wVar, gvVar.a);
    }
}
