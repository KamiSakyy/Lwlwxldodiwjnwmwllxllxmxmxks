package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cb implements aa.a {
    public static final cb a = new cb();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.og ogVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Commit"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            ogVar = db.c(eVar, wVar);
        } else {
            ogVar = null;
        }
        if (str2 != null) {
            return new jo.ng(str, str2, ogVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ng ngVar = (jo.ng) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ngVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ngVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ngVar.b);
        jo.og ogVar = ngVar.c;
        if (ogVar != null) {
            db.d(fVar, wVar, ogVar);
        }
    }
}
