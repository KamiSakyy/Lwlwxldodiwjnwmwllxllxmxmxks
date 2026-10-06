package eo0;

import java.util.ArrayList;
import java.util.List;
import jn0.ff0;
import jn0.if0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nz implements aaShadow.a {
    public static final nz a = new nz();
    public static final List b = sy.d0.o(new String[]{"id", "hasCreatedLists", "suggestedListNames", "lists", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        ArrayList arrayList = null;
        ff0 ff0Var = null;
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
                arrayList = aa.c.a(aa.c.c(mz.a, false)).c(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                ff0Var = (ff0) aa.c.c(kz.a, false).a(eVar, wVar);
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
        if (ff0Var == null) {
            k41.b.B(eVar, "lists");
            throw null;
        }
        if (str2 != null) {
            return new if0(str, booleanValue, arrayList, ff0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        if0 if0Var = (if0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(if0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, if0Var.a);
        fVar.z0("hasCreatedLists");
        jo.f4.C(if0Var.b, aa.c.f, fVar, wVar, "suggestedListNames");
        aa.c.a(aa.c.c(mz.a, false)).e(fVar, wVar, if0Var.c);
        fVar.z0("lists");
        aa.c.c(kz.a, false).b(fVar, wVar, if0Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, if0Var.e);
    }
}
