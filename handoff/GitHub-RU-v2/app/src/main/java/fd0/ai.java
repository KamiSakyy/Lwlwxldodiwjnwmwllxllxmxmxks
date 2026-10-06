package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ai implements aaShadow.a {
    public static final ai a = new ai();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        ud0.c cVar;
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
            cVar = ud0.d.c(eVar, wVar);
        } else {
            cVar = null;
        }
        if (str2 != null) {
            return new kc0.iq(str, str2, cVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.iq iqVar = (kc0.iq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iqVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iqVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, iqVar.b);
        ud0.c cVar = iqVar.c;
        if (cVar != null) {
            ud0.d.d(fVar, wVar, cVar);
        }
    }
}
