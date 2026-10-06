package el0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        dl0.c cVar = null;
        while (eVar.r0(b) == 0) {
            cVar = (dl0.c) aa.c.b(aa.c.c(b.a, true)).a(eVar, wVar);
        }
        return new dl0.b(cVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dl0.b bVar = (dl0.b) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(b.a, true)).b(fVar, wVar, bVar.a);
    }
    public Object O(Object p1) { return null; }
}
