package zx0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.o(new String[]{"viewGroupId", "items", "__typename"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        yx0.l lVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                lVar = (yx0.l) aa.c.c(i.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (lVar == null) {
            k41.b.B(eVar, "items");
            throw null;
        }
        if (str2 != null) {
            return new yx0.k(str, lVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        yx0.k kVar = (yx0.k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("viewGroupId");
        aa.c.i.b(fVar, wVar, kVar.a);
        fVar.z0("items");
        aa.c.c(i.a, true).b(fVar, wVar, kVar.b);
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, kVar.c);
    }
}
