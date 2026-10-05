package c60;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "labels"});

    public static g c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        a aVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                aVar = (a) aa.c.b(aa.c.c(k.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new g(str, aVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, g gVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, gVar.a);
        fVar.z0("labels");
        aa.c.b(aa.c.c(k.a, false)).b(fVar, wVar, gVar.b);
    }

}
