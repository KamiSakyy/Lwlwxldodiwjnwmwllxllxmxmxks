package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l6 implements aaShadow.a {
    public static final l6 a = new l6();
    public static final List b = sy.d0Shadow.n("discussionCategory");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.t9 t9Var = null;
        while (eVar.r0(b) == 0) {
            t9Var = (u10.t9) aa.c.b(aa.c.c(m6.a, true)).a(eVar, wVar);
        }
        return new u10.s9(t9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.s9 s9Var = (u10.s9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s9Var, "value");
        fVar.z0("discussionCategory");
        aa.c.b(aa.c.c(m6.a, true)).b(fVar, wVar, s9Var.a);
    }
}
