package fd0;

import java.util.List;
import kc0.zx;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kn implements aa.a {
    public static final kn a = new kn();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ni0.d dVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization", "Repository", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            dVar = ni0.g.c(eVar, wVar);
        }
        return new zx(str, dVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zx zxVar = (zx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zxVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, zxVar.a);
        ni0.d dVar = zxVar.b;
        if (dVar != null) {
            ni0.g.d(fVar, wVar, dVar);
        }
    }
}
