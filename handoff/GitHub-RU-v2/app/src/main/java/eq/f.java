package eq;

import aa.w;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f implements aa.a {
    public static final List a = l.r(new String[]{"id", "name"});

    public static b c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new b(str, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, b bVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, bVar.a);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, bVar.b);
    }

}
