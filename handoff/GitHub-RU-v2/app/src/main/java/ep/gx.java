package ep;

import java.util.List;
import jo.sb0;
import jo.tb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gx implements aa.a {
    public static final gx a = new gx();
    public static final List b = sy.d0.o("__typename", "subscribable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        sb0 sb0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                sb0Var = (sb0) aa.c.b(aa.c.c(fx.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new tb0(str, sb0Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        tb0 tb0Var = (tb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tb0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, tb0Var.a);
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(fx.a, true)).b(fVar, wVar, tb0Var.b);
    }
}
