package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gb implements aaShadow.a {
    public static final gb a = new gb();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.rg rgVar;
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
        if (m71.a.v(m71.a.O(new String[]{"User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            rgVar = hb.c(eVar, wVar);
        } else {
            rgVar = null;
        }
        if (str2 != null) {
            return new jn0.qg(str, str2, rgVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qg qgVar = (jn0.qg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qgVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qgVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, qgVar.b);
        jn0.rg rgVar = qgVar.c;
        if (rgVar != null) {
            hb.d(fVar, wVar, rgVar);
        }
    }
}
