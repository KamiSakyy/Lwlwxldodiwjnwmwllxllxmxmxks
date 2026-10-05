package p20;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class id implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "headRefOid", "mergeStateStatus"});

    public static u10.ak c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        hc0.ff ffVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                hc0.ff.Companion.getClass();
                Iterator it = hc0.ff.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((hc0.ff) obj).r.equals(u)) {
                        break;
                    }
                }
                hc0.ff ffVar2 = (hc0.ff) obj;
                ffVar = ffVar2 == null ? hc0.ff.u : ffVar2;
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "headRefOid");
            throw null;
        }
        if (ffVar != null) {
            return new u10.ak(str, str2, ffVar);
        }
        k41.b.B(eVar, "mergeStateStatus");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.ak akVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(akVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, akVar.a);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, akVar.b);
        fVar.z0("mergeStateStatus");
        fVar.I(akVar.c.r);
    }
}
