package fd0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lb implements aaShadow.a {
    public static final lb a = new lb();
    public static final List b = sy.d0Shadow.n("programmingLanguages");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.b(aa.c.c(mb.a, false))).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new kc0.xg(arrayList);
        }
        k41.b.B(eVar, "programmingLanguages");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.xg xgVar = (kc0.xg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xgVar, "value");
        fVar.z0("programmingLanguages");
        aa.c.a(aa.c.b(aa.c.c(mb.a, false))).e(fVar, wVar, xgVar.a);
    }
}
