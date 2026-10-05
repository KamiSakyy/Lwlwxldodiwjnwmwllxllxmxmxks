package p20;

import java.util.List;
import u10.bw;
import u10.cw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bm implements aa.a {
    public static final bm a = new bm();
    public static final List b = sy.d0.o("owner", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        bw bwVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bwVar = (bw) aa.c.c(am.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (bwVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new cw(bwVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        cw cwVar = (cw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cwVar, "value");
        fVar.z0("owner");
        aa.c.c(am.a, true).b(fVar, wVar, cwVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cwVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, cwVar.c);
    }
}
