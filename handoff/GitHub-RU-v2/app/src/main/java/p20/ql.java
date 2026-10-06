package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ql implements aaShadow.a {
    public static final ql a = new ql();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(pl.a, true)))).a(eVar, wVar);
        }
        return new u10.lv(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.lv lvVar = (u10.lv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lvVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(pl.a, true)))).b(fVar, wVar, lvVar.a);
    }
}
