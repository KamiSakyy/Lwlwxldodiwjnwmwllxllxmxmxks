package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n7 implements aa.a {
    public static final n7 a = new n7();
    public static final List b = sy.d0.o(new String[]{"workflow", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w5 w5Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                w5Var = (w5) aa.c.c(m7.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (w5Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new x5(w5Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x5 x5Var = (x5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x5Var, "value");
        fVar.z0("workflow");
        aa.c.c(m7.a, false).b(fVar, wVar, x5Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x5Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x5Var.c);
    }
}
