package eo0;

import java.util.List;
import jn0.s40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class js implements aaShadow.a {
    public static final js a = new js();
    public static final List b = sy.d0.n("edges");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(hs.a, false)))).a(eVar, wVar);
        }
        return new s40(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s40 s40Var = (s40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s40Var, "value");
        fVar.z0("edges");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(hs.a, false)))).b(fVar, wVar, s40Var.a);
    }
}
