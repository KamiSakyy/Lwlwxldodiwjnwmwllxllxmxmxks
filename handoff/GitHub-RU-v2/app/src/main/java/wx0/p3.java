package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "number", "field"});

    public static h1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Double d = null;
        r rVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                d = (Double) aa.c.j.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                rVar = (r) aa.c.c(z1.a, true).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (rVar != null) {
            return new h1(str, d, rVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, h1 h1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, h1Var.a);
        fVar.z0("number");
        aa.c.j.b(fVar, wVar, h1Var.b);
        fVar.z0("field");
        aa.c.c(z1.a, true).b(fVar, wVar, h1Var.c);
    }
}
