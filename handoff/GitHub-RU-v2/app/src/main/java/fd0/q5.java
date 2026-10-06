package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q5 implements aaShadow.a {
    public static final q5 a = new q5();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "pullRequestReview"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.t8 t8Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                t8Var = (kc0.t8) aa.c.b(aa.c.c(s5.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new kc0.r8(str, t8Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.r8 r8Var = (kc0.r8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r8Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, r8Var.a);
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(s5.a, false)).b(fVar, wVar, r8Var.b);
    }
}
