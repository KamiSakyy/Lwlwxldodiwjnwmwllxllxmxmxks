package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class um implements aaShadow.a {
    public static final um a = new um();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(tm.a, true)))).a(eVar, wVar);
        }
        return new kc0.zw(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.zw zwVar = (kc0.zw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zwVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(tm.a, true)))).b(fVar, wVar, zwVar.a);
    }
}
