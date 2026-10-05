package ah0;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "viewerCanReact"});

    public static c c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool != null) {
            return new c(str, bool.booleanValue());
        }
        k41.b.B(eVar, "viewerCanReact");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, cVar.a);
        fVar.z0("viewerCanReact");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(cVar.b));
    }

}
