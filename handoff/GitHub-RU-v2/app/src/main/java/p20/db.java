package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class db implements aaShadow.a {
    public static final db a = new db();
    public static final List b = sy.d0Shadow.n("markFileAsViewed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.og ogVar = null;
        while (eVar.r0(b) == 0) {
            ogVar = (u10.og) aa.c.b(aa.c.c(eb.a, false)).a(eVar, wVar);
        }
        return new u10.ng(ogVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ng ngVar = (u10.ng) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ngVar, "value");
        fVar.z0("markFileAsViewed");
        aa.c.b(aa.c.c(eb.a, false)).b(fVar, wVar, ngVar.a);
    }
}
