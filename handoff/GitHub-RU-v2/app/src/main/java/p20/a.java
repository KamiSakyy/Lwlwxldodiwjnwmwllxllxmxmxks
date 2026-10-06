package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aaShadow.a {
    public static final a a = new a();
    public static final List b = sy.d0Shadow.n("commentEdge");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.b bVar = null;
        while (eVar.r0(b) == 0) {
            bVar = (u10.b) aa.c.b(aa.c.c(b.a, false)).a(eVar, wVar);
        }
        return new u10.a(bVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.a aVar = (u10.a) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("commentEdge");
        aa.c.b(aa.c.c(b.a, false)).b(fVar, wVar, aVar.a);
    }
    public Object O(Object p1) { return null; }
}
