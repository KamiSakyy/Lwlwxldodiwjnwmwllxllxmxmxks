package cp0;

import aa.w;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e implements aa.a {
    public static final List a = l.r(new String[]{"id", "isCopilot"});

    public static a c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
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
            return new a(str, bool.booleanValue());
        }
        k41.b.B(eVar, "isCopilot");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, aVar.a);
        fVar.z0("isCopilot");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(aVar.b));
    }

}
