package oe0;

import aa.w;
import gn0.r2;
import java.util.Iterator;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k implements aa.a {
    public static final List a = d0.n("status");

    public static d c(ea.e eVar, w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r2 r2Var = null;
        while (eVar.r0(a) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            r2.Companion.getClass();
            Iterator it = r2.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r2) obj).r.equals(u)) {
                    break;
                }
            }
            r2 r2Var2 = (r2) obj;
            r2Var = r2Var2 == null ? r2.t : r2Var2;
        }
        if (r2Var != null) {
            return new d(r2Var);
        }
        k41.b.B(eVar, "status");
        throw null;
    }
}
