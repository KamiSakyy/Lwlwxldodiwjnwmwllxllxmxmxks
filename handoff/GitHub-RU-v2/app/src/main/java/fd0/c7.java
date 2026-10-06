package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c7 implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("discussion");

    public static kc0.pa c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.na naVar = null;
        while (eVar.r0(a) == 0) {
            naVar = (kc0.na) aa.c.b(aa.c.c(a7.a, false)).a(eVar, wVar);
        }
        return new kc0.pa(naVar);
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.pa paVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(paVar, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(a7.a, false)).b(fVar, wVar, paVar.a);
    }
}
