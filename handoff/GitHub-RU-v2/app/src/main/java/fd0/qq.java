package fd0;

import java.util.List;
import kc0.r20;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class qq implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("id");

    public static r20 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new r20(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, r20 r20Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r20Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, r20Var.a);
    }
}
