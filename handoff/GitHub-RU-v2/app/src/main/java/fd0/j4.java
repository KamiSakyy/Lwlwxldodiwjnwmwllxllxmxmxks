package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j4 implements aaShadow.a {
    public static final j4 a = new j4();
    public static final List b = sy.d0.n("createIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.r6 r6Var = null;
        while (eVar.r0(b) == 0) {
            r6Var = (kc0.r6) aa.c.b(aa.c.c(i4.a, false)).a(eVar, wVar);
        }
        return new kc0.s6(r6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.s6 s6Var = (kc0.s6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s6Var, "value");
        fVar.z0("createIssue");
        aa.c.b(aa.c.c(i4.a, false)).b(fVar, wVar, s6Var.a);
    }
}
