package wx0;

import java.time.LocalDate;
import java.util.List;
import pz0.m7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "date", "field"});

    public static d1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        LocalDate localDate = null;
        a0 a0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                m7.Companion.getClass();
                localDate = (LocalDate) no.a.h(wVar, m7.a, eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                a0Var = (a0) aa.c.c(i2.a, true).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (a0Var != null) {
            return new d1(str, localDate, a0Var);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, d1 d1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d1Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, d1Var.a);
        fVar.z0("date");
        m7.Companion.getClass();
        aa.c.b(wVar.e(m7.a)).b(fVar, wVar, d1Var.b);
        fVar.z0("field");
        aa.c.c(i2.a, true).b(fVar, wVar, d1Var.c);
    }
}
