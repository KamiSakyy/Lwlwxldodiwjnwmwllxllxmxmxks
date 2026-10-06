package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h8 implements aaShadow.a {
    public static final h8 a = new h8();
    public static final List b = sy.d0Shadow.n("patch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.oc ocVar = null;
        while (eVar.r0(b) == 0) {
            ocVar = (kc0.oc) aa.c.b(aa.c.c(j8.a, false)).a(eVar, wVar);
        }
        return new kc0.mc(ocVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.mc mcVar = (kc0.mc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mcVar, "value");
        fVar.z0("patch");
        aa.c.b(aa.c.c(j8.a, false)).b(fVar, wVar, mcVar.a);
    }
}
