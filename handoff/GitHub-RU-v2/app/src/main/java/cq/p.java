package cq;

import java.time.LocalDate;
import java.util.List;
import m10.qa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p implements aa.a {
    public static final List a = x61.l.r(new String[]{"resetDate", "hasUsageRemaining", "quotaPercentageRemaining"});

    public static o c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        LocalDate localDate = null;
        Boolean bool = null;
        Double d = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                qa.Companion.getClass();
                localDate = (LocalDate) no.a.h(wVar, qa.a, eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.k.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    return new o(localDate, bool, d);
                }
                d = (Double) aa.c.j.a(eVar, wVar);
            }
        }
    }
}
