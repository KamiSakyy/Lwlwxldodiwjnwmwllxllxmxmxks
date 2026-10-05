package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bj implements aa.a {
    public static final bj a = new bj();
    public static final List b = sy.d0.n("removeDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.sr srVar = null;
        while (eVar.r0(b) == 0) {
            srVar = (kc0.sr) aa.c.b(aa.c.c(cj.a, false)).a(eVar, wVar);
        }
        return new kc0.rr(srVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.rr rrVar = (kc0.rr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rrVar, "value");
        fVar.z0("removeDashboardSearchShortcut");
        aa.c.b(aa.c.c(cj.a, false)).b(fVar, wVar, rrVar.a);
    }
}
