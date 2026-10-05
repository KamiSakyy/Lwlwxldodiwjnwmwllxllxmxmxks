package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j implements aa.a {
    public static final List a = sy.d0.n("nodes");

    public static h c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(a) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(i.a, true)))).a(eVar, wVar);
        }
        return new h(list);
    }

    public static void d(ea.f fVar, aa.w wVar, h hVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(i.a, true)))).b(fVar, wVar, hVar.a);
    }
}
