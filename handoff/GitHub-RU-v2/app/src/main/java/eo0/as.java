package eo0;

import java.util.List;
import jn0.f40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class as implements aaShadow.a {
    public static final as a = new as();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        cs0.j c = cs0.n.c(eVar, wVar);
        if (str != null) {
            return new f40(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f40 f40Var = (f40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f40Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, f40Var.a);
        List list = cs0.n.a;
        cs0.n.d(fVar, wVar, f40Var.b);
    }
}
