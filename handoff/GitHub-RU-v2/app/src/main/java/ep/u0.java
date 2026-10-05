package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 implements aa.a {
    public static final u0 a = new u0();
    public static final List b = sy.d0.o("id", "comments", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.k1 k1Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                k1Var = (jo.k1) aa.c.c(q0.a, false).a(eVar, wVar);
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
        if (k1Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new jo.p1(str, k1Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.p1 p1Var = (jo.p1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p1Var.a);
        fVar.z0("comments");
        aa.c.c(q0.a, false).b(fVar, wVar, p1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p1Var.c);
    }
}
