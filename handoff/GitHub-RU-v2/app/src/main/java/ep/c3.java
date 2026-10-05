package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c3 implements aa.a {
    public static final c3 a = new c3();
    public static final List b = sy.d0.o("id", "contexts", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.l4 l4Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                l4Var = (jo.l4) aa.c.c(r2.a, false).a(eVar, wVar);
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
        if (l4Var == null) {
            k41.b.B(eVar, "contexts");
            throw null;
        }
        if (str2 != null) {
            return new jo.w4(str, l4Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.w4 w4Var = (jo.w4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w4Var.a);
        fVar.z0("contexts");
        aa.c.c(r2.a, false).b(fVar, wVar, w4Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, w4Var.c);
    }
}
