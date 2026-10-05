package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q3 implements aa.a {
    public static final q3 a = new q3();
    public static final List b = sy.d0.o("codeSearch", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.q5 q5Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                q5Var = (jo.q5) aa.c.c(p3.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (q5Var == null) {
            k41.b.B(eVar, "codeSearch");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.s5(q5Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.s5 s5Var = (jo.s5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s5Var, "value");
        fVar.z0("codeSearch");
        aa.c.c(p3.a, false).b(fVar, wVar, s5Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s5Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, s5Var.c);
    }
}
