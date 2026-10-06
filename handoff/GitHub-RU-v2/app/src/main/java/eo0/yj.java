package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yj implements aaShadow.a {
    public static final yj a = new yj();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.js jsVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Tag"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            jsVar = nj.c(eVar, wVar);
        } else {
            jsVar = null;
        }
        if (str2 != null) {
            return new jn0.us(str, str2, jsVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.us usVar = (jn0.us) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(usVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, usVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, usVar.b);
        jn0.js jsVar = usVar.c;
        if (jsVar != null) {
            nj.d(fVar, wVar, jsVar);
        }
    }
}
