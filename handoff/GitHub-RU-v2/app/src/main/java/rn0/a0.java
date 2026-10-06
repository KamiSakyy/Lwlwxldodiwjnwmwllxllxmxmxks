package rn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 implements aa.a {
    public static final a0 a = new a0();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "workflow", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        qn0.e0 e0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                e0Var = (qn0.e0) aa.c.c(z.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (e0Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (str2 != null) {
            return new qn0.f0(str, e0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qn0.f0 f0Var = (qn0.f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f0Var.a);
        fVar.z0("workflow");
        aa.c.c(z.a, false).b(fVar, wVar, f0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, f0Var.c);
    }
}
