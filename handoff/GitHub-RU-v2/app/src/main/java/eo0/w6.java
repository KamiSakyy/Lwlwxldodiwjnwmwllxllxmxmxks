package eo0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w6 implements aaShadow.a {
    public static final w6 a = new w6();
    public static final List b = sy.d0Shadow.n("mergeMethod");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pz0.zs zsVar = null;
        while (eVar.r0(b) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            pz0.zs.Companion.getClass();
            Iterator it = pz0.zs.y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((pz0.zs) obj).r.equals(u)) {
                    break;
                }
            }
            pz0.zs zsVar2 = (pz0.zs) obj;
            zsVar = zsVar2 == null ? pz0.zs.w : zsVar2;
        }
        if (zsVar != null) {
            return new jn0.ga(zsVar);
        }
        k41.b.B(eVar, "mergeMethod");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ga gaVar = (jn0.ga) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gaVar, "value");
        fVar.z0("mergeMethod");
        fVar.I(gaVar.a.r);
    }
}
