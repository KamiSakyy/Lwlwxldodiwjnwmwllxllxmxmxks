package eo0;

import java.util.List;
import jn0.b60;
import jn0.c60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ht implements aaShadow.a {
    public static final ht a = new ht();
    public static final List b = sy.d0.o(new String[]{"__typename", "subscribable"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        b60 b60Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                b60Var = (b60) aa.c.b(aa.c.c(gt.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new c60(str, b60Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c60 c60Var = (c60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c60Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, c60Var.a);
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(gt.a, true)).b(fVar, wVar, c60Var.b);
    }
}
