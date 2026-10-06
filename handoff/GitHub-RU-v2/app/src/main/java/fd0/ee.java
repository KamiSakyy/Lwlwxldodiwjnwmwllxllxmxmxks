package fd0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ee implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "headRefOid", "mergeStateStatus", "isInMergeQueue", "mergeQueue", "mergeQueueEntry"});

    public static kc0.el c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        gn0.gg ggVar = null;
        kc0.cl clVar = null;
        kc0.dl dlVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                String u = eVar.u();
                k71.k.d(u);
                gn0.gg.Companion.getClass();
                Iterator it = gn0.gg.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gn0.gg) obj).r.equals(u)) {
                        break;
                    }
                }
                gn0.gg ggVar2 = (gn0.gg) obj;
                ggVar = ggVar2 == null ? gn0.gg.t : ggVar2;
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                clVar = (kc0.cl) aa.c.b(aa.c.c(ce.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                dlVar = (kc0.dl) aa.c.b(aa.c.c(de.a, true)).a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "headRefOid");
            throw null;
        }
        if (ggVar == null) {
            k41.b.B(eVar, "mergeStateStatus");
            throw null;
        }
        if (bool3 != null) {
            return new kc0.el(str, str2, ggVar, bool3.booleanValue(), clVar, dlVar);
        }
        k41.b.B(eVar, "isInMergeQueue");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.el elVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(elVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, elVar.a);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, elVar.b);
        fVar.z0("mergeStateStatus");
        fVar.I(elVar.c.r);
        fVar.z0("isInMergeQueue");
        jo.f4Shadow.C(elVar.d, aa.c.f, fVar, wVar, "mergeQueue");
        aa.c.b(aa.c.c(ce.a, true)).b(fVar, wVar, elVar.e);
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(de.a, true)).b(fVar, wVar, elVar.f);
    }
}
