package i40;

import aa.w;
import hc0.fm;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i implements aa.a {
    public static final List a = l.r(new String[]{"pullRequestState", "isDraft", "title", "url", "number", "id"});

    public static c c(ea.e eVar, w wVar) {
        Boolean bool;
        Object obj;
        Integer valueOf;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        Integer num = null;
        fm fmVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                String u = eVar.u();
                k.d(u);
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
                fm fmVar2 = (fm) obj;
                fmVar = fmVar2 == null ? fm.v : fmVar2;
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                bool = bool2;
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    valueOf = Integer.valueOf((int) nextLong);
                } else {
                    valueOf = Integer.valueOf((int) nextLong);
                }
                num = valueOf;
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (fmVar == null) {
            k41.b.B(eVar, "pullRequestState");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isDraft");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num.intValue();
        if (str3 != null) {
            return new c(intValue, fmVar, str, str2, str3, booleanValue);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("pullRequestState");
        fVar.I(cVar.a.r);
        fVar.z0("isDraft");
        f4Shadow.C(cVar.b, aa.c.f, fVar, wVar, "title");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.c);
        fVar.z0("url");
        bVar.b(fVar, wVar, cVar.d);
        fVar.z0("number");
        fVar.z(cVar.e);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.f);
    }

}
