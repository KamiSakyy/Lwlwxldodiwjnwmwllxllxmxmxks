package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n5 implements aaShadow.a {
    public static final n5 a = new n5();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "replyTo", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.q8 q8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                q8Var = (jn0.q8) aa.c.b(aa.c.c(t5.a, false)).a(eVar, wVar);
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
        if (str2 != null) {
            return new jn0.j8(str, q8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.j8 j8Var = (jn0.j8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j8Var.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(t5.a, false)).b(fVar, wVar, j8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j8Var.c);
    }
}
