package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j3 implements aa.a {
    public static final j3 a = new j3();
    public static final List b = sy.d0.o(new String[]{"codeSearch", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.g5 g5Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                g5Var = (jn0.g5) aa.c.c(i3.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (g5Var == null) {
            k41.b.B(eVar, "codeSearch");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.i5(g5Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.i5 i5Var = (jn0.i5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i5Var, "value");
        fVar.z0("codeSearch");
        aa.c.c(i3.a, false).b(fVar, wVar, i5Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i5Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i5Var.c);
    }
}
