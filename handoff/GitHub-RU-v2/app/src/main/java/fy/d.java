package fy;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "pullRequestStatus"});

    public static ey.e c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ey.f fVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                fVar = (ey.f) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new ey.e(str, fVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, ey.e eVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, eVar.a);
        fVar.z0("pullRequestStatus");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, eVar.b);
    }
}
