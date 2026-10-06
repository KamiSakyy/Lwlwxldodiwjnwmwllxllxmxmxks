package ad0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = d0.n("downloadUrl");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new zc0.f(str);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        zc0.f fVar2 = (zc0.f) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(fVar2, "value");
        fVar.z0("downloadUrl");
        aa.c.i.b(fVar, wVar, fVar2.a);
    }

    public Object c(Object p1, Object p2) { return null; }
    public static final Object i = null;
}
