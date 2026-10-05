package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b5 implements aa.a {
    public static final List a = sy.d0.n("url");

    public static n4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new n4(str);
    }
}
