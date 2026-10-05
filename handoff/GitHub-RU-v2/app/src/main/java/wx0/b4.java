package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"fieldValues", "id", "__typename"});

    public static x1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b0 b0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                b0Var = (b0) aa.c.c(j2.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (b0Var == null) {
            k41.b.B(eVar, "fieldValues");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new x1(b0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
