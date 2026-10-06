package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z2 implements aaShadow.a {
    public static final z2 a = new z2();
    public static final List b = sy.d0.n("closeIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.q4 q4Var = null;
        while (eVar.r0(b) == 0) {
            q4Var = (kc0.q4) aa.c.b(aa.c.c(y2.a, false)).a(eVar, wVar);
        }
        return new kc0.s4(q4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.s4 s4Var = (kc0.s4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s4Var, "value");
        fVar.z0("closeIssue");
        aa.c.b(aa.c.c(y2.a, false)).b(fVar, wVar, s4Var.a);
    }
}
