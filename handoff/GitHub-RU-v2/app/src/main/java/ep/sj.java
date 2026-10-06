package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sj implements aaShadow.a {
    public static final sj a = new sj();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(tj.a, true)))).a(eVar, wVar);
        }
        return new jo.vs(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.vs vsVar = (jo.vs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vsVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(tj.a, true)))).b(fVar, wVar, vsVar.a);
    }
}
