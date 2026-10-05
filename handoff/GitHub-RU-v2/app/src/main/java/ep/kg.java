package ep;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class kg implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "headRefOid", "mergeStateStatus", "isInMergeQueue", "mergeQueue", "mergeQueueEntry"});

    public static jo.ho c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        m10.wm wmVar = null;
        jo.fo foVar = null;
        jo.go goVar = null;
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
                m10.wm.Companion.getClass();
                Iterator it = m10.wm.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((m10.wm) obj).r.equals(u)) {
                        break;
                    }
                }
                m10.wm wmVar2 = (m10.wm) obj;
                wmVar = wmVar2 == null ? m10.wm.t : wmVar2;
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                foVar = (jo.fo) aa.c.b(aa.c.c(ig.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                goVar = (jo.go) aa.c.b(aa.c.c(jg.a, true)).a(eVar, wVar);
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
        if (wmVar == null) {
            k41.b.B(eVar, "mergeStateStatus");
            throw null;
        }
        if (bool3 != null) {
            return new jo.ho(str, str2, wmVar, bool3.booleanValue(), foVar, goVar);
        }
        k41.b.B(eVar, "isInMergeQueue");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.ho hoVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hoVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hoVar.a);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, hoVar.b);
        fVar.z0("mergeStateStatus");
        fVar.I(hoVar.c.r);
        fVar.z0("isInMergeQueue");
        jo.f4.C(hoVar.d, aa.c.f, fVar, wVar, "mergeQueue");
        aa.c.b(aa.c.c(ig.a, true)).b(fVar, wVar, hoVar.e);
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(jg.a, true)).b(fVar, wVar, hoVar.f);
    }
}
