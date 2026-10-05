package sz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = sy.d0.n("item");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        rz.d dVar = null;
        while (eVar.r0(b) == 0) {
            dVar = (rz.d) aa.c.b(aa.c.c(c.a, true)).a(eVar, wVar);
        }
        return new rz.a(dVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rz.a aVar = (rz.a) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("item");
        aa.c.b(aa.c.c(c.a, true)).b(fVar, wVar, aVar.a);
    }
}
