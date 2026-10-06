package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u4 implements aaShadow.a {
    public static final u4 a = new u4();
    public static final List b = sy.d0.o(new String[]{"shortcuts", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.n7 n7Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                n7Var = (kc0.n7) aa.c.c(y4.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (n7Var == null) {
            k41.b.B(eVar, "shortcuts");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new kc0.j7(n7Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.j7 j7Var = (kc0.j7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j7Var, "value");
        fVar.z0("shortcuts");
        aa.c.c(y4.a, false).b(fVar, wVar, j7Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j7Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j7Var.c);
    }
}
