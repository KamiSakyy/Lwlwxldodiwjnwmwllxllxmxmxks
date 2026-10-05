package nb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = sy.d0.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        mb0.d dVar = null;
        while (eVar.r0(b) == 0) {
            dVar = (mb0.d) aa.c.c(c.a, false).a(eVar, wVar);
        }
        if (dVar != null) {
            return new mb0.b(dVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mb0.b bVar = (mb0.b) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("viewer");
        aa.c.c(c.a, false).b(fVar, wVar, bVar.a);
    }
}
