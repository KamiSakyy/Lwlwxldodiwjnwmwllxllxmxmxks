package eo0;

import java.util.List;
import jn0.e90;
import jn0.f90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lv implements aaShadow.a {
    public static final lv a = new lv();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "subscribable"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        e90 e90Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                e90Var = (e90) aa.c.b(aa.c.c(kv.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new f90(str, e90Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f90 f90Var = (f90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f90Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, f90Var.a);
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(kv.a, true)).b(fVar, wVar, f90Var.b);
    }
}
