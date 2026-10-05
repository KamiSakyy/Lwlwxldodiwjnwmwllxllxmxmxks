package fw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 implements aa.a {
    public static final a0 a = new a0();
    public static final List b = sy.d0.o(new String[]{"__typename", "login", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        cp0.g c = cp0.h.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "login");
            throw null;
        }
        if (str3 != null) {
            return new o(str, str2, str3, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o oVar = (o) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oVar.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, oVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, oVar.c);
        List list = cp0.h.a;
        cp0.h.d(fVar, wVar, oVar.d);
    }
}
