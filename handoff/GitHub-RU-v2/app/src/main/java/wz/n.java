package wz;

import aa.w;
import f00.g1;
import f00.h1;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n implements aa.a {
    public static final List a = d0Shadow.n("__typename");

    public static vz.s c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        g1 c = h1.c(eVar, wVar);
        if (str != null) {
            return new vz.s(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, vz.s sVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, sVar.a);
        List list = h1.a;
        h1.d(fVar, wVar, sVar.b);
    }
}
