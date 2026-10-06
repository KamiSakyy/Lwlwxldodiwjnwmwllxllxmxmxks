package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y6 implements aa.a {
    public static final y6 a = new y6();
    public static final List b = sy.d0Shadow.o("workflow", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j5 j5Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j5Var = (j5) aa.c.c(x6.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (j5Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new k5(j5Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k5 k5Var = (k5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k5Var, "value");
        fVar.z0("workflow");
        aa.c.c(x6.a, false).b(fVar, wVar, k5Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k5Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k5Var.c);
    }
}
