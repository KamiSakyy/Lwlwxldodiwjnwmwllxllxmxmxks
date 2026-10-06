package g20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 implements aa.a {
    public static final e1 a = new e1();
    public static final List b = sy.d0Shadow.o("__typename", "workflowRun", "app", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        z0 z0Var = null;
        u0 u0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                z0Var = (z0) aa.c.b(aa.c.c(h1.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                u0Var = (u0) aa.c.b(aa.c.c(b1.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        v c = b0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new w0(str, z0Var, u0Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w0 w0Var = (w0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w0Var.a);
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(h1.a, false)).b(fVar, wVar, w0Var.b);
        fVar.z0("app");
        aa.c.b(aa.c.c(b1.a, false)).b(fVar, wVar, w0Var.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, w0Var.d);
        List list = b0.a;
        b0.d(fVar, wVar, w0Var.e);
    }
}
