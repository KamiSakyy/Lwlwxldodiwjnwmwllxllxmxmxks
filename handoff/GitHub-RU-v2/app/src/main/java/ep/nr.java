package ep;

import java.util.List;
import jo.i30;
import jo.l30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nr implements aa.a {
    public static final nr a = new nr();
    public static final List b = sy.d0.o("milestones", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i30 i30Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                i30Var = (i30) aa.c.b(aa.c.c(kr.a, false)).a(eVar, wVar);
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
            return new l30(i30Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l30 l30Var = (l30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l30Var, "value");
        fVar.z0("milestones");
        aa.c.b(aa.c.c(kr.a, false)).b(fVar, wVar, l30Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l30Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l30Var.c);
    }
}
