package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ol implements aaShadow.a {
    public static final ol a = new ol();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.gv gvVar = null;
        while (eVar.r0(b) == 0) {
            gvVar = (kc0.gv) aa.c.b(aa.c.c(pl.a, false)).a(eVar, wVar);
        }
        return new kc0.fv(gvVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.fv fvVar = (kc0.fv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fvVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(pl.a, false)).b(fVar, wVar, fvVar.a);
    }
}
