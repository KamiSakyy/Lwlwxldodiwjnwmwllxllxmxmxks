package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a7 implements aa.a {
    public static final a7 a = new a7();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

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
        j5 c = u6.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new o5(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o5 o5Var = (o5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, o5Var.b);
        List list = u6.a;
        j5 j5Var = o5Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j5Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, j5Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, j5Var.b);
        fVar.z0("login");
        bVar2.b(fVar, wVar, j5Var.c);
        List list2 = cp0.h.a;
        cp0.h.d(fVar, wVar, j5Var.d);
    }
}
