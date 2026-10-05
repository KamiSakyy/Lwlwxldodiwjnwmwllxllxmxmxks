package ax;

import aa.w;
import ea.e;
import ea.f;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "name", "organization", "id"});

    public static b c(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                aVar = (a) aa.c.c(c.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (aVar == null) {
            k41.b.B(eVar, "organization");
            throw null;
        }
        if (str3 != null) {
            return new b(str, str2, aVar, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(f fVar, w wVar, b bVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("name");
        bVar2.b(fVar, wVar, bVar.b);
        fVar.z0("organization");
        aa.c.c(c.a, false).b(fVar, wVar, bVar.c);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.d);
    }

}
