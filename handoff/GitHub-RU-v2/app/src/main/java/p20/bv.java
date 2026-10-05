package p20;

import java.util.List;
import u10.h90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bv implements aa.a {
    public static final bv a = new bv();
    public static final List b = sy.d0.o("id", "name");

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
                    return new h90(str, str2);
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h90 h90Var = (h90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h90Var, "value");
        fVar.z0("id");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, h90Var.a);
        fVar.z0("name");
        o0Var.b(fVar, wVar, h90Var.b);
    }
}
