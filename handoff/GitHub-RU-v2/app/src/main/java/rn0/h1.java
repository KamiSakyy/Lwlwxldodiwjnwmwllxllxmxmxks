package rn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "status"});

    public static qn0.y1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        qn0.z1 z1Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                z1Var = (qn0.z1) aa.c.b(aa.c.c(i1.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        vn0.a1 c = vn0.d1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new qn0.y1(str, str2, z1Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, qn0.y1 y1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, y1Var.b);
        fVar.z0("status");
        aa.c.b(aa.c.c(i1.a, false)).b(fVar, wVar, y1Var.c);
        List list = vn0.d1.a;
        vn0.d1.d(fVar, wVar, y1Var.d);
    }
}
