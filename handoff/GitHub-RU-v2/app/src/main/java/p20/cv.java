package p20;

import java.util.ArrayList;
import java.util.List;
import u10.f90;
import u10.i90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cv implements aaShadow.a {
    public static final cv a = new cv();
    public static final List b = sy.d0.o("id", "hasCreatedLists", "suggestedListNames", "lists", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        ArrayList arrayList = null;
        f90 f90Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                arrayList = aa.c.a(aa.c.c(bv.a, false)).c(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                f90Var = (f90) aa.c.c(zu.a, false).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "hasCreatedLists");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (arrayList == null) {
            k41.b.B(eVar, "suggestedListNames");
            throw null;
        }
        if (f90Var == null) {
            k41.b.B(eVar, "lists");
            throw null;
        }
        if (str2 != null) {
            return new i90(str, booleanValue, arrayList, f90Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i90 i90Var = (i90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i90Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i90Var.a);
        fVar.z0("hasCreatedLists");
        jo.f4.C(i90Var.b, aa.c.f, fVar, wVar, "suggestedListNames");
        aa.c.a(aa.c.c(bv.a, false)).e(fVar, wVar, i90Var.c);
        fVar.z0("lists");
        aa.c.c(zu.a, false).b(fVar, wVar, i90Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i90Var.e);
    }
}
