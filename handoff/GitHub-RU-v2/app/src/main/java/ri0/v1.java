package ri0;

import gn0.hn;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "pullRequestState", "title", "url", "number", "isDraft", "repository", "isInMergeQueue", "__typename"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001e. Please report as an issue. */
    public static u1 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Boolean bool;
        Boolean bool2;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        hn hnVar = null;
        String str2 = null;
        String str3 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        t1 t1Var = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 1:
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
                    hn hnVar2 = (hn) obj;
                    hnVar = hnVar2 == null ? hn.v : hnVar2;
                    num2 = num3;
                    bool3 = bool;
                    bool4 = bool2;
                case 2:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 3:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 4:
                    bool = bool3;
                    bool2 = bool4;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                    }
                    bool3 = bool;
                    bool4 = bool2;
                case 5:
                    num = num2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 6:
                    t1Var = (t1) aa.c.c(x1.a, false).a(eVar, wVar);
                    num2 = num2;
                    bool3 = bool3;
                case 7:
                    num = num2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 8:
                    num = num2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
            }
            Integer num4 = num2;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (hnVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (num4 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool5 = bool3;
            int intValue = num4.intValue();
            if (bool5 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Boolean bool6 = bool4;
            boolean booleanValue = bool5.booleanValue();
            if (t1Var == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (bool6 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            boolean booleanValue2 = bool6.booleanValue();
            if (str4 != null) {
                return new u1(str, hnVar, str2, str3, intValue, booleanValue, t1Var, booleanValue2, str4);
            }
            k41.b.B(eVar, "__typename");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, u1 u1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u1Var.a);
        fVar.z0("pullRequestState");
        fVar.I(u1Var.b.r);
        fVar.z0("title");
        bVar.b(fVar, wVar, u1Var.c);
        fVar.z0("url");
        bVar.b(fVar, wVar, u1Var.d);
        fVar.z0("number");
        fVar.z(u1Var.e);
        fVar.z0("isDraft");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(u1Var.f, bVar2, fVar, wVar, "repository");
        aa.c.c(x1.a, false).b(fVar, wVar, u1Var.g);
        fVar.z0("isInMergeQueue");
        jo.f4.C(u1Var.h, bVar2, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, u1Var.i);
    }
}
