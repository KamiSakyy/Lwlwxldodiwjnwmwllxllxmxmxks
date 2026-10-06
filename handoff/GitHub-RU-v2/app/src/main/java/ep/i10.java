package ep;

import java.util.ArrayList;
import java.util.List;
import jo.th0;
import jo.wh0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i10 implements aaShadow.a {
    public static final i10 a = new i10();
    public static final List b = sy.d0Shadow.o("id", "hasCreatedLists", "suggestedListNames", "lists", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        ArrayList arrayList = null;
        th0 th0Var = null;
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
                arrayList = aa.c.a(aa.c.c(h10.a, false)).c(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                th0Var = (th0) aa.c.c(f10.a, false).a(eVar, wVar);
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
        if (th0Var == null) {
            k41.b.B(eVar, "lists");
            throw null;
        }
        if (str2 != null) {
            return new wh0(str, booleanValue, arrayList, th0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wh0 wh0Var = (wh0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wh0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wh0Var.a);
        fVar.z0("hasCreatedLists");
        jo.f4Shadow.C(wh0Var.b, aa.c.f, fVar, wVar, "suggestedListNames");
        aa.c.a(aa.c.c(h10.a, false)).e(fVar, wVar, wh0Var.c);
        fVar.z0("lists");
        aa.c.c(f10.a, false).b(fVar, wVar, wh0Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, wh0Var.e);
    }
}
