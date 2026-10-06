package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aaShadow.a {
    public static final d a = new d();
    public static final List b = sy.d0Shadow.n("commentEdge");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.g gVar = null;
        while (eVar.r0(b) == 0) {
            gVar = (jo.g) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
        }
        return new jo.f(gVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.f fVar2 = (jo.f) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("commentEdge");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, fVar2.a);
    }
    public static final Object r = null;
}
