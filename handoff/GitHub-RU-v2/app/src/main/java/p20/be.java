package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class be implements aaShadow.a {
    public static final List a = sy.d0.n("__typename");

    public static u10.dl c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        e50.s sVar = e50.s.a;
        e50.p c = e50.s.c(eVar, wVar);
        if (str != null) {
            return new u10.dl(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
