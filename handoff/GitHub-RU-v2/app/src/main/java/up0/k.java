package up0;

import aa.w;
import java.util.Iterator;
import java.util.List;
import pz0.e3;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k implements aa.a {
    public static final List a = d0Shadow.n("status");

    public static d c(ea.e eVar, w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e3 e3Var = null;
        while (eVar.r0(a) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            e3.Companion.getClass();
            Iterator it = e3.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((e3) obj).r.equals(u)) {
                    break;
                }
            }
            e3 e3Var2 = (e3) obj;
            e3Var = e3Var2 == null ? e3.t : e3Var2;
        }
        if (e3Var != null) {
            return new d(e3Var);
        }
        k41.b.B(eVar, "status");
        throw null;
    }
}
