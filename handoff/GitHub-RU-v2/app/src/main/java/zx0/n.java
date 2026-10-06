package zx0;

import aa.w;
import iy0.e1;
import iy0.f1Shadow;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n implements aa.a {
    public static final List a = d0Shadow.n("__typename");

    public static yx0.s c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        e1 c = f1Shadow.c(eVar, wVar);
        if (str != null) {
            return new yx0.s(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, yx0.s sVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, sVar.a);
        List list = f1Shadow.a;
        f1Shadow.d(fVar, wVar, sVar.b);
    }
}
