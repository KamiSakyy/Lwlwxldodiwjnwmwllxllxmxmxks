package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aaShadow.a {
    public static final h a = new h();
    public static final List b = sy.d0Shadow.n("addDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.g gVar = null;
        while (eVar.r0(b) == 0) {
            gVar = (kc0.g) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
        }
        return new kc0.k(gVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.k kVar = (kc0.k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("addDiscussionComment");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, kVar.a);
    }
}
