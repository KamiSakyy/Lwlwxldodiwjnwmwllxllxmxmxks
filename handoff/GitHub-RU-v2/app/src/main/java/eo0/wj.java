package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wj implements aa.a {
    public static final wj a = new wj();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.vs vsVar = null;
        while (eVar.r0(b) == 0) {
            vsVar = (jn0.vs) aa.c.b(aa.c.c(zj.a, true)).a(eVar, wVar);
        }
        return new jn0.ss(vsVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ss ssVar = (jn0.ss) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ssVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(zj.a, true)).b(fVar, wVar, ssVar.a);
    }
}
