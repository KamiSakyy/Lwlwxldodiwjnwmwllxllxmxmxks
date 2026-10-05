package o40;

import aa.w;
import hc0.fm;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "number", "title", "pullRequestState", "repository", "isDraft", "id"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0018. Please report as an issue. */
    public static c c(ea.e eVar, w wVar) {
        Integer num;
        Boolean bool;
        Integer num2;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num3 = null;
        String str = null;
        Boolean bool2 = null;
        String str2 = null;
        fm fmVar = null;
        f fVar = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num3;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 1:
                    bool = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        num3 = Integer.valueOf((int) nextLong);
                    } else {
                        num3 = Integer.valueOf((int) nextLong);
                    }
                    bool2 = bool;
                case 2:
                    num = num3;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 3:
                    num2 = num3;
                    bool = bool2;
                    String u = eVar.u();
                    k71.k.d(u);
                    fm.Companion.getClass();
                    Iterator it = fm.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((fm) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    fmVar = (fm) obj;
                    if (fmVar == null) {
                        fmVar = fm.v;
                    }
                    num3 = num2;
                    bool2 = bool;
                case 4:
                    num2 = num3;
                    bool = bool2;
                    fVar = (f) aa.c.c(p.a, false).a(eVar, wVar);
                    num3 = num2;
                    bool2 = bool;
                case 5:
                    num = num3;
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 6:
                    num = num3;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
            }
            Integer num4 = num3;
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (num4 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool3 = bool2;
            int intValue = num4.intValue();
            if (str2 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (fmVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (fVar == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (bool3 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            boolean booleanValue = bool3.booleanValue();
            if (str3 != null) {
                return new c(str, intValue, str2, fmVar, fVar, booleanValue, str3);
            }
            k41.b.B(eVar, "id");
            throw null;
        }
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("number");
        fVar.z(cVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, cVar.c);
        fVar.z0("pullRequestState");
        fVar.I(cVar.d.r);
        fVar.z0("repository");
        aa.c.c(p.a, false).b(fVar, wVar, cVar.e);
        fVar.z0("isDraft");
        f4.C(cVar.f, aa.c.f, fVar, wVar, "id");
        bVar.b(fVar, wVar, cVar.g);
    }
}
