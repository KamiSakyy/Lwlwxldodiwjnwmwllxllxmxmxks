package ep;

import java.util.List;
import jo.t90;
import jo.u90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yv implements aaShadow.a {
    public static final yv a = new yv();
    public static final List b = sy.d0.n("unblockUserFromOrganization");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u90 u90Var = null;
        while (eVar.r0(b) == 0) {
            u90Var = (u90) aa.c.b(aa.c.c(zvShadow.a, false)).a(eVar, wVar);
        }
        return new t90(u90Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t90 t90Var = (t90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t90Var, "value");
        fVar.z0("unblockUserFromOrganization");
        aa.c.b(aa.c.c(zvShadow.a, false)).b(fVar, wVar, t90Var.a);
    }
}
