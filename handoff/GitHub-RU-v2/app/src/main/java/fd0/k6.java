package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k6 implements aaShadow.a {
    public static final k6 a = new k6();
    public static final List b = sy.d0.o(new String[]{"actor", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.l9 l9Var = null;
        kc0.q9 q9Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l9Var = (kc0.l9) aa.c.b(aa.c.c(h6.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new kc0.p9(l9Var, q9Var);
                }
                q9Var = (kc0.q9) aa.c.b(aa.c.c(l6.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.p9 p9Var = (kc0.p9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p9Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(h6.a, true)).b(fVar, wVar, p9Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(l6.a, false)).b(fVar, wVar, p9Var.b);
    }
}
