package fd0;

import java.util.List;
import kc0.d00;
import kc0.h00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wo implements aaShadow.a {
    public static final wo a = new wo();
    public static final List b = sy.d0.n("search");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        h00 h00Var = null;
        while (eVar.r0(b) == 0) {
            h00Var = (h00) aa.c.c(ap.a, false).a(eVar, wVar);
        }
        if (h00Var != null) {
            return new d00(h00Var);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d00 d00Var = (d00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d00Var, "value");
        fVar.z0("search");
        aa.c.c(ap.a, false).b(fVar, wVar, d00Var.a);
    }
}
