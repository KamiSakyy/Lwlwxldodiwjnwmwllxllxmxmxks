package k60;

import aa.w;
import java.util.List;
import jo.f4;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h implements aa.a {
    public static final List a = l.r(new String[]{"repository", "id", "viewerCanReact", "viewerCanUpvote"});

    public static a c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d dVar = null;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                dVar = (d) aa.c.c(k.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (dVar == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "viewerCanReact");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new a(dVar, str, booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "viewerCanUpvote");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, a aVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("repository");
        aa.c.c(k.a, false).b(fVar, wVar, aVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, aVar.b);
        fVar.z0("viewerCanReact");
        aa.b bVar = aa.c.f;
        f4.C(aVar.c, bVar, fVar, wVar, "viewerCanUpvote");
        bVar.b(fVar, wVar, Boolean.valueOf(aVar.d));
    }
}
