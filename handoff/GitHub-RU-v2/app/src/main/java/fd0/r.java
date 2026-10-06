package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements aaShadow.a {
    public static final r a = new r();
    public static final List b = sy.d0.o(new String[]{"subject", "reaction"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.g0 g0Var = null;
        kc0.f0 f0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                g0Var = (kc0.g0) aa.c.b(aa.c.c(v.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new kc0.b0(g0Var, f0Var);
                }
                f0Var = (kc0.f0) aa.c.b(aa.c.c(u.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.b0 b0Var = (kc0.b0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(v.a, true)).b(fVar, wVar, b0Var.a);
        fVar.z0("reaction");
        aa.c.b(aa.c.c(u.a, false)).b(fVar, wVar, b0Var.b);
    }
}
