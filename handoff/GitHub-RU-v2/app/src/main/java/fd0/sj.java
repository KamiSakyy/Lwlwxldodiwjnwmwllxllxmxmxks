package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sj implements aaShadow.a {
    public static final sj a = new sj();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ts tsVar = null;
        while (eVar.r0(b) == 0) {
            tsVar = (kc0.ts) aa.c.b(aa.c.c(tj.a, true)).a(eVar, wVar);
        }
        return new kc0.ss(tsVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ss ssVar = (kc0.ss) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ssVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(tj.a, true)).b(fVar, wVar, ssVar.a);
    }
}
