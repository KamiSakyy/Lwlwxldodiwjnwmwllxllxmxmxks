package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class dg implements aaShadow.a {
    public static final List a = sy.d0.n("__typename");

    public static jn0.yn c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        ar0.v vVar = ar0.v.a;
        ar0.r c = ar0.v.c(eVar, wVar);
        if (str != null) {
            return new jn0.yn(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
