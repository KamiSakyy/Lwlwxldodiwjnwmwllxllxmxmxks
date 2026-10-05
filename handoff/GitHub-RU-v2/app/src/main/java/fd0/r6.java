package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r6 implements aa.a {
    public static final r6 a = new r6();
    public static final List b = sy.d0.n("discussionCategory");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ba baVar = null;
        while (eVar.r0(b) == 0) {
            baVar = (kc0.ba) aa.c.b(aa.c.c(s6.a, true)).a(eVar, wVar);
        }
        return new kc0.aa(baVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.aa aaVar = (kc0.aa) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aaVar, "value");
        fVar.z0("discussionCategory");
        aa.c.b(aa.c.c(s6.a, true)).b(fVar, wVar, aaVar.a);
    }
}
