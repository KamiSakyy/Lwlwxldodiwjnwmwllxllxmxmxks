package wp0;

import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t implements aa.a {
    public static final List a = x61.l.r(new String[]{"number", "title", "state", "repository", "isInMergeQueue", "isDraft", "id"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0018. Please report as an issue. */
    public static f c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        String str = null;
        gu guVar = null;
        k kVar = null;
        String str2 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool2 = bool4;
                    bool3 = bool5;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        num = Integer.valueOf((int) nextLong);
                    } else {
                        num = Integer.valueOf((int) nextLong);
                    }
                    bool4 = bool2;
                    bool5 = bool3;
                case 1:
                    bool = bool4;
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool;
                case 2:
                    bool2 = bool4;
                    bool3 = bool5;
                    String u = eVar.u();
                    k71.k.d(u);
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
                    bool4 = bool2;
                    bool5 = bool3;
                case 3:
                    bool2 = bool4;
                    bool3 = bool5;
                    kVar = (k) aa.c.c(y.a, false).a(eVar, wVar);
                    bool4 = bool2;
                    bool5 = bool3;
                case 4:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 5:
                    bool = bool4;
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool;
                case 6:
                    bool = bool4;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool;
            }
            Boolean bool6 = bool4;
            if (num == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool7 = bool5;
            int intValue = num.intValue();
            if (str == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (guVar == null) {
                k41.b.B(eVar, "state");
                throw null;
            }
            if (kVar == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (bool6 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            boolean booleanValue = bool6.booleanValue();
            if (bool7 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            boolean booleanValue2 = bool7.booleanValue();
            if (str2 != null) {
                return new f(intValue, str, guVar, kVar, booleanValue, booleanValue2, str2);
            }
            k41.b.B(eVar, "id");
            throw null;
        }
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
        fVar.z0("isInMergeQueue");
        aa.b bVar2 = aa.c.f;
        f4.C(fVar2.e, bVar2, fVar, wVar, "isDraft");
        f4.C(fVar2.f, bVar2, fVar, wVar, "id");
        bVar.b(fVar, wVar, fVar2.g);
    }
}
