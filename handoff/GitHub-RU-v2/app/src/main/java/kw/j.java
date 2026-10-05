package kw;

import aa.w;
import java.util.List;
import jo.f4;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "asCodeOwner", "requestedReviewer"});

    public static e c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Boolean bool = null;
        d dVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                dVar = (d) aa.c.b(aa.c.c(i.a, true)).a(eVar, wVar);
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
        if (bool != null) {
            return new e(str, str2, bool.booleanValue(), dVar);
        }
        k41.b.B(eVar, "asCodeOwner");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, e eVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(eVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, eVar.b);
        fVar.z0("asCodeOwner");
        f4.C(eVar.c, aa.c.f, fVar, wVar, "requestedReviewer");
        aa.c.b(aa.c.c(i.a, true)).b(fVar, wVar, eVar.d);
    }
}
