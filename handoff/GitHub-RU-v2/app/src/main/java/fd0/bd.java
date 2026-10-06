package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bd implements aaShadow.a {
    public static final bd a = new bd();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ak akVar = null;
        while (eVar.r0(b) == 0) {
            akVar = (kc0.ak) aa.c.b(aa.c.c(id.a, true)).a(eVar, wVar);
        }
        return new kc0.tj(akVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.tj tjVar = (kc0.tj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tjVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(id.a, true)).b(fVar, wVar, tjVar.a);
    }
}
