package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aaShadow.a {
    public static final a a = new a();
    public static final List b = sy.d0Shadow.n("assignable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.b bVar = null;
        while (eVar.r0(b) == 0) {
            bVar = (jo.b) aa.c.b(aa.c.c(b.a, true)).a(eVar, wVar);
        }
        return new jo.a(bVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.a aVar = (joShadow.a) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("assignable");
        aa.c.b(aa.c.c(b.a, true)).b(fVar, wVar, aVar.a);
    }
    public Object O(Object p1) { return null; }
    public static final Object d = null;
    public static final Object o = null;
    public static final Object r = null;
}
