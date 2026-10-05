package eo0;

import java.util.List;
import jn0.e60;
import jn0.n60;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class rt implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "comments"});

    public static n60 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        e60 e60Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                e60Var = (e60) aa.c.c(jt.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (e60Var != null) {
            return new n60(str, e60Var);
        }
        k41.b.B(eVar, "comments");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, n60 n60Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n60Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, n60Var.a);
        fVar.z0("comments");
        aa.c.c(jt.a, false).b(fVar, wVar, n60Var.b);
    }
}
