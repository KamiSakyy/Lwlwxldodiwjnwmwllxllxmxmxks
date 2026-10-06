package ep;

import java.util.List;
import jo.s40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ksShadow implements aaShadow.a {
    public static final ksShadow a = new ksShadow();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(gs.a, false)))).a(eVar, wVar);
        }
        return new s40(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s40 s40Var = (s40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s40Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(gs.a, false)))).b(fVar, wVar, s40Var.a);
    }
}
