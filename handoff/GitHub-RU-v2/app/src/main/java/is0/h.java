package is0;

import aa.w;
import java.util.List;
import sy.d0;
import ur0.k0;
import ur0.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.o(new String[]{"__typename", "id"});

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
        k0 c = l0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new b(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        b bVar = (b) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.b);
        List list = l0.a;
        l0.d(fVar, wVar, bVar.c);
    }

}
