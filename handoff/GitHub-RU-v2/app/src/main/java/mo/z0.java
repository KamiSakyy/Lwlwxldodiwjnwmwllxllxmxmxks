package mo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"sponsorable", "id"});

    public static r c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g0 g0Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                g0Var = (g0) aa.c.c(o1.a, true).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (g0Var == null) {
            k41.b.B(eVar, "sponsorable");
            throw null;
        }
        if (str != null) {
            return new r(g0Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, r rVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("sponsorable");
        aa.c.c(o1.a, true).b(fVar, wVar, rVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, rVar.b);
    }
}
