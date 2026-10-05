package qx;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y1 implements aa.a {
    public static final y1 a = new y1();
    public static final List b = sy.d0.o("achievable", "tier", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e1 e1Var = null;
        s1 s1Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                e1Var = (e1) aa.c.c(u1.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                s1Var = (s1) aa.c.b(aa.c.c(i2.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (e1Var == null) {
            k41.b.B(eVar, "achievable");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new i1(e1Var, s1Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i1 i1Var = (i1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i1Var, "value");
        fVar.z0("achievable");
        aa.c.c(u1.a, false).b(fVar, wVar, i1Var.a);
        fVar.z0("tier");
        aa.c.b(aa.c.c(i2.a, false)).b(fVar, wVar, i1Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i1Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i1Var.d);
    }
}
