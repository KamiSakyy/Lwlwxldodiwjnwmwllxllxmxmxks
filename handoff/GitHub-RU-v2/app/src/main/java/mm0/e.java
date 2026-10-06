package mm0;

import aa.w;
import java.util.List;
import k71.k;
import lm0.l;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0Shadow.o(new String[]{"id", "description", "descriptionHTML", "shortDescriptionHTML", "__typename"});

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str5 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "descriptionHTML");
            throw null;
        }
        if (str4 == null) {
            k41.b.B(eVar, "shortDescriptionHTML");
            throw null;
        }
        if (str5 != null) {
            return new l(str, str2, str3, str4, str5);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        l lVar = (l) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(lVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lVar.a);
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, lVar.b);
        fVar.z0("descriptionHTML");
        bVar.b(fVar, wVar, lVar.c);
        fVar.z0("shortDescriptionHTML");
        bVar.b(fVar, wVar, lVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, lVar.e);
    }
}
