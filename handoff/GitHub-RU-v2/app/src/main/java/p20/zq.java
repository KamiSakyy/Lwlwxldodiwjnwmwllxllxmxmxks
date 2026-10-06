package p20;

import java.util.List;
import u10.i30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zq implements aaShadow.a {
    public static final zq a = new zq();
    public static final List b = sy.d0Shadow.o("__typename", "success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                bool = (Boolean) aa.c.k.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new i30(str, bool);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i30 i30Var = (i30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i30Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, i30Var.a);
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, i30Var.b);
    }
}
