package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yd implements aaShadow.a {
    public static final yd a = new yd();
    public static final List b = sy.d0Shadow.n("markFileAsViewed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.mk mkVar = null;
        while (eVar.r0(b) == 0) {
            mkVar = (jo.mk) aa.c.b(aa.c.c(zd.a, false)).a(eVar, wVar);
        }
        return new jo.lk(mkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.lk lkVar = (jo.lk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lkVar, "value");
        fVar.z0("markFileAsViewed");
        aa.c.b(aa.c.c(zd.a, false)).b(fVar, wVar, lkVar.a);
    }
}
