package eo0;

import java.util.List;
import jn0.na0;
import jn0.oa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fw implements aaShadow.a {
    public static final fw a = new fw();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "issueType", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        oa0 oa0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                oa0Var = (oa0) aa.c.b(aa.c.c(gw.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new na0(str, oa0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0 na0Var = (na0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(na0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, na0Var.a);
        fVar.z0("issueType");
        aa.c.b(aa.c.c(gw.a, true)).b(fVar, wVar, na0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, na0Var.c);
    }
}
