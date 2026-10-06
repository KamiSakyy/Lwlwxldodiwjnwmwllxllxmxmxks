package p20;

import java.util.List;
import u10.aa0;
import u10.ba0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lv implements aaShadow.a {
    public static final lv a = new lv();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ba0 ba0Var = null;
        while (eVar.r0(b) == 0) {
            ba0Var = (ba0) aa.c.b(aa.c.c(mv.a, false)).a(eVar, wVar);
        }
        return new aa0(ba0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        aa0 aa0Var = (aa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aa0Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(mv.a, false)).b(fVar, wVar, aa0Var.a);
    }
}
