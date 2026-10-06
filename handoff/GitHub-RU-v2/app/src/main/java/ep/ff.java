package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ff implements aaShadow.a {
    public static final ff a = new ff();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(gf.a, true)))).a(eVar, wVar);
        }
        return new jo.sm(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.sm smVar = (jo.sm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(smVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(gf.a, true)))).b(fVar, wVar, smVar.a);
    }
}
