package wz;

import aa.w;
import java.util.List;
import sy.d0;
import vz.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = d0.o("__typename", "viewGroupId");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
        eVar.s0();
        xz.f c = xz.k.c(eVar, wVar);
        if (str != null) {
            return new x(str, str2, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        x xVar = (x) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, xVar.a);
        fVar.z0("viewGroupId");
        aa.c.i.b(fVar, wVar, xVar.b);
        List list = xz.k.a;
        xz.k.d(fVar, wVar, xVar.c);
    }
}
