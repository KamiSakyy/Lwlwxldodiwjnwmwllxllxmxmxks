package k60;

import aa.w;
import java.util.List;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i implements aa.a {
    public static final List a = l.r(new String[]{"id", "viewerCanReact"});

    public static b c(ea.e eVar, w wVar) {
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
            return new b(str, bool.booleanValue());
        }
        k41.b.B(eVar, "viewerCanReact");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, b bVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, bVar.a);
        fVar.z0("viewerCanReact");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(bVar.b));
    }
}
