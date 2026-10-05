package p20;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z7 implements aa.a {
    public static final z7 a = new z7();
    public static final List b = sy.d0.o("link", "linkType");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        hc0.kv kvVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                hc0.kv.Companion.getClass();
                Iterator it = hc0.kv.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((hc0.kv) obj).r.equals(u)) {
                        break;
                    }
                }
                hc0.kv kvVar2 = (hc0.kv) obj;
                kvVar = kvVar2 == null ? hc0.kv.u : kvVar2;
            }
        }
        if (str == null) {
            k41.b.B(eVar, "link");
            throw null;
        }
        if (kvVar != null) {
            return new u10.ac(str, kvVar);
        }
        k41.b.B(eVar, "linkType");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ac acVar = (u10.ac) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(acVar, "value");
        fVar.z0("link");
        aa.c.a.b(fVar, wVar, acVar.a);
        fVar.z0("linkType");
        fVar.I(acVar.b.r);
    }
}
