package ct;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "timelineItems"});

    public static j0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        i0 i0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                i0Var = (i0) aa.c.c(n0.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (i0Var != null) {
            return new j0(str, str2, i0Var);
        }
        k41.b.B(eVar, "timelineItems");
        throw null;
    }
}
