package m90;

import aa.w;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d implements aa.a {
    public static final List a = d0Shadow.n("viewerSubscriptionTypes");

    public static a c(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(a) == 0) {
            list = (List) aa.c.b(aa.c.a(ic0.a.i)).a(eVar, wVar);
        }
        return new a(list);
    }

    public static void d(f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("viewerSubscriptionTypes");
        aa.c.b(aa.c.a(ic0.a.i)).b(fVar, wVar, aVar.a);
    }
}
