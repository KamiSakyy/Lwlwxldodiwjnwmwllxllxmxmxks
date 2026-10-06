package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o9 implements aaShadow.a {
    public static final o9 a = new o9();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.ge geVar;
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
            geVar = p9.c(eVar, wVar);
        } else {
            geVar = null;
        }
        if (str2 != null) {
            return new u10.fe(str, str2, geVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.fe feVar = (u10.fe) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(feVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, feVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, feVar.b);
        u10.ge geVar = feVar.c;
        if (geVar != null) {
            p9.d(fVar, wVar, geVar);
        }
    }
}
