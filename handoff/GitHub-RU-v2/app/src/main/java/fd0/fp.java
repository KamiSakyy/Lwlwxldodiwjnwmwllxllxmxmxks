package fd0;

import java.util.List;
import kc0.q00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fp implements aa.a {
    public static final fp a = new fp();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        sg0.j c = sg0.n.c(eVar, wVar);
        if (str != null) {
            return new q00(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q00 q00Var = (q00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q00Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q00Var.a);
        List list = sg0.n.a;
        sg0.n.d(fVar, wVar, q00Var.b);
    }
}
