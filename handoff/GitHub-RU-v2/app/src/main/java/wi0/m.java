package wi0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements aa.a {
    public static final m a = new m();
    public static final List b = d0.o(new String[]{"__typename", "login"});

    public final Object a(ea.e eVar, w wVar) {
        k kVar;
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
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            kVar = q.c(eVar, wVar);
        } else {
            kVar = null;
        }
        eVar.s0();
        ud0.c c = ud0.d.c(eVar, wVar);
        if (str2 != null) {
            return new g(str, str2, kVar, c);
        }
        k41.b.B(eVar, "login");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        g gVar = (g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gVar.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, gVar.b);
        k kVar = gVar.c;
        if (kVar != null) {
            q.d(fVar, wVar, kVar);
        }
        List list = ud0.d.a;
        ud0.d.d(fVar, wVar, gVar.d);
    }
}
