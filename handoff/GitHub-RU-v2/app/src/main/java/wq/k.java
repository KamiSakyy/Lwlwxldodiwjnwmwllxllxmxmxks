package wq;

import aa.w;
import java.util.Iterator;
import java.util.List;
import m10.b4;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k implements aa.a {
    public static final List a = d0Shadow.n("status");

    public static d c(ea.e eVar, w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b4 b4Var = null;
        while (eVar.r0(a) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            b4.Companion.getClass();
            Iterator it = b4.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((b4) obj).r.equals(u)) {
                    break;
                }
            }
            b4 b4Var2 = (b4) obj;
            b4Var = b4Var2 == null ? b4.t : b4Var2;
        }
        if (b4Var != null) {
            return new d(b4Var);
        }
        k41.b.B(eVar, "status");
        throw null;
    }
}
