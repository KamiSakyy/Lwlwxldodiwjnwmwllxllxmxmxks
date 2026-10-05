package fd0;

import java.util.List;
import kc0.v00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ip implements aa.a {
    public static final ip a = new ip();
    public static final List b = sy.d0.n("shortcuts");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(jp.a, true))).a(eVar, wVar);
        }
        return new v00(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v00 v00Var = (v00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v00Var, "value");
        fVar.z0("shortcuts");
        aa.c.b(aa.c.a(aa.c.c(jp.a, true))).b(fVar, wVar, v00Var.a);
    }
}
