package zx0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, w wVar) {
        yx0.n nVar;
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
            nVar = k.c(eVar, wVar);
        } else {
            nVar = null;
        }
        if (str2 != null) {
            return new yx0.m(str, str2, nVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        yx0.m mVar = (yx0.m) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, mVar.b);
        yx0.n nVar = mVar.c;
        if (nVar != null) {
            k.d(fVar, wVar, nVar);
        }
    }
}
