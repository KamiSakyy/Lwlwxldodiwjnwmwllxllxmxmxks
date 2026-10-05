package j10;

import aa.w;
import i10.r;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import m10.wn;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = d0.o("id", "payload", "challengeRequired", "type");

    public final Object a(ea.e eVar, w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        String str = null;
        Boolean bool = null;
        wn wnVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                wn.Companion.getClass();
                Iterator it = wn.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((wn) obj).r.equals(u)) {
                        break;
                    }
                }
                wn wnVar2 = (wn) obj;
                wnVar = wnVar2 == null ? wn.t : wnVar2;
            }
        }
        if (num == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        int intValue = num.intValue();
        if (str == null) {
            k41.b.B(eVar, "payload");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "challengeRequired");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (wnVar != null) {
            return new r(intValue, str, booleanValue, wnVar);
        }
        k41.b.B(eVar, "type");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        r rVar = (r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("id");
        fVar.z(rVar.a);
        fVar.z0("payload");
        aa.c.a.b(fVar, wVar, rVar.b);
        fVar.z0("challengeRequired");
        f4.C(rVar.c, aa.c.f, fVar, wVar, "type");
        fVar.I(rVar.d.r);
    }
}
