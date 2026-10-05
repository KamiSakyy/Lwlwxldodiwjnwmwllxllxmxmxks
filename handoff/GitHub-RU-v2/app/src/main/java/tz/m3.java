package tz;

import java.time.LocalDate;
import java.util.List;
import m10.qa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "date", "field"});

    public static e1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        LocalDate localDate = null;
        b0 b0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                qa.Companion.getClass();
                localDate = (LocalDate) no.a.h(wVar, qa.a, eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                b0Var = (b0) aa.c.c(j2.a, true).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (b0Var != null) {
            return new e1(str, localDate, b0Var);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e1 e1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, e1Var.a);
        fVar.z0("date");
        qa.Companion.getClass();
        aa.c.b(wVar.e(qa.a)).b(fVar, wVar, e1Var.b);
        fVar.z0("field");
        aa.c.c(j2.a, true).b(fVar, wVar, e1Var.c);
    }
}
