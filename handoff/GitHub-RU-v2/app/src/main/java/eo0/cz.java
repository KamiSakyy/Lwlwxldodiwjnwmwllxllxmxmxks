package eo0;

import java.util.Iterator;
import java.util.List;
import jn0.te0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cz implements aaShadow.a {
    public static final cz a = new cz();
    public static final List b = sy.d0.n("contributionLevel");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pz0.o5 o5Var = null;
        while (eVar.r0(b) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            pz0.o5.Companion.getClass();
            Iterator it = pz0.o5.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((pz0.o5) obj).r.equals(u)) {
                    break;
                }
            }
            pz0.o5 o5Var2 = (pz0.o5) obj;
            o5Var = o5Var2 == null ? pz0.o5.t : o5Var2;
        }
        if (o5Var != null) {
            return new te0(o5Var);
        }
        k41.b.B(eVar, "contributionLevel");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        te0 te0Var = (te0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(te0Var, "value");
        fVar.z0("contributionLevel");
        fVar.I(te0Var.a.r);
    }
}
