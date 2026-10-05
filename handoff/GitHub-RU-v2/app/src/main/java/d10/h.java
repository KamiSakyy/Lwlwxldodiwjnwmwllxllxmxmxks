package d10;

import aa.w;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "commits"});

    public static c10.i c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        c10.c cVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                cVar = (c10.c) aa.c.c(c.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (cVar != null) {
            return new c10.i(str, cVar);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, c10.i iVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, iVar.a);
        fVar.z0("commits");
        aa.c.c(c.a, false).b(fVar, wVar, iVar.b);
    }

}
