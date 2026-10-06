package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zg implements aaShadow.a {
    public static final zg a = new zg();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(yg.a, false)))).a(eVar, wVar);
        }
        return new jn0.dp(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.dp dpVar = (jn0.dp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dpVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(yg.a, false)))).b(fVar, wVar, dpVar.a);
    }
}
