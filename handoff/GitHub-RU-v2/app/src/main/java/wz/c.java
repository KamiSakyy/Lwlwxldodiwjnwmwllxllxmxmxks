package wz;

import aa.w;
import java.util.List;
import sy.d0Shadow;
import xz.v;
import xz.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = d0Shadow.o("__typename", "viewGroupId");

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
        z zVar = z.a;
        v c = z.c(eVar, wVar);
        if (str != null) {
            return new vz.d(str, str2, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        vz.d dVar = (vz.d) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, dVar.a);
        fVar.z0("viewGroupId");
        aa.c.i.b(fVar, wVar, dVar.b);
        z zVar = z.a;
        z.d(fVar, wVar, dVar.c);
    }
    public static final Object f = null;
    public static final Object i = null;
}
