package em0;

import aa.w;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0Shadow.n("status");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        dm0.e eVar2 = null;
        while (eVar.r0(b) == 0) {
            eVar2 = (dm0.e) aa.c.b(aa.c.c(d.a, false)).a(eVar, wVar);
        }
        return new dm0.a(eVar2);
    }

    public final void b(f fVar, w wVar, Object obj) {
        dm0.a aVar = (dm0.a) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("status");
        aa.c.b(aa.c.c(d.a, false)).b(fVar, wVar, aVar.a);
    }

}
