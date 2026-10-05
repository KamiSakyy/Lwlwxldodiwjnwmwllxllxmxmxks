package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k2 implements aa.a {
    public static final k2 a = new k2();
    public static final List b = sy.d0.o("commit", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.t3 t3Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t3Var = (u10.t3) aa.c.c(f2.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (t3Var == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.z3(t3Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.z3 z3Var = (u10.z3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z3Var, "value");
        fVar.z0("commit");
        aa.c.c(f2.a, false).b(fVar, wVar, z3Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z3Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z3Var.c);
    }
}
