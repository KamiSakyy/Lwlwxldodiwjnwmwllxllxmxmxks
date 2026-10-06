package ep;

import java.util.ArrayList;
import java.util.List;
import jo.gh0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w00 implements aaShadow.a {
    public static final w00 a = new w00();
    public static final List b = sy.d0Shadow.n("weeks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.c(b10.a, false)).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new gh0(arrayList);
        }
        k41.b.B(eVar, "weeks");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        gh0 gh0Var = (gh0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gh0Var, "value");
        fVar.z0("weeks");
        aa.c.a(aa.c.c(b10.a, false)).e(fVar, wVar, gh0Var.a);
    }
}
