package fd0;

import java.util.List;
import kc0.s40;
import kc0.w40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zr implements aa.a {
    public static final zr a = new zr();
    public static final List b = sy.d0.n("unmarkFileAsViewed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w40 w40Var = null;
        while (eVar.r0(b) == 0) {
            w40Var = (w40) aa.c.b(aa.c.c(ds.a, false)).a(eVar, wVar);
        }
        return new s40(w40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s40 s40Var = (s40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s40Var, "value");
        fVar.z0("unmarkFileAsViewed");
        aa.c.b(aa.c.c(ds.a, false)).b(fVar, wVar, s40Var.a);
    }
}
