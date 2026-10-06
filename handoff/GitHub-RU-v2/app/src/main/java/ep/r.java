package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aaShadow.a {
    public static final r a = new r();
    public static final List b = sy.d0.n("addMobileDeviceToken");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.y yVar = null;
        while (eVar.r0(b) == 0) {
            yVar = (jo.y) aa.c.b(aa.c.c(q.a, false)).a(eVar, wVar);
        }
        return new jo.a0(yVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.a0 a0Var = (jo.a0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("addMobileDeviceToken");
        aa.c.b(aa.c.c(q.a, false)).b(fVar, wVar, a0Var.a);
    }
}
