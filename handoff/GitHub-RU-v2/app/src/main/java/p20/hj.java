package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hj implements aa.a {
    public static final hj a = new hj();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.es esVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            esVar = ij.c(eVar, wVar);
        } else {
            esVar = null;
        }
        if (str2 != null) {
            return new u10.ds(str, str2, esVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ds dsVar = (u10.ds) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dsVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dsVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, dsVar.b);
        u10.es esVar = dsVar.c;
        if (esVar != null) {
            ij.d(fVar, wVar, esVar);
        }
    }
}
