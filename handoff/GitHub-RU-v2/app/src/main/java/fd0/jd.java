package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class jd implements aa.a {
    public static final List a = sy.d0.n("mentionableItems");

    public static kc0.bk c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.vj vjVar = null;
        while (eVar.r0(a) == 0) {
            vjVar = (kc0.vj) aa.c.b(aa.c.c(dd.a, false)).a(eVar, wVar);
        }
        return new kc0.bk(vjVar);
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.bk bkVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bkVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(dd.a, false)).b(fVar, wVar, bkVar.a);
    }
}
