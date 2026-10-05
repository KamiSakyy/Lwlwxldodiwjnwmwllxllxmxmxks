package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"history", "id"});

    public static jo.q6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.m6 m6Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                m6Var = (jo.m6) aa.c.c(e4.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (m6Var == null) {
            k41.b.B(eVar, "history");
            throw null;
        }
        if (str != null) {
            return new jo.q6(m6Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.q6 q6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q6Var, "value");
        fVar.z0("history");
        aa.c.c(e4.a, false).b(fVar, wVar, q6Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, q6Var.b);
    }
}
