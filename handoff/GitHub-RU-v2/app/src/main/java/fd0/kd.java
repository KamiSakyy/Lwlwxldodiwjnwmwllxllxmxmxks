package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class kd implements aa.a {
    public static final List a = sy.d0.n("mentionableItems");

    public static kc0.ck c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.wj wjVar = null;
        while (eVar.r0(a) == 0) {
            wjVar = (kc0.wj) aa.c.b(aa.c.c(ed.a, false)).a(eVar, wVar);
        }
        return new kc0.ck(wjVar);
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.ck ckVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ckVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(ed.a, false)).b(fVar, wVar, ckVar.a);
    }
}
