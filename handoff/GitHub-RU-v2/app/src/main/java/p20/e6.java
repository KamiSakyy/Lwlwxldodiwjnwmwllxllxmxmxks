package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e6 implements aa.a {
    public static final e6 a = new e6();
    public static final List b = sy.d0.o("actor", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.d9 d9Var = null;
        u10.i9 i9Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d9Var = (u10.d9) aa.c.b(aa.c.c(b6.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new u10.h9(d9Var, i9Var);
                }
                i9Var = (u10.i9) aa.c.b(aa.c.c(f6.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.h9 h9Var = (u10.h9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h9Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(b6.a, true)).b(fVar, wVar, h9Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(f6.a, false)).b(fVar, wVar, h9Var.b);
    }
}
