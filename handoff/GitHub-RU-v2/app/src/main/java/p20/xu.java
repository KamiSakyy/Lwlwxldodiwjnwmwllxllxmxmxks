package p20;

import java.util.List;
import u10.b90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xu implements aaShadow.a {
    public static final xu a = new xu();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
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
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        ea0.c c = ea0.e.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new b90(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b90 b90Var = (b90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b90Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b90Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, b90Var.b);
        List list = ea0.e.a;
        ea0.c cVar = b90Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("dashboard");
        aa.c.b(aa.c.c(ea0.d.a, false)).b(fVar, wVar, cVar.a);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, cVar.b);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, cVar.c);
    }
}
