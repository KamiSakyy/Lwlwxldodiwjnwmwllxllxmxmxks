package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tg implements aaShadow.a {
    public static final tg a = new tg();
    public static final List b = sy.d0Shadow.o(new String[]{"organizations", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.to toVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                toVar = (jn0.to) aa.c.c(rg.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (toVar == null) {
            k41.b.B(eVar, "organizations");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.vo(toVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.vo voVar = (jn0.vo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(voVar, "value");
        fVar.z0("organizations");
        aa.c.c(rg.a, false).b(fVar, wVar, voVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, voVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, voVar.c);
    }
}
