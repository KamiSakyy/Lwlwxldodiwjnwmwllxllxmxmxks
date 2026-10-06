package fd0;

import java.util.Iterator;
import java.util.List;
import kc0.ta0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dw implements aaShadow.a {
    public static final dw a = new dw();
    public static final List b = sy.d0Shadow.n("contributionLevel");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        gn0.z4 z4Var = null;
        while (eVar.r0(b) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            gn0.z4.Companion.getClass();
            Iterator it = gn0.z4.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((gn0.z4) obj).r.equals(u)) {
                    break;
                }
            }
            gn0.z4 z4Var2 = (gn0.z4) obj;
            z4Var = z4Var2 == null ? gn0.z4.t : z4Var2;
        }
        if (z4Var != null) {
            return new ta0(z4Var);
        }
        k41.b.B(eVar, "contributionLevel");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ta0 ta0Var = (ta0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ta0Var, "value");
        fVar.z0("contributionLevel");
        fVar.I(ta0Var.a.r);
    }
}
