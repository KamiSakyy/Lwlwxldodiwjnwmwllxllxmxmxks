package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wb implements aaShadow.a {
    public static final wb a = new wb();
    public static final List b = sy.d0.n("markNotificationsAsDone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.xh xhVar = null;
        while (eVar.r0(b) == 0) {
            xhVar = (u10.xh) aa.c.b(aa.c.c(xb.a, false)).a(eVar, wVar);
        }
        return new u10.wh(xhVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.wh whVar = (u10.wh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(whVar, "value");
        fVar.z0("markNotificationsAsDone");
        aa.c.b(aa.c.c(xb.a, false)).b(fVar, wVar, whVar.a);
    }
}
