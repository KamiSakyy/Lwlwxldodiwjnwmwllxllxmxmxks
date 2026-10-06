package y30;

import aa.w;
import hc0.p2;
import java.util.Iterator;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k implements aa.a {
    public static final List a = d0Shadow.n("status");

    public static d c(ea.e eVar, w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p2 p2Var = null;
        while (eVar.r0(a) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            p2.Companion.getClass();
            Iterator it = p2.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((p2) obj).r.equals(u)) {
                    break;
                }
            }
            p2 p2Var2 = (p2) obj;
            p2Var = p2Var2 == null ? p2.t : p2Var2;
        }
        if (p2Var != null) {
            return new d(p2Var);
        }
        k41.b.B(eVar, "status");
        throw null;
    }
}
