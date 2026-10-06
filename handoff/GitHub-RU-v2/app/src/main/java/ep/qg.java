package ep;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qg implements aaShadow.a {
    public static final qg a = new qg();
    public static final List b = sy.d0Shadow.o("title", "features");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                arrayList = aa.c.a(aa.c.c(sg.a, true)).c(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (arrayList != null) {
            return new jo.qo(str, arrayList);
        }
        k41.b.B(eVar, "features");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.qo qoVar = (jo.qo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qoVar, "value");
        fVar.z0("title");
        aa.c.a.b(fVar, wVar, qoVar.a);
        fVar.z0("features");
        aa.c.a(aa.c.c(sg.a, true)).e(fVar, wVar, qoVar.b);
    }
}
