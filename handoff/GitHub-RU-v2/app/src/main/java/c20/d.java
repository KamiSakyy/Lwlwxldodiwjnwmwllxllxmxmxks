package c20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b20.g gVar = null;
        while (eVar.r0(b) == 0) {
            gVar = (b20.g) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
        }
        return new b20.e(gVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b20.e eVar = (b20.e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, eVar.a);
    }
}
