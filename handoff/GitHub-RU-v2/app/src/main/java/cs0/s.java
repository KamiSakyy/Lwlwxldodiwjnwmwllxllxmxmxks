package cs0;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "labels"});

    public static h c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        c cVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                cVar = (c) aa.c.b(aa.c.c(m.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new h(str, cVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, h hVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, hVar.a);
        fVar.z0("labels");
        aa.c.b(aa.c.c(m.a, false)).b(fVar, wVar, hVar.b);
    }
}
