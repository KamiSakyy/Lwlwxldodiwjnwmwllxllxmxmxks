package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mg implements aa.a {
    public static final mg a = new mg();
    public static final List b = sy.d0.o(new String[]{"teams", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.oo ooVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ooVar = (jn0.oo) aa.c.c(og.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (ooVar == null) {
            k41.b.B(eVar, "teams");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.mo(ooVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.mo moVar = (jn0.mo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(moVar, "value");
        fVar.z0("teams");
        aa.c.c(og.a, false).b(fVar, wVar, moVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, moVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, moVar.c);
    }
}
