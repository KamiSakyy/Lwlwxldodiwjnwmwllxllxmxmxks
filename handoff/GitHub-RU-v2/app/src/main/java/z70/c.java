package z70;

import hc0.zk;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = sy.d0.n("mergeMethod");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zk zkVar = null;
        while (eVar.r0(b) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            zk.Companion.getClass();
            Iterator it = zk.y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((zk) obj).r.equals(u)) {
                    break;
                }
            }
            zk zkVar2 = (zk) obj;
            zkVar = zkVar2 == null ? zk.w : zkVar2;
        }
        if (zkVar != null) {
            return new a(zkVar);
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
}
