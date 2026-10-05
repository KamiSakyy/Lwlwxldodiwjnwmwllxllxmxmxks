package ep;

import java.util.List;
import jo.p60;
import jo.t60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class st implements aa.a {
    public static final st a = new st();
    public static final List b = sy.d0.o("viewer", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t60 t60Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t60Var = (t60) aa.c.c(wt.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (t60Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new p60(t60Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p60 p60Var = (p60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p60Var, "value");
        fVar.z0("viewer");
        aa.c.c(wt.a, false).b(fVar, wVar, p60Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p60Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p60Var.c);
    }
}
