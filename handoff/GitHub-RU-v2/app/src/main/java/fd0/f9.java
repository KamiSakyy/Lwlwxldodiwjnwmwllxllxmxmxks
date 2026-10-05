package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f9 implements aa.a {
    public static final f9 a = new f9();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ae aeVar = null;
        while (eVar.r0(b) == 0) {
            aeVar = (kc0.ae) aa.c.b(aa.c.c(j9.a, false)).a(eVar, wVar);
        }
        return new kc0.wd(aeVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.wd wdVar = (kc0.wd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wdVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(j9.a, false)).b(fVar, wVar, wdVar.a);
    }
}
