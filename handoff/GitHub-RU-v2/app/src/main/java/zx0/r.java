package zx0;

import aa.w;
import java.util.List;
import sy.d0Shadow;
import yx0.y;
import yx0.z;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, w wVar) {
        z zVar;
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
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2View"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            zVar = s.c(eVar, wVar);
        } else {
            zVar = null;
        }
        if (str2 != null) {
            return new y(str, str2, zVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        y yVar = (y) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, yVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, yVar.b);
        z zVar = yVar.c;
        if (zVar != null) {
            s.d(fVar, wVar, zVar);
        }
    }
}
