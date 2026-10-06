package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ek implements aaShadow.a {
    public static final List a = sy.d0.n("forks");

    public static kc0.jt c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ft ftVar = null;
        while (eVar.r0(a) == 0) {
            ftVar = (kc0.ft) aa.c.c(bk.a, false).a(eVar, wVar);
        }
        if (ftVar != null) {
            return new kc0.jt(ftVar);
        }
        k41.b.B(eVar, "forks");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.jt jtVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jtVar, "value");
        fVar.z0("forks");
        aa.c.c(bk.a, false).b(fVar, wVar, jtVar.a);
    }
}
