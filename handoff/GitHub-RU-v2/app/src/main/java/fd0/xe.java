package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class xe implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static kc0.hm c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        uf0.v vVar = uf0.v.a;
        uf0.r c = uf0.v.c(eVar, wVar);
        if (str != null) {
            return new kc0.hm(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }
}
