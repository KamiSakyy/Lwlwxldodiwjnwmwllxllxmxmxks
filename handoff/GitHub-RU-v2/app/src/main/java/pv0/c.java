package pv0;

import aa.w;
import ea.e;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = d0.o(new String[]{"__typename", "name", "id"});

    public final Object a(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str3 != null) {
            return new a(str, str2, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(f fVar, w wVar, Object obj) {
        a aVar = (a) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, aVar.a);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, aVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, aVar.c);
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object i = null;
}
