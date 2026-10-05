package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d9 implements aa.a {
    public static final d9 a = new d9();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.td tdVar = null;
        while (eVar.r0(b) == 0) {
            tdVar = (kc0.td) aa.c.b(aa.c.c(e9.a, true)).a(eVar, wVar);
        }
        return new kc0.sd(tdVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.sd sdVar = (kc0.sd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sdVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(e9.a, true)).b(fVar, wVar, sdVar.a);
    }
}
