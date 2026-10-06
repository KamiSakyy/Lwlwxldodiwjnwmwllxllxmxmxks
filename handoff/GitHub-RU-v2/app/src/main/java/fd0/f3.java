package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f3 implements aaShadow.a {
    public static final f3 a = new f3();
    public static final List b = sy.d0.n("codeSearch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.a5 a5Var = null;
        while (eVar.r0(b) == 0) {
            a5Var = (kc0.a5) aa.c.c(e3.a, false).a(eVar, wVar);
        }
        if (a5Var != null) {
            return new kc0.c5(a5Var);
        }
        k41.b.B(eVar, "codeSearch");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.c5 c5Var = (kc0.c5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c5Var, "value");
        fVar.z0("codeSearch");
        aa.c.c(e3.a, false).b(fVar, wVar, c5Var.a);
    }
}
