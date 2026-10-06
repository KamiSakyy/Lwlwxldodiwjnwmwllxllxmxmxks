package p20;

import java.util.List;
import u10.h50;
import u10.i50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gs implements aaShadow.a {
    public static final gs a = new gs();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i50 i50Var = null;
        while (eVar.r0(b) == 0) {
            i50Var = (i50) aa.c.b(aa.c.c(hs.a, true)).a(eVar, wVar);
        }
        return new h50(i50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h50 h50Var = (h50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h50Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(hs.a, true)).b(fVar, wVar, h50Var.a);
    }
}
