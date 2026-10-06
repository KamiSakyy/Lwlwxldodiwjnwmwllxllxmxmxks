package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k1 implements aaShadow.a {
    public static final k1 a = new k1();
    public static final List b = sy.d0.o(new String[]{"viewer", "node"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.x2 x2Var = null;
        kc0.r2 r2Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                x2Var = (kc0.x2) aa.c.c(s1.a, true).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                r2Var = (kc0.r2) aa.c.b(aa.c.c(m1.a, true)).a(eVar, wVar);
            }
        }
        if (x2Var != null) {
            return new kc0.p2(x2Var, r2Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.p2 p2Var = (kc0.p2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p2Var, "value");
        fVar.z0("viewer");
        aa.c.c(s1.a, true).b(fVar, wVar, p2Var.a);
        fVar.z0("node");
        aa.c.b(aa.c.c(m1.a, true)).b(fVar, wVar, p2Var.b);
    }
}
