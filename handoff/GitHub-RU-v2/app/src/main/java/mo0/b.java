package mo0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0Shadow.o(new String[]{"node", "id", "__typename"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        lo0.f fVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fVar = (lo0.f) aa.c.b(aa.c.c(e.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new lo0.c(fVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lo0.c cVar = (lo0.c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(e.a, true)).b(fVar, wVar, cVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, cVar.c);
    }
}
