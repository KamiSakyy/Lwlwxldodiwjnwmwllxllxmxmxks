package ep;

import java.util.List;
import jo.oj0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h20 implements aa.a {
    public static final List a = sy.d0.n("id");

    public static oj0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new oj0(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, oj0 oj0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oj0Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, oj0Var.a);
    }
}
