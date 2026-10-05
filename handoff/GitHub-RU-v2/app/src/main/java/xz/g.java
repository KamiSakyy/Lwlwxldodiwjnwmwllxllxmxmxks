package xz;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        b bVar;
        d dVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        c cVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2Field"}), set2, str, set)) {
            eVar.s0();
            bVar = h.c(eVar, wVar);
        } else {
            bVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2SingleSelectField"}), set2, str, set)) {
            eVar.s0();
            dVar = j.c(eVar, wVar);
        } else {
            dVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2IterationField"}), set2, str, set)) {
            eVar.s0();
            cVar = i.c(eVar, wVar);
        }
        return new a(str, bVar, dVar, cVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a aVar = (a) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, aVar.a);
        b bVar = aVar.b;
        if (bVar != null) {
            h.d(fVar, wVar, bVar);
        }
        d dVar = aVar.c;
        if (dVar != null) {
            j.d(fVar, wVar, dVar);
        }
        c cVar = aVar.d;
        if (cVar != null) {
            i.d(fVar, wVar, cVar);
        }
    }
}
