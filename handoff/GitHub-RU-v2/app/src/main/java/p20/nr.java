package p20;

import java.util.List;
import u10.d40;
import u10.e40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nr implements aaShadow.a {
    public static final nr a = new nr();
    public static final List b = sy.d0Shadow.n("discussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d40 d40Var = null;
        while (eVar.r0(b) == 0) {
            d40Var = (d40) aa.c.b(aa.c.c(mr.a, false)).a(eVar, wVar);
        }
        return new e40(d40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e40 e40Var = (e40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e40Var, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(mr.a, false)).b(fVar, wVar, e40Var.a);
    }
}
