package zx0;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "groups"});

    public static yx0.f c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        yx0.c cVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                cVar = (yx0.c) aa.c.c(b.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (cVar != null) {
            return new yx0.f(str, cVar);
        }
        k41.b.B(eVar, "groups");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, yx0.f fVar2) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, fVar2.a);
        fVar.z0("groups");
        aa.c.c(b.a, false).b(fVar, wVar, fVar2.b);
    }
}
