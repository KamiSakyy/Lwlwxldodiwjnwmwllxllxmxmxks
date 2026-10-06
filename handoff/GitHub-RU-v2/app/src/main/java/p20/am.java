package p20;

import java.util.List;
import u10.bw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class am implements aaShadow.a {
    public static final am a = new am();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v70.d dVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization", "Repository", "User"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            dVar = v70.g.c(eVar, wVar);
        }
        return new bw(str, dVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        bw bwVar = (bw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bwVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, bwVar.a);
        v70.d dVar = bwVar.b;
        if (dVar != null) {
            v70.g.d(fVar, wVar, dVar);
        }
    }
}
