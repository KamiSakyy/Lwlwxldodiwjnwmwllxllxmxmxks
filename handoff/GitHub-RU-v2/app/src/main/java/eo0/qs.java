package eo0;

import java.util.ArrayList;
import java.util.List;
import jn0.d50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qs implements aaShadow.a {
    public static final qs a = new qs();
    public static final List b = sy.d0.o(new String[]{"spokenLanguages", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                arrayList = aa.c.a(aa.c.b(aa.c.c(rs.a, false))).c(eVar, wVar);
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
            k41.b.B(eVar, "spokenLanguages");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new d50(str, str2, arrayList);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d50 d50Var = (d50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d50Var, "value");
        fVar.z0("spokenLanguages");
        aa.c.a(aa.c.b(aa.c.c(rs.a, false))).e(fVar, wVar, d50Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d50Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, d50Var.c);
    }
}
