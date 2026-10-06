package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s5 implements aaShadow.a {
    public static final s5 a = new s5();
    public static final List b = sy.d0.o(new String[]{"id", "comments", "answer", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.l8 l8Var = null;
        jn0.j8 j8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                l8Var = (jn0.l8) aa.c.c(p5.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                j8Var = (jn0.j8) aa.c.b(aa.c.c(n5.a, false)).a(eVar, wVar);
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
        if (l8Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new jn0.p8(str, l8Var, j8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.p8 p8Var = (jn0.p8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p8Var.a);
        fVar.z0("comments");
        aa.c.c(p5.a, false).b(fVar, wVar, p8Var.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(n5.a, false)).b(fVar, wVar, p8Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p8Var.d);
    }
}
