package xt;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r implements aa.a {
    public static final List a = x61.l.r(new String[]{"duplicateOf", "id"});

    public static f c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d dVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                dVar = (d) aa.c.b(aa.c.c(o.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new f(dVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, f fVar2) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("duplicateOf");
        aa.c.b(aa.c.c(o.a, true)).b(fVar, wVar, fVar2.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, fVar2.b);
    }
}
