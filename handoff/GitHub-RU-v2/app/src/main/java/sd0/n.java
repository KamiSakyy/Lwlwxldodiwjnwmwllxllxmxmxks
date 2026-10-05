package sd0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements aa.a {
    public static final n a = new n();
    public static final List b = sy.d0.n("__typename");

    public static k c(ea.e eVar, aa.w wVar) {
        i iVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        j jVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            iVar = o.c(eVar, wVar);
        } else {
            iVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"DiscussionComment"}), set2, str, set)) {
            eVar.s0();
            jVar = p.c(eVar, wVar);
        }
        return new k(str, iVar, jVar);
    }

    public static void d(ea.f fVar, aa.w wVar, k kVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, kVar.a);
        i iVar = kVar.b;
        if (iVar != null) {
            o.d(fVar, wVar, iVar);
        }
        j jVar = kVar.c;
        if (jVar != null) {
            p.d(fVar, wVar, jVar);
        }
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (k) obj);
    }
}
