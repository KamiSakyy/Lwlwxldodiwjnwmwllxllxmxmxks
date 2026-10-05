package to;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0.o("__typename", "id");

    public final Object a(ea.e eVar, w wVar) {
        so.m mVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            mVar = h.c(eVar, wVar);
        } else {
            mVar = null;
        }
        if (str2 != null) {
            return new so.l(str, str2, mVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        so.l lVar = (so.l) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, lVar.b);
        so.m mVar = lVar.c;
        if (mVar != null) {
            h.d(fVar, wVar, mVar);
        }
    }
}
