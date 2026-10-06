package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gd implements aaShadow.a {
    public static final gd a = new gd();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.bk bkVar = null;
        while (eVar.r0(b) == 0) {
            bkVar = (u10.bk) aa.c.b(aa.c.c(jd.a, false)).a(eVar, wVar);
        }
        return new u10.yj(bkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.yj yjVar = (u10.yj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yjVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(jd.a, false)).b(fVar, wVar, yjVar.a);
    }
}
