package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o5 implements aaShadow.a {
    public static final o5 a = new o5();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "replyTo", "discussion", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.r8 r8Var = null;
        jn0.p8 p8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                r8Var = (jn0.r8) aa.c.b(aa.c.c(u5.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                p8Var = (jn0.p8) aa.c.b(aa.c.c(s5.a, false)).a(eVar, wVar);
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
        if (str2 != null) {
            return new jn0.k8(str, r8Var, p8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.k8 k8Var = (jn0.k8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k8Var.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(u5.a, true)).b(fVar, wVar, k8Var.b);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(s5.a, false)).b(fVar, wVar, k8Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k8Var.d);
    }
}
