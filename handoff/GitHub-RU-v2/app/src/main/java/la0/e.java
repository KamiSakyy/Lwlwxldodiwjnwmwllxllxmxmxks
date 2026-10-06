package la0;

import aa.w;
import java.util.List;
import java.util.Set;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0Shadow.n("__typename");

    public static c c(ea.e eVar, w wVar) {
        a aVar;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        b bVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            aVar = f.c(eVar, wVar);
        } else {
            aVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DiscussionComment"}), set2, str, set)) {
            eVar.s0();
            bVar = g.c(eVar, wVar);
        }
        return new c(str, aVar, bVar);
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, cVar.a);
        a aVar = cVar.b;
        if (aVar != null) {
            f.d(fVar, wVar, aVar);
        }
        b bVar = cVar.c;
        if (bVar != null) {
            g.d(fVar, wVar, bVar);
        }
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, w wVar, Object obj) {
        d(fVar, wVar, (c) obj);
    }
}
