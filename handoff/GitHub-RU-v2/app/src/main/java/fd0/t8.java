package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t8 implements aa.a {
    public static final t8 a = new t8();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ld ldVar = null;
        while (eVar.r0(b) == 0) {
            ldVar = (kc0.ld) aa.c.b(aa.c.c(a9.a, false)).a(eVar, wVar);
        }
        return new kc0.ed(ldVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ed edVar = (kc0.ed) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(edVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(a9.a, false)).b(fVar, wVar, edVar.a);
    }
}
