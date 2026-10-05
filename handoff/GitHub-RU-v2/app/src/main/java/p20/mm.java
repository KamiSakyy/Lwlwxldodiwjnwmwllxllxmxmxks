package p20;

import java.util.List;
import u10.fx;
import u10.gx;
import u10.xw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mm implements aa.a {
    public static final mm a = new mm();
    public static final List b = sy.d0.o("repository", "search");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fx fxVar = null;
        gx gxVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fxVar = (fx) aa.c.b(aa.c.c(um.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                gxVar = (gx) aa.c.c(vm.a, false).a(eVar, wVar);
            }
        }
        if (gxVar != null) {
            return new xw(fxVar, gxVar);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xw xwVar = (xw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xwVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(um.a, false)).b(fVar, wVar, xwVar.a);
        fVar.z0("search");
        aa.c.c(vm.a, false).b(fVar, wVar, xwVar.b);
    }
}
