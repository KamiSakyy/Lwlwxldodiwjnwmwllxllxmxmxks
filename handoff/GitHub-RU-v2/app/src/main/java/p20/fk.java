package p20;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fk implements aaShadow.a {
    public static final fk a = new fk();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.ct ctVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        u10.bt btVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            ctVar = ak.c(eVar, wVar);
        } else {
            ctVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            btVar = zj.c(eVar, wVar);
        }
        return new u10.ht(str, ctVar, btVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ht htVar = (u10.ht) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(htVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, htVar.a);
        u10.ct ctVar = htVar.b;
        if (ctVar != null) {
            ak.d(fVar, wVar, ctVar);
        }
        u10.bt btVar = htVar.c;
        if (btVar != null) {
            zj.d(fVar, wVar, btVar);
        }
    }
}
