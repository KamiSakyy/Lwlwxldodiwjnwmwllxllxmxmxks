package wz;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements aa.a {
    public static final m a = new m();
    public static final List b = d0.o("__typename", "id");

    public final Object a(ea.e eVar, w wVar) {
        vz.s sVar;
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
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2Item"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            sVar = n.c(eVar, wVar);
        } else {
            sVar = null;
        }
        if (str2 != null) {
            return new vz.r(str, str2, sVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        vz.r rVar = (vz.r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, rVar.b);
        vz.s sVar = rVar.c;
        if (sVar != null) {
            n.d(fVar, wVar, sVar);
        }
    }
}
