package lv;

import aa.w;
import java.util.List;
import java.util.Set;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = d0.o("__typename", "login");

    public final Object a(ea.e eVar, w wVar) {
        l lVar;
        k kVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
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
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            lVar = s.c(eVar, wVar);
        } else {
            lVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot"}), set2, str, set)) {
            eVar.s0();
            kVar = r.c(eVar, wVar);
        } else {
            kVar = null;
        }
        eVar.s0();
        eq.g c = eq.h.c(eVar, wVar);
        if (str2 != null) {
            return new g(str, str2, lVar, kVar, c);
        }
        k41.b.B(eVar, "login");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        g gVar = (g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gVar.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, gVar.b);
        l lVar = gVar.c;
        if (lVar != null) {
            s.d(fVar, wVar, lVar);
        }
        k kVar = gVar.d;
        if (kVar != null) {
            r.d(fVar, wVar, kVar);
        }
        List list = eq.h.a;
        eq.h.d(fVar, wVar, gVar.e);
    }
}
