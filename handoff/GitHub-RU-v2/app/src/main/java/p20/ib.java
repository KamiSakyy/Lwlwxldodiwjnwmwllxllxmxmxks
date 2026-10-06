package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ib implements aaShadow.a {
    public static final ib a = new ib();
    public static final List b = sy.d0Shadow.n("markNotificationAsDone");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.vg vgVar = null;
        while (eVar.r0(b) == 0) {
            vgVar = (u10.vg) aa.c.b(aa.c.c(jb.a, false)).a(eVar, wVar);
        }
        return new u10.ug(vgVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ug ugVar = (u10.ug) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ugVar, "value");
        fVar.z0("markNotificationAsDone");
        aa.c.b(aa.c.c(jb.a, false)).b(fVar, wVar, ugVar.a);
    }
}
