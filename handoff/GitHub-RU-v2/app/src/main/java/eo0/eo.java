package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eo implements aa.a {
    public static final eo a = new eo();
    public static final List b = sy.d0.o(new String[]{"id", "comparison", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.ny nyVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                nyVar = (jn0.ny) aa.c.b(aa.c.c(zn.a, false)).a(eVar, wVar);
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
            return new jn0.ry(str, nyVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ry ryVar = (jn0.ry) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ryVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ryVar.a);
        fVar.z0("comparison");
        aa.c.b(aa.c.c(zn.a, false)).b(fVar, wVar, ryVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ryVar.c);
    }
}
