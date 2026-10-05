package yu;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        f fVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ImageFileType"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            fVar = n.c(eVar, wVar);
        }
        return new c(str, fVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c cVar = (c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, cVar.a);
        f fVar2 = cVar.b;
        if (fVar2 != null) {
            List list = n.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, fVar2.a);
        }
    }
}
