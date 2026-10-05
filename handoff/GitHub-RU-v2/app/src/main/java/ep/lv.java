package ep;

import java.util.List;
import jo.a90;
import jo.r80;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class lv implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "comments"});

    public static a90 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        r80 r80Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                r80Var = (r80) aa.c.c(dv.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (r80Var != null) {
            return new a90(str, r80Var);
        }
        k41.b.B(eVar, "comments");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, a90 a90Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a90Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, a90Var.a);
        fVar.z0("comments");
        aa.c.c(dv.a, false).b(fVar, wVar, a90Var.b);
    }
}
