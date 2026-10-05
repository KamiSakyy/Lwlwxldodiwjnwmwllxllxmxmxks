package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = sy.d0.n("addAssigneesToAssignable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.a aVar = null;
        while (eVar.r0(b) == 0) {
            aVar = (jo.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
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
}
