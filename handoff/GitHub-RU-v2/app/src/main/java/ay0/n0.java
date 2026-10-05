package ay0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n0 implements aa.a {
    public static final List a = sy.d0.n("number");

    public static e0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Double d = null;
        while (eVar.r0(a) == 0) {
            d = (Double) aa.c.j.a(eVar, wVar);
        }
        return new e0(d);
    }
}
