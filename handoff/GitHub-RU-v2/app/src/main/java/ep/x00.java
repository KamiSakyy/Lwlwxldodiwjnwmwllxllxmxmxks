package ep;

import java.util.Iterator;
import java.util.List;
import jo.hh0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x00 implements aaShadow.a {
    public static final x00 a = new x00();
    public static final List b = sy.d0Shadow.n("contributionLevel");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m10.u6 u6Var = null;
        while (eVar.r0(b) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            m10.u6.Companion.getClass();
            Iterator it = m10.u6.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((m10.u6) obj).r.equals(u)) {
                    break;
                }
            }
            m10.u6 u6Var2 = (m10.u6) obj;
            u6Var = u6Var2 == null ? m10.u6.t : u6Var2;
        }
        if (u6Var != null) {
            return new hh0(u6Var);
        }
        k41.b.B(eVar, "contributionLevel");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        hh0 hh0Var = (hh0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hh0Var, "value");
        fVar.z0("contributionLevel");
        fVar.I(hh0Var.a.r);
    }
}
