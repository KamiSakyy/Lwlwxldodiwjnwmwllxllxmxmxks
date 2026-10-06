package w10;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
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
        v10.f c = e.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new v10.k(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        v10.k kVar = (v10.k) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(kVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, kVar.b);
        List list = e.a;
        v10.f fVar2 = kVar.c;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(fVar2, "value");
        fVar.z0("achievements");
        aa.c.c(b.a, false).b(fVar, wVar, fVar2.a);
    }
}
