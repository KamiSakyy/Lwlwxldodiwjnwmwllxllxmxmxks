package eo0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class kf implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "headRefOid", "mergeStateStatus", "isInMergeQueue", "mergeQueue", "mergeQueueEntry"});

    public static jn0.vm c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        pz0.si siVar = null;
        jn0.tm tmVar = null;
        jn0.um umVar = null;
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
                pz0.si.Companion.getClass();
                Iterator it = pz0.si.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((pz0.si) obj).r.equals(u)) {
                        break;
                    }
                }
                pz0.si siVar2 = (pz0.si) obj;
                siVar = siVar2 == null ? pz0.si.t : siVar2;
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                tmVar = (jn0.tm) aa.c.b(aa.c.c(hf.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                umVar = (jn0.um) aa.c.b(aa.c.c(jf.a, true)).a(eVar, wVar);
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
        if (siVar == null) {
            k41.b.B(eVar, "mergeStateStatus");
            throw null;
        }
        if (bool3 != null) {
            return new jn0.vm(str, str2, siVar, bool3.booleanValue(), tmVar, umVar);
        }
        k41.b.B(eVar, "isInMergeQueue");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.vm vmVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vmVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vmVar.a);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, vmVar.b);
        fVar.z0("mergeStateStatus");
        fVar.I(vmVar.c.r);
        fVar.z0("isInMergeQueue");
        jo.f4.C(vmVar.d, aa.c.f, fVar, wVar, "mergeQueue");
        aa.c.b(aa.c.c(hf.a, true)).b(fVar, wVar, vmVar.e);
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(jf.a, true)).b(fVar, wVar, vmVar.f);
    }
}
