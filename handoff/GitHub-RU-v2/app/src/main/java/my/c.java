package my;

import aa.w;
import java.util.List;
import qx.b1;
import qx.z0;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = d0.o("__typename", "id");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        z0 c = b1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new ly.d(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ly.d dVar = (ly.d) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, dVar.b);
        List list = b1.a;
        b1.d(fVar, wVar, dVar.c);
    }
    public static final Object f = null;
    public static final Object i = null;
}
