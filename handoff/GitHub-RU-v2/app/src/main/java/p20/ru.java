package p20;

import java.util.Iterator;
import java.util.List;
import u10.t80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ru implements aaShadow.a {
    public static final ru a = new ru();
    public static final List b = sy.d0.n("contributionLevel");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        hc0.p4 p4Var = null;
        while (eVar.r0(b) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            hc0.p4.Companion.getClass();
            Iterator it = hc0.p4.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((hc0.p4) obj).r.equals(u)) {
                    break;
                }
            }
            hc0.p4 p4Var2 = (hc0.p4) obj;
            p4Var = p4Var2 == null ? hc0.p4.t : p4Var2;
        }
        if (p4Var != null) {
            return new t80(p4Var);
        }
        k41.b.B(eVar, "contributionLevel");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t80 t80Var = (t80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t80Var, "value");
        fVar.z0("contributionLevel");
        fVar.I(t80Var.a.r);
    }
}
