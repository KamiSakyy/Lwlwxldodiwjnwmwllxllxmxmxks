package p20;

import java.util.ArrayList;
import java.util.List;
import u10.qz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lo implements aaShadow.a {
    public static final lo a = new lo();
    public static final List b = sy.d0.n("spokenLanguages");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.b(aa.c.c(mo.a, false))).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new qz(arrayList);
        }
        k41.b.B(eVar, "spokenLanguages");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qz qzVar = (qz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qzVar, "value");
        fVar.z0("spokenLanguages");
        aa.c.a(aa.c.b(aa.c.c(mo.a, false))).e(fVar, wVar, qzVar.a);
    }
}
