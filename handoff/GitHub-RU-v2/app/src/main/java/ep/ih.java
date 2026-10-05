package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class ih implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static jo.rp c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        is.v vVar = is.v.a;
        is.r c = is.v.c(eVar, wVar);
        if (str != null) {
            return new jo.rp(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
