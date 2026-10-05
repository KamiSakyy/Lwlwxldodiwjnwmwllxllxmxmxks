package xz;

import java.time.LocalDate;
import java.util.List;
import m10.qa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k0 implements aa.a {
    public static final List a = sy.d0.n("date");

    public static b0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        LocalDate localDate = null;
        while (eVar.r0(a) == 0) {
            qa.Companion.getClass();
            localDate = (LocalDate) no.a.h(wVar, qa.a, eVar, wVar);
        }
        return new b0(localDate);
    }

    public static void d(ea.f fVar, aa.w wVar, b0 b0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("date");
        qa.Companion.getClass();
        aa.c.b(wVar.e(qa.a)).b(fVar, wVar, b0Var.a);
    }
}
