package p20;

import java.util.List;
import u10.p00;
import u10.y00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cp implements aaShadow.a {
    public static final cp a = new cp();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        y00 y00Var = null;
        while (eVar.r0(b) == 0) {
            y00Var = (y00) aa.c.b(aa.c.c(lp.a, false)).a(eVar, wVar);
        }
        return new p00(y00Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p00 p00Var = (p00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p00Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(lp.a, false)).b(fVar, wVar, p00Var.a);
    }
}
