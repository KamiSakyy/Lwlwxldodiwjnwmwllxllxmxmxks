package o60;

import aa.w;
import hc0.fm;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "number", "title", "pullRequestState", "isDraft"});

    public static d c(ea.e eVar, w wVar) {
        Integer num;
        Boolean bool;
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        Boolean bool2 = null;
        fm fmVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 != 1) {
                if (r0 == 2) {
                    bool = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                    }
                } else if (r0 == 3) {
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                } else if (r0 == 4) {
                    Integer num3 = num2;
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
                    fmVar = (fm) obj;
                    if (fmVar == null) {
                        fmVar = fm.v;
                    }
                    num2 = num3;
                } else {
                    if (r0 != 5) {
                        break;
                    }
                    num = num2;
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                }
                bool2 = bool;
            } else {
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num4 = num2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num4 == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        Boolean bool3 = bool2;
        int intValue = num4.intValue();
        if (str3 == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (fmVar == null) {
            k41.b.B(eVar, "pullRequestState");
            throw null;
        }
        if (bool3 != null) {
            return new d(intValue, fmVar, str, str2, str3, bool3.booleanValue());
        }
        k41.b.B(eVar, "isDraft");
        throw null;
    }

    public static void d(ea.f fVar, w wVar, d dVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, dVar.b);
        fVar.z0("number");
        fVar.z(dVar.c);
        fVar.z0("title");
        bVar.b(fVar, wVar, dVar.d);
        fVar.z0("pullRequestState");
        fVar.I(dVar.e.r);
        fVar.z0("isDraft");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(dVar.f));
    }
}
