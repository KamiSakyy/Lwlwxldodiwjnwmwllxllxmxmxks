package p20;

import java.util.List;
import u10.t30;
import u10.u30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gr implements aaShadow.a {
    public static final gr a = new gr();
    public static final List b = sy.d0Shadow.n("updateDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u30 u30Var = null;
        while (eVar.r0(b) == 0) {
            u30Var = (u30) aa.c.b(aa.c.c(hr.a, false)).a(eVar, wVar);
        }
        return new t30(u30Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t30 t30Var = (t30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t30Var, "value");
        fVar.z0("updateDiscussionComment");
        aa.c.b(aa.c.c(hr.a, false)).b(fVar, wVar, t30Var.a);
    }
}
