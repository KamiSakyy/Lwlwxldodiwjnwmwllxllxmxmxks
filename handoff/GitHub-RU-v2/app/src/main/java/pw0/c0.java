package pw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 implements aa.a {
    public static final c0 a = new c0();
    public static final List b = sy.d0.o(new String[]{"workflow", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ow0.k0 k0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                k0Var = (ow0.k0) aa.c.c(b0.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (k0Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new ow0.l0(k0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.l0 l0Var = (ow0.l0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("workflow");
        aa.c.c(b0.a, false).b(fVar, wVar, l0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l0Var.c);
    }
}
