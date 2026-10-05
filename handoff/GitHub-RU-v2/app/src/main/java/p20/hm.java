package p20;

import java.util.List;
import u10.ow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hm implements aa.a {
    public static final hm a = new hm();
    public static final List b = sy.d0.o("contentHTML", "path");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new ow(str, str2);
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow owVar = (ow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(owVar, "value");
        fVar.z0("contentHTML");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, owVar.a);
        fVar.z0("path");
        o0Var.b(fVar, wVar, owVar.b);
    }
}
