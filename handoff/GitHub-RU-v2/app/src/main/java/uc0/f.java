package uc0;

import aa.o0;
import aa.w;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f implements aa.a {
    public static final List a = l.r(new String[]{"id", "fullDatabaseId", "updatesChannel"});

    public static tc0.i c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new tc0.i(str, str2, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, tc0.i iVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(iVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, iVar.a);
        fVar.z0("fullDatabaseId");
        o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, iVar.b);
        fVar.z0("updatesChannel");
        o0Var.b(fVar, wVar, iVar.c);
    }
}
