package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vb implements aaShadow.a {
    public static final vb a = new vb();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.kh khVar = null;
        while (eVar.r0(b) == 0) {
            khVar = (kc0.kh) aa.c.b(aa.c.c(ub.a, false)).a(eVar, wVar);
        }
        return new kc0.lh(khVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.lh lhVar = (kc0.lh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lhVar, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(ub.a, false)).b(fVar, wVar, lhVar.a);
    }
}
