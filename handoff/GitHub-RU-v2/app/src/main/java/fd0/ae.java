package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ae implements aa.a {
    public static final ae a = new ae();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.fl flVar = null;
        while (eVar.r0(b) == 0) {
            flVar = (kc0.fl) aa.c.b(aa.c.c(fe.a, false)).a(eVar, wVar);
        }
        return new kc0.al(flVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.al alVar = (kc0.al) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(alVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(fe.a, false)).b(fVar, wVar, alVar.a);
    }
}
