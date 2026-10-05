package et;

import aa.c;
import aa.w;
import ea.e;
import java.util.List;
import ju.d;
import k71.k;
import pv.f;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "url", "id"});

    public static a c(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        ar.c c = ar.e.c(eVar, wVar);
        eVar.s0();
        f fVar = f.a;
        pv.c c2 = f.c(eVar, wVar);
        eVar.s0();
        pu.a c3 = pu.b.c(eVar, wVar);
        eVar.s0();
        ur.a c4 = ur.b.c(eVar, wVar);
        eVar.s0();
        d dVar = d.a;
        ju.a c5 = d.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (str3 != null) {
            return new a(str, str2, str3, c, c2, c3, c4, c5);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, a aVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("__typename");
        aa.b bVar = c.a;
        bVar.b(fVar, wVar, aVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, aVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, aVar.c);
        List list = ar.e.a;
        ar.e.d(fVar, wVar, aVar.d);
        f fVar2 = f.a;
        f.d(fVar, wVar, aVar.e);
        List list2 = pu.b.a;
        pu.b.d(fVar, wVar, aVar.f);
        List list3 = ur.b.a;
        ur.a aVar2 = aVar.g;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar2, "value");
        fVar.z0("__typename");
        c.a.b(fVar, wVar, aVar2.a);
        fVar.z0("viewerCanDelete");
        c.f.b(fVar, wVar, Boolean.valueOf(aVar2.b));
        vx.a aVar3 = aVar2.c;
        if (aVar3 != null) {
            vx.b.d(fVar, wVar, aVar3);
        }
        d dVar = d.a;
        d.d(fVar, wVar, aVar.h);
    }

}
