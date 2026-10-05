package zx0;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "group"});

    public static yx0.n c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        yx0.k kVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                kVar = (yx0.k) aa.c.b(aa.c.c(h.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new yx0.n(str, kVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, yx0.n nVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, nVar.a);
        fVar.z0("group");
        aa.c.b(aa.c.c(h.a, false)).b(fVar, wVar, nVar.b);
    }
}
