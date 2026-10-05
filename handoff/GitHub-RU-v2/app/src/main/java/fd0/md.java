package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class md implements aa.a {
    public static final md a = new md();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.jk jkVar = null;
        while (eVar.r0(b) == 0) {
            jkVar = (kc0.jk) aa.c.b(aa.c.c(pd.a, true)).a(eVar, wVar);
        }
        return new kc0.gk(jkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.gk gkVar = (kc0.gk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gkVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(pd.a, true)).b(fVar, wVar, gkVar.a);
    }
}
