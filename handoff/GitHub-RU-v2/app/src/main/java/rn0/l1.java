package rn0;

import java.util.List;
import qn0.e2;
import vn0.h2;
import vn0.j2;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static e2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        h2 c = j2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new e2(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e2 e2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, e2Var.b);
        List list = j2.a;
        j2.d(fVar, wVar, e2Var.c);
    }
}
