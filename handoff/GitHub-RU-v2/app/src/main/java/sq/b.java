package sq;

import aa.c;
import aa.w;
import ea.e;
import ea.f;
import java.time.ZonedDateTime;
import java.util.List;
import k71.k;
import m10.sa;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "createdAt", "oldBase", "newBase"});

    public static a c(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                sa.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
            } else if (r0 == 3) {
                str3 = (String) c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str4 = (String) c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (zonedDateTime == null) {
            k41.b.B(eVar, "createdAt");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "oldBase");
            throw null;
        }
        if (str4 != null) {
            return new a(str, str2, str3, str4, zonedDateTime);
        }
        k41.b.B(eVar, "newBase");
        throw null;
    }

    public static void d(f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("__typename");
        aa.b bVar = c.a;
        bVar.b(fVar, wVar, aVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, aVar.b);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, aVar.c);
        fVar.z0("oldBase");
        bVar.b(fVar, wVar, aVar.d);
        fVar.z0("newBase");
        bVar.b(fVar, wVar, aVar.e);
    }
}
