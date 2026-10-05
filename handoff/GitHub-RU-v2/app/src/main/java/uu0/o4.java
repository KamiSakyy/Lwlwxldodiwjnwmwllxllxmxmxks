package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o4 implements aa.a {
    public static final o4 a = new o4();
    public static final List b = sy.d0.o(new String[]{"__typename", "login"});

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
        cp0.g c = cp0.h.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new i4(str, str2, c);
        }
        k41.b.B(eVar, "login");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i4 i4Var = (i4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i4Var.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, i4Var.b);
        List list = cp0.h.a;
        cp0.h.d(fVar, wVar, i4Var.c);
    }
}
