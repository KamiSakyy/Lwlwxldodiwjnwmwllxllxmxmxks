package ep;

import java.util.List;
import jo.ug0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q00 implements aaShadow.a {
    public static final q00 a = new q00();
    public static final List b = sy.d0Shadow.o("mobileTimeZone", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "mobileTimeZone");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new ug0(str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ug0 ug0Var = (ug0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ug0Var, "value");
        fVar.z0("mobileTimeZone");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ug0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ug0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ug0Var.c);
    }
}
