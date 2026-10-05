package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u7 implements aa.a {
    public static final u7 a = new u7();
    public static final List b = sy.d0.o("id", "comments", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        p7 p7Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                p7Var = (p7) aa.c.c(t7.a, false).a(eVar, wVar);
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
        if (p7Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new q7(str, p7Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q7 q7Var = (q7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q7Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q7Var.a);
        fVar.z0("comments");
        aa.c.c(t7.a, false).b(fVar, wVar, q7Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q7Var.c);
    }
}
