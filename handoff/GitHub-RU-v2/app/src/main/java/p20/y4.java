package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y4 implements aaShadow.a {
    public static final y4 a = new y4();
    public static final List b = sy.d0.o("id", "comments", "answer", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.j7 j7Var = null;
        u10.h7 h7Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                j7Var = (u10.j7) aa.c.c(v4.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                h7Var = (u10.h7) aa.c.b(aa.c.c(t4.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (j7Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new u10.n7(str, j7Var, h7Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.n7 n7Var = (u10.n7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n7Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n7Var.a);
        fVar.z0("comments");
        aa.c.c(v4.a, false).b(fVar, wVar, n7Var.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(t4.a, false)).b(fVar, wVar, n7Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, n7Var.d);
    }
}
