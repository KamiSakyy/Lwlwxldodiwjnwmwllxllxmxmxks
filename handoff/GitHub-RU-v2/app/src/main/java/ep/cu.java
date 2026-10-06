package ep;

import java.util.ArrayList;
import java.util.List;
import jo.d70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cu implements aaShadow.a {
    public static final cu a = new cu();
    public static final List b = sy.d0Shadow.o("spokenLanguages", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                arrayList = aa.c.a(aa.c.b(aa.c.c(du.a, false))).c(eVar, wVar);
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
            return new d70(str, str2, arrayList);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d70 d70Var = (d70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d70Var, "value");
        fVar.z0("spokenLanguages");
        aa.c.a(aa.c.b(aa.c.c(du.a, false))).e(fVar, wVar, d70Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d70Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, d70Var.c);
    }
}
