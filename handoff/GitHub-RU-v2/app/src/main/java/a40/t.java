package a40;

import hc0.fm;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t implements aa.a {
    public static final List a = x61.l.r(new String[]{"number", "title", "state", "repository", "isDraft", "id"});

    public static f c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Boolean bool2 = null;
        String str = null;
        fm fmVar = null;
        k kVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
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
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                String u = eVar.u();
                k71.k.d(u);
                fm.Companion.getClass();
                Iterator it = fm.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((fm) obj).r.equals(u)) {
                        break;
                    }
                }
                fmVar = (fm) obj;
                if (fmVar == null) {
                    fmVar = fm.v;
                }
            } else if (r0 == 3) {
                bool = bool2;
                kVar = (k) aa.c.c(y.a, false).a(eVar, wVar);
            } else if (r0 == 4) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (num == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num.intValue();
        if (str == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (fmVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (kVar == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isDraft");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str2 != null) {
            return new f(intValue, str, fmVar, kVar, booleanValue, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, f fVar2) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("number");
        fVar.z(fVar2.a);
        fVar.z0("title");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fVar2.b);
        fVar.z0("state");
        fVar.I(fVar2.c.r);
        fVar.z0("repository");
        aa.c.c(y.a, false).b(fVar, wVar, fVar2.d);
        fVar.z0("isDraft");
        f4.C(fVar2.e, aa.c.f, fVar, wVar, "id");
        bVar.b(fVar, wVar, fVar2.f);
    }
}
