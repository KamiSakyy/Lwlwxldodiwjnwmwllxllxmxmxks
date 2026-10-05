package ef0;

import aa.w;
import gn0.hn;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "number", "title", "pullRequestState", "repository", "isInMergeQueue", "isDraft", "id"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0019. Please report as an issue. */
    public static c c(ea.e eVar, w wVar) {
        Integer num;
        Boolean bool;
        Boolean bool2;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        Boolean bool3 = null;
        String str2 = null;
        hn hnVar = null;
        f fVar = null;
        Boolean bool4 = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 1:
                    bool = bool3;
                    bool2 = bool4;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                    }
                    bool3 = bool;
                    bool4 = bool2;
                case 2:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 3:
                    Integer num3 = num2;
                    bool = bool3;
                    bool2 = bool4;
                    String u = eVar.u();
                    k71.k.d(u);
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
                    hnVar = (hn) obj;
                    if (hnVar == null) {
                        hnVar = hn.v;
                    }
                    num2 = num3;
                    bool3 = bool;
                    bool4 = bool2;
                case 4:
                    fVar = (f) aa.c.c(p.a, false).a(eVar, wVar);
                    num2 = num2;
                    bool3 = bool3;
                case 5:
                    num = num2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 6:
                    num = num2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 7:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
            }
            Integer num4 = num2;
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (num4 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool5 = bool3;
            int intValue = num4.intValue();
            if (str2 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (hnVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (fVar == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (bool5 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            Boolean bool6 = bool4;
            boolean booleanValue = bool5.booleanValue();
            if (bool6 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            boolean booleanValue2 = bool6.booleanValue();
            if (str3 != null) {
                return new c(str, intValue, str2, hnVar, fVar, booleanValue, booleanValue2, str3);
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
        fVar.z0("isInMergeQueue");
        aa.b bVar2 = aa.c.f;
        f4.C(cVar.f, bVar2, fVar, wVar, "isDraft");
        f4.C(cVar.g, bVar2, fVar, wVar, "id");
        bVar.b(fVar, wVar, cVar.h);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
