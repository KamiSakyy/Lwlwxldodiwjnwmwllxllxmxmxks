package to;

import aa.o0;
import aa.w;
import java.util.List;
import so.z;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "fullDatabaseId", "updatesChannel"});

    public static z c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
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
            return new z(str, str2, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, z zVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, zVar.a);
        fVar.z0("fullDatabaseId");
        o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, zVar.b);
        fVar.z0("updatesChannel");
        o0Var.b(fVar, wVar, zVar.c);
    }
}
