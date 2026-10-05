package os0;

import aa.w;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import k71.k;
import pz0.gu;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "number", "title", "pullRequestState", "isInMergeQueue", "isDraft"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0018. Please report as an issue. */
    public static d c(ea.e eVar, w wVar) {
        Integer num;
        Boolean bool;
        Boolean bool2;
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        gu guVar = null;
        Boolean bool4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 1:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 2:
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
                case 3:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 4:
                    Integer num3 = num2;
                    bool = bool3;
                    bool2 = bool4;
                    String u = eVar.u();
                    k.d(u);
                    gu.Companion.getClass();
                    Iterator it = gu.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((gu) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    guVar = (gu) obj;
                    if (guVar == null) {
                        guVar = gu.v;
                    }
                    num2 = num3;
                    bool3 = bool;
                    bool4 = bool2;
                case 5:
                    num = num2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 6:
                    num = num2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
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
            Boolean bool5 = bool3;
            int intValue = num4.intValue();
            if (str3 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (guVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (bool5 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            Boolean bool6 = bool4;
            boolean booleanValue = bool5.booleanValue();
            if (bool6 != null) {
                return new d(intValue, str, str2, str3, guVar, booleanValue, bool6.booleanValue());
            }
            k41.b.B(eVar, "isDraft");
            throw null;
        }
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
        fVar.z0("isInMergeQueue");
        aa.b bVar2 = aa.c.f;
        f4.C(dVar.f, bVar2, fVar, wVar, "isDraft");
        bVar2.b(fVar, wVar, Boolean.valueOf(dVar.g));
    }
}
