package ri0;

import gn0.bm;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = sy.d0.n("mergeMethod");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        bm bmVar = null;
        while (eVar.r0(b) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            bm.Companion.getClass();
            Iterator it = bm.y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((bm) obj).r.equals(u)) {
                    break;
                }
            }
            bm bmVar2 = (bm) obj;
            bmVar = bmVar2 == null ? bm.w : bmVar2;
        }
        if (bmVar != null) {
            return new a(bmVar);
        }
        k41.b.B(eVar, "mergeMethod");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a aVar = (a) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("mergeMethod");
        fVar.I(aVar.a.r);
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object f = null;
    public static final Object i = null;
    public static final Object k = null;
}
