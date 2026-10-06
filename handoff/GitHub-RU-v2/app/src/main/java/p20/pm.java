package p20;

import java.util.List;
import u10.ax;
import u10.yw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pm implements aaShadow.a {
    public static final pm a = new pm();
    public static final List b = sy.d0.o("issue", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        yw ywVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ywVar = (yw) aa.c.c(nm.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (ywVar == null) {
            k41.b.B(eVar, "issue");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new ax(ywVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ax axVar = (ax) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(axVar, "value");
        fVar.z0("issue");
        aa.c.c(nm.a, true).b(fVar, wVar, axVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, axVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, axVar.c);
    }
}
