package fd0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i6 implements aaShadow.a {
    public static final i6 a = new i6();
    public static final List b = sy.d0.n("mergeMethod");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        gn0.bm bmVar = null;
        while (eVar.r0(b) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            gn0.bm.Companion.getClass();
            Iterator it = gn0.bm.y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((gn0.bm) obj).r.equals(u)) {
                    break;
                }
            }
            gn0.bm bmVar2 = (gn0.bm) obj;
            bmVar = bmVar2 == null ? gn0.bm.w : bmVar2;
        }
        if (bmVar != null) {
            return new kc0.m9(bmVar);
        }
        k41.b.B(eVar, "mergeMethod");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.m9 m9Var = (kc0.m9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m9Var, "value");
        fVar.z0("mergeMethod");
        fVar.I(m9Var.a.r);
    }
}
