package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wk implements aa.a {
    public static final wk a = new wk();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        eq.g gVar;
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
            gVar = eq.h.c(eVar, wVar);
        } else {
            gVar = null;
        }
        if (str2 != null) {
            return new jo.iu(str, str2, gVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.iu iuVar = (jo.iu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iuVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iuVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, iuVar.b);
        eq.g gVar = iuVar.c;
        if (gVar != null) {
            eq.h.d(fVar, wVar, gVar);
        }
    }
}
