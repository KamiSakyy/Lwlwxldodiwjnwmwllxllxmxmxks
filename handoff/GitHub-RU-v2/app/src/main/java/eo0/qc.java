package eo0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qc implements aaShadow.a {
    public static final qc a = new qc();
    public static final List b = sy.d0.o(new String[]{"programmingLanguages", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                arrayList = aa.c.a(aa.c.b(aa.c.c(rc.a, false))).c(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (arrayList == null) {
            k41.b.B(eVar, "programmingLanguages");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.oi(str, str2, arrayList);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.oi oiVar = (jn0.oi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oiVar, "value");
        fVar.z0("programmingLanguages");
        aa.c.a(aa.c.b(aa.c.c(rc.a, false))).e(fVar, wVar, oiVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oiVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, oiVar.c);
    }
}
