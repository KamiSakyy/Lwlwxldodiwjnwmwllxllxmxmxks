package cv;

import aa.w;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h implements aa.a {
    public static final List a = x61.l.r(new String[]{"hasPinnedItems", "items"});

    public static f c(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        b bVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                bVar = (b) aa.c.c(i.a, false).a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasPinnedItems");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bVar != null) {
            return new f(booleanValue, bVar);
        }
        k41.b.B(eVar, "items");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, f fVar2) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("hasPinnedItems");
        f4.C(fVar2.a, aa.c.f, fVar, wVar, "items");
        aa.c.c(i.a, false).b(fVar, wVar, fVar2.b);
    }

}
