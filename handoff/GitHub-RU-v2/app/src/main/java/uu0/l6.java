package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l6 implements aa.a {
    public static final l6 a = new l6();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public static i6 c(ea.e eVar, aa.w wVar) {
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
        g6 g6Var = g6.a;
        d6 c = g6.c(eVar, wVar);
        eVar.s0();
        r0 c2 = u0.c(eVar, wVar);
        eVar.s0();
        a6 a6Var = a6.a;
        v5 c3 = a6.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new i6(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, i6 i6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i6Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i6Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, i6Var.b);
        g6 g6Var = g6.a;
        g6.d(fVar, wVar, i6Var.c);
        List list = u0.a;
        u0.d(fVar, wVar, i6Var.d);
        a6 a6Var = a6.a;
        a6.d(fVar, wVar, i6Var.e);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (i6) obj);
    }
}
