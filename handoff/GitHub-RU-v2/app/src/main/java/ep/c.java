package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aaShadow.a {
    public static final c a = new c();
    public static final List b = sy.d0Shadow.n("addAssigneesToAssignable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.a aVar = null;
        while (eVar.r0(b) == 0) {
            aVar = (joShadow.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
        }
        return new jo.d(aVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.d dVar = (jo.d) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("addAssigneesToAssignable");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, dVar.a);
    }
    public Object a(Object p1) { return null; }
    public Object b(Object p1) { return null; }
    public static final Object f = null;
    public static final Object i = null;
    public static final Object j = null;
    public static final Object k = null;
    public static final Object r = null;
}
