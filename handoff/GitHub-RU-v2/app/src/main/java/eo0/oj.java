package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oj implements aaShadow.a {
    public static final oj a = new oj();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        cp0.g gVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            gVar = cp0.h.c(eVar, wVar);
        } else {
            gVar = null;
        }
        if (str2 != null) {
            return new jn0.ks(str, str2, gVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ks ksVar = (jn0.ks) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ksVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ksVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ksVar.b);
        cp0.g gVar = ksVar.c;
        if (gVar != null) {
            cp0.h.d(fVar, wVar, gVar);
        }
    }
}
