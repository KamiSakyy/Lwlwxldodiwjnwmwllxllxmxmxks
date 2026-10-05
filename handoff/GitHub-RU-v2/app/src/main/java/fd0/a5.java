package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a5 implements aa.a {
    public static final a5 a = new a5();
    public static final List b = sy.d0.o(new String[]{"id", "replyTo", "discussion", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.x7 x7Var = null;
        kc0.v7 v7Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                x7Var = (kc0.x7) aa.c.b(aa.c.c(g5.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                v7Var = (kc0.v7) aa.c.b(aa.c.c(e5.a, false)).a(eVar, wVar);
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
            return new kc0.q7(str, x7Var, v7Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.q7 q7Var = (kc0.q7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q7Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q7Var.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(g5.a, true)).b(fVar, wVar, q7Var.b);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(e5.a, false)).b(fVar, wVar, q7Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q7Var.d);
    }
}
