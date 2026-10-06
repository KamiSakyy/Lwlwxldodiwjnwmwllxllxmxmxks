package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aaShadow.a {
    public static final h a = new h();
    public static final List b = sy.d0.n("addDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.g gVar = null;
        while (eVar.r0(b) == 0) {
            gVar = (u10.g) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
        }
        return new u10.k(gVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.k kVar = (u10.k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("addDiscussionComment");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, kVar.a);
    }
}
