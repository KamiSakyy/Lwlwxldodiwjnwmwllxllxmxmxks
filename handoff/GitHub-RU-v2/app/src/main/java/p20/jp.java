package p20;

import java.util.List;
import u10.n00;
import u10.w00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class jp implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "comments"});

    public static w00 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        n00 n00Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                n00Var = (n00) aa.c.c(bp.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (n00Var != null) {
            return new w00(str, n00Var);
        }
        k41.b.B(eVar, "comments");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, w00 w00Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w00Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, w00Var.a);
        fVar.z0("comments");
        aa.c.c(bp.a, false).b(fVar, wVar, w00Var.b);
    }
}
