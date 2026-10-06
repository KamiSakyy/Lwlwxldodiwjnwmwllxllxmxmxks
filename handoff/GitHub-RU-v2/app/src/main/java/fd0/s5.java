package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s5 implements aaShadow.a {
    public static final s5 a = new s5();
    public static final List b = sy.d0.o(new String[]{"id", "pullRequest", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.s8 s8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                s8Var = (kc0.s8) aa.c.c(r5.a, true).a(eVar, wVar);
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
        if (s8Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new kc0.t8(str, s8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.t8 t8Var = (kc0.t8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t8Var.a);
        fVar.z0("pullRequest");
        aa.c.c(r5.a, true).b(fVar, wVar, t8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t8Var.c);
    }
}
