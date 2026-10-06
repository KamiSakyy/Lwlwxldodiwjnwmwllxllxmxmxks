package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements aaShadow.a {
    public static final a a = new a();
    public static final List b = sy.d0.n("commentEdge");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.b bVar = null;
        while (eVar.r0(b) == 0) {
            bVar = (kc0.b) aa.c.b(aa.c.c(b.a, false)).a(eVar, wVar);
        }
        return new kc0.a(bVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.a aVar = (kc0.a) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("commentEdge");
        aa.c.b(aa.c.c(b.a, false)).b(fVar, wVar, aVar.a);
    }
}
