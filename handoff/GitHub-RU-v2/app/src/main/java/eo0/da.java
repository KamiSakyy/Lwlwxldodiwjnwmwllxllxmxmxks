package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class da implements aaShadow.a {
    public static final List a = sy.d0.n("contentRaw");

    public static jn0.af c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new jn0.af(str);
    }
}
