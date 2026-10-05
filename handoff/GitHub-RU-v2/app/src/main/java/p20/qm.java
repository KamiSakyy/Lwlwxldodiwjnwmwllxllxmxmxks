package p20;

import java.util.List;
import u10.bx;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class qm implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static bx c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        w50.q qVar = w50.q.a;
        w50.l c = w50.q.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new bx(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, bx bxVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bxVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bxVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, bxVar.b);
        w50.q qVar = w50.q.a;
        w50.q.d(fVar, wVar, bxVar.c);
    }
}
