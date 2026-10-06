package to0;

import aa.w;
import ea.e;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0Shadow.o(new String[]{"name", "enabled"});

    public final Object a(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(b);
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
            k41.b.B(eVar, "name");
            throw null;
        }
        if (bool != null) {
            return new so0.c(str, bool.booleanValue());
        }
        k41.b.B(eVar, "enabled");
        throw null;
    }

    public final void b(f fVar, w wVar, Object obj) {
        so0.c cVar = (so0.c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("name");
        aa.c.a.b(fVar, wVar, cVar.a);
        fVar.z0("enabled");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(cVar.b));
    }
}
