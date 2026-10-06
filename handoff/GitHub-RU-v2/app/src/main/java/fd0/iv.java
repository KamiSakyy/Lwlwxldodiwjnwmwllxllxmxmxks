package fd0;

import java.util.List;
import kc0.k90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iv implements aaShadow.a {
    public static final iv a = new iv();
    public static final List b = sy.d0.o(new String[]{"id", "headRefOid", "__typename"});

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
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "headRefOid");
            throw null;
        }
        if (str3 != null) {
            return new k90(str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k90 k90Var = (k90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k90Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k90Var.a);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, k90Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k90Var.c);
    }
}
