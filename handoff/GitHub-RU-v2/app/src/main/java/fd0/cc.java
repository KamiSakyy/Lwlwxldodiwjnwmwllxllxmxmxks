package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cc implements aaShadow.a {
    public static final cc a = new cc();
    public static final List b = sy.d0.n("markNotificationAsDone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.xh xhVar = null;
        while (eVar.r0(b) == 0) {
            xhVar = (kc0.xh) aa.c.b(aa.c.c(dc.a, false)).a(eVar, wVar);
        }
        return new kc0.wh(xhVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.wh whVar = (kc0.wh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(whVar, "value");
        fVar.z0("markNotificationAsDone");
        aa.c.b(aa.c.c(dc.a, false)).b(fVar, wVar, whVar.a);
    }
}
