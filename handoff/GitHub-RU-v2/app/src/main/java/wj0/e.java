package wj0;

import aa.w;
import java.util.List;
import java.util.Set;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0Shadow.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        ud0.a aVar;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        gk0.b bVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), set2, str, set)) {
            eVar.s0();
            aVar = ud0.b.c(eVar, wVar);
        } else {
            aVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Team"}), set2, str, set)) {
            eVar.s0();
            bVar = gk0.d.c(eVar, wVar);
        }
        return new b(str, aVar, bVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        b bVar = (b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, bVar.a);
        ud0.a aVar = bVar.b;
        if (aVar != null) {
            ud0.b.d(fVar, wVar, aVar);
        }
        gk0.b bVar2 = bVar.c;
        if (bVar2 != null) {
            gk0.d.d(fVar, wVar, bVar2);
        }
    }
}
