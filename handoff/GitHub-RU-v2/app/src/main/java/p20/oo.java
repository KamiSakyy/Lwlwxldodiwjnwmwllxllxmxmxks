package p20;

import java.util.List;
import u10.vz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oo implements aaShadow.a {
    public static final oo a = new oo();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
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
        w80.a2 c = w80.h2.c(eVar, wVar);
        eVar.s0();
        w80.h c2 = w80.m.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new vz(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        vz vzVar = (vz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vzVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vzVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, vzVar.b);
        List list = w80.h2.a;
        w80.h2.d(fVar, wVar, vzVar.c);
        List list2 = w80.m.a;
        w80.m.d(fVar, wVar, vzVar.d);
    }
}
