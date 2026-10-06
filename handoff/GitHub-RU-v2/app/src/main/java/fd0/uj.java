package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uj implements aaShadow.a {
    public static final uj a = new uj();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.at atVar = null;
        while (eVar.r0(b) == 0) {
            atVar = (kc0.at) aa.c.b(aa.c.c(yj.a, false)).a(eVar, wVar);
        }
        return new kc0.ws(atVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ws wsVar = (kc0.ws) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wsVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(yj.a, false)).b(fVar, wVar, wsVar.a);
    }
}
