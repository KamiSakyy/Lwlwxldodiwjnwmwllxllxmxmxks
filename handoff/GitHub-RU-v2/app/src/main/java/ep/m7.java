package ep;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m7 implements aaShadow.a {
    public static final m7 a = new m7();
    public static final List b = sy.d0.n("mergeMethod");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m10.py pyVar = null;
        while (eVar.r0(b) == 0) {
            String u = eVar.u();
            k71.k.d(u);
            m10.py.Companion.getClass();
            Iterator it = m10.py.y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((m10.py) obj).r.equals(u)) {
                    break;
                }
            }
            m10.py pyVar2 = (m10.py) obj;
            pyVar = pyVar2 == null ? m10.py.w : pyVar2;
        }
        if (pyVar != null) {
            return new jo.db(pyVar);
        }
        k41.b.B(eVar, "mergeMethod");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.db dbVar = (jo.db) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dbVar, "value");
        fVar.z0("mergeMethod");
        fVar.I(dbVar.a.r);
    }
}
