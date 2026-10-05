package eo0;

import java.util.List;
import jn0.og0;
import jn0.pg0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e00 implements aa.a {
    public static final e00 a = new e00();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pg0 pg0Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                pg0Var = (pg0) aa.c.c(f00.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(d00.a, true)))).a(eVar, wVar);
            }
        }
        if (pg0Var != null) {
            return new og0(pg0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        og0 og0Var = (og0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(og0Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(f00.a, false).b(fVar, wVar, og0Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(d00.a, true)))).b(fVar, wVar, og0Var.b);
    }
}
