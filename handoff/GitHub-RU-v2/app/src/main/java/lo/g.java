package lo;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0.o("unlockingModel", "localizedUnlockingExplanation", "id", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        ko.j jVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                jVar = (ko.j) aa.c.b(aa.c.c(i.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "localizedUnlockingExplanation");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new ko.h(jVar, str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ko.h hVar = (ko.h) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(hVar, "value");
        fVar.z0("unlockingModel");
        aa.c.b(aa.c.c(i.a, true)).b(fVar, wVar, hVar.a);
        fVar.z0("localizedUnlockingExplanation");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, hVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, hVar.d);
    }
}
