package ye0;

import aa.w;
import gn0.hn;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i implements aa.a {
    public static final List a = l.r(new String[]{"pullRequestState", "isDraft", "title", "url", "number", "isInMergeQueue", "id"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0018. Please report as an issue. */
    public static c c(ea.e eVar, w wVar) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str;
        Object obj;
        Integer valueOf;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool4 = null;
        Integer num = null;
        hn hnVar = null;
        String str2 = null;
        String str3 = null;
        Boolean bool5 = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool2 = bool4;
                    bool3 = bool5;
                    str = str4;
                    String u = eVar.u();
                    k.d(u);
                    hn.Companion.getClass();
                    Iterator it = hn.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((hn) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    hn hnVar2 = (hn) obj;
                    hnVar = hnVar2 == null ? hn.v : hnVar2;
                    str4 = str;
                    bool4 = bool2;
                    bool5 = bool3;
                case 1:
                    bool3 = bool5;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool5 = bool3;
                case 2:
                    bool2 = bool4;
                    bool3 = bool5;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool2;
                    bool5 = bool3;
                case 3:
                    bool2 = bool4;
                    bool3 = bool5;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool2;
                    bool5 = bool3;
                case 4:
                    bool2 = bool4;
                    bool3 = bool5;
                    str = str4;
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
                    str4 = str;
                    bool4 = bool2;
                    bool5 = bool3;
                case 5:
                    bool = bool4;
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool;
                case 6:
                    bool = bool4;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool;
            }
            Boolean bool6 = bool4;
            if (hnVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (bool6 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Boolean bool7 = bool5;
            String str5 = str4;
            boolean booleanValue = bool6.booleanValue();
            if (str2 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (num == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            int intValue = num.intValue();
            if (bool7 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            boolean booleanValue2 = bool7.booleanValue();
            if (str5 != null) {
                return new c(intValue, hnVar, str2, str3, str5, booleanValue, booleanValue2);
            }
            k41.b.B(eVar, "id");
            throw null;
        }
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("pullRequestState");
        fVar.I(cVar.a.r);
        fVar.z0("isDraft");
        aa.b bVar = aa.c.f;
        f4Shadow.C(cVar.b, bVar, fVar, wVar, "title");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, cVar.c);
        fVar.z0("url");
        bVar2.b(fVar, wVar, cVar.d);
        fVar.z0("number");
        fVar.z(cVar.e);
        fVar.z0("isInMergeQueue");
        f4Shadow.C(cVar.f, bVar, fVar, wVar, "id");
        bVar2.b(fVar, wVar, cVar.g);
    }
}
