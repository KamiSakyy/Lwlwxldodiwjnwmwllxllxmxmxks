package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 implements aa.a {
    public static final r1 a = new r1();
    public static final List b = sy.d0.o("__typename", "id");

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
        w6 c = x6.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new n1(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n1 n1Var = (n1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, n1Var.b);
        List list = x6.a;
        w6 w6Var = n1Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w6Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, w6Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, w6Var.b);
        fVar.z0("login");
        bVar2.b(fVar, wVar, w6Var.c);
        fVar.z0("url");
        bVar2.b(fVar, wVar, w6Var.d);
        List list2 = eq.h.a;
        eq.h.d(fVar, wVar, w6Var.e);
    }
}
