package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ol implements aaShadow.a {
    public static final ol a = new ol();
    public static final List b = sy.d0.o(new String[]{"repository", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.lv lvVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                lvVar = (jn0.lv) aa.c.b(aa.c.c(sl.a, false)).a(eVar, wVar);
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
            return new jn0.hv(lvVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.hv hvVar = (jn0.hv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hvVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(sl.a, false)).b(fVar, wVar, hvVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hvVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, hvVar.c);
    }
}
