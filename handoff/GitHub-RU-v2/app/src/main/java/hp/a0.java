package hp;

import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements aa.a {
    public static final a0 a = new a0();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w wVar2 = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            wVar2 = z.c(eVar, wVar);
        }
        return new xShadow(str, wVar2);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xShadow xVar = (xShadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, xVar.a);
        w wVar2 = xVar.b;
        if (wVar2 != null) {
            z.d(fVar, wVar, wVar2);
        }
    }
}
