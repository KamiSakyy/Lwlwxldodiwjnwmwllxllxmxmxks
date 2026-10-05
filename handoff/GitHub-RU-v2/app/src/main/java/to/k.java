package to;

import aa.w;
import java.util.List;
import so.t;
import so.u;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0.o("__typename", "id");

    public final Object a(ea.e eVar, w wVar) {
        u uVar;
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
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            uVar = l.c(eVar, wVar);
        } else {
            uVar = null;
        }
        if (str2 != null) {
            return new t(str, str2, uVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        t tVar = (t) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, tVar.b);
        u uVar = tVar.c;
        if (uVar != null) {
            l.d(fVar, wVar, uVar);
        }
    }
}
