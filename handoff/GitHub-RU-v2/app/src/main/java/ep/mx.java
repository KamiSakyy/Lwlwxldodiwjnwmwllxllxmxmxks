package ep;

import java.util.List;
import jo.ac0;
import jo.dc0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mx implements aa.a {
    public static final mx a = new mx();
    public static final List b = sy.d0.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ac0 ac0Var = null;
        while (eVar.r0(b) == 0) {
            ac0Var = (ac0) aa.c.b(aa.c.c(kx.a, true)).a(eVar, wVar);
        }
        return new dc0(ac0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dc0 dc0Var = (dc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dc0Var, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(kx.a, true)).b(fVar, wVar, dc0Var.a);
    }
}
