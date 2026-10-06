package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k5 implements aaShadow.a {
    public static final k5 a = new k5();
    public static final List b = sy.d0.o("__typename", "pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.l8 l8Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                l8Var = (u10.l8) aa.c.b(aa.c.c(m5.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new u10.j8(str, l8Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.j8 j8Var = (u10.j8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j8Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, j8Var.a);
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(m5.a, false)).b(fVar, wVar, j8Var.b);
    }
}
