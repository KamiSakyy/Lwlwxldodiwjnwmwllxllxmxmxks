package ep;

import java.util.List;
import jo.c90;
import jo.t80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ev implements aa.a {
    public static final ev a = new ev();
    public static final List b = sy.d0.o("repository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c90 c90Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                c90Var = (c90) aa.c.b(aa.c.c(nv.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
        if (str2 != null) {
            return new t80(c90Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t80 t80Var = (t80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t80Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(nv.a, false)).b(fVar, wVar, t80Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t80Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t80Var.c);
    }
}
