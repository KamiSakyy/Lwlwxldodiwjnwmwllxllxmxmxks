package qy0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e implements aa.a {
    public static final List a = d0.n("__typename");

    public static py0.i c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        ry0.f fVar = ry0.f.a;
        ry0.b c = ry0.f.c(eVar, wVar);
        if (str != null) {
            return new py0.i(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, py0.i iVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, iVar.a);
        ry0.f fVar2 = ry0.f.a;
        ry0.f.d(fVar, wVar, iVar.b);
    }
}
