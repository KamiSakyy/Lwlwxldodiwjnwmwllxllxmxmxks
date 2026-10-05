package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e2 implements aa.a {
    public static final e2 a = new e2();
    public static final List b = sy.d0.o("workflowRun", "app", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.j4 j4Var = null;
        u10.r3 r3Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j4Var = (u10.j4) aa.c.b(aa.c.c(u2.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                r3Var = (u10.r3) aa.c.b(aa.c.c(d2.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.s3(j4Var, r3Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.s3 s3Var = (u10.s3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s3Var, "value");
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(u2.a, false)).b(fVar, wVar, s3Var.a);
        fVar.z0("app");
        aa.c.b(aa.c.c(d2.a, false)).b(fVar, wVar, s3Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s3Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, s3Var.d);
    }
}
