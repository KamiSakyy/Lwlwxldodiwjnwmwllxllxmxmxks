package ep;

import java.util.List;
import jo.sd0;
import jo.td0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class my implements aaShadow.a {
    public static final my a = new my();
    public static final List b = sy.d0Shadow.n("updateNotificationSettings");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        td0 td0Var = null;
        while (eVar.r0(b) == 0) {
            td0Var = (td0) aa.c.b(aa.c.c(ny.a, false)).a(eVar, wVar);
        }
        return new sd0(td0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sd0 sd0Var = (sd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sd0Var, "value");
        fVar.z0("updateNotificationSettings");
        aa.c.b(aa.c.c(ny.a, false)).b(fVar, wVar, sd0Var.a);
    }
}
