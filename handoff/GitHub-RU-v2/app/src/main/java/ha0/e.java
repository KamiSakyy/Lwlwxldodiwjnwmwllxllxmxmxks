package ha0;

import aa.w;
import hc0.h6;
import hc0.mz;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "actor", "userSubject", "blockDuration", "createdAt"});

    public static c c(ea.e eVar, w wVar) {
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        b bVar = null;
        mz mzVar = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                aVar = (a) aa.c.b(aa.c.c(d.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                bVar = (b) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
            } else if (r0 == 4) {
                String u = eVar.u();
                k.d(u);
                mz.Companion.getClass();
                Iterator it = mz.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((mz) obj).r.equals(u)) {
                        break;
                    }
                }
                mz mzVar2 = (mz) obj;
                mzVar = mzVar2 == null ? mz.u : mzVar2;
            } else {
                if (r0 != 5) {
                    break;
                }
                h6.Companion.getClass();
                zonedDateTime = (ZonedDateTime) wVar.e(h6.a).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (mzVar == null) {
            k41.b.B(eVar, "blockDuration");
            throw null;
        }
        if (zonedDateTime != null) {
            return new c(str, str2, aVar, bVar, mzVar, zonedDateTime);
        }
        k41.b.B(eVar, "createdAt");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.b);
        fVar.z0("actor");
        aa.c.b(aa.c.c(d.a, true)).b(fVar, wVar, cVar.c);
        fVar.z0("userSubject");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, cVar.d);
        fVar.z0("blockDuration");
        fVar.I(cVar.e.r);
        fVar.z0("createdAt");
        h6.Companion.getClass();
        wVar.e(h6.a).b(fVar, wVar, cVar.f);
    }
}
