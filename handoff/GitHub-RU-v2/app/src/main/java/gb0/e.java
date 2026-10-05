package gb0;

import hc0.h6;
import hc0.ih;
import hc0.th;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = sy.d0.o("id", "threadType", "title", "isUnread", "unreadItemsCount", "lastUpdatedAt", "subscriptionStatus", "summaryItemAuthor", "summaryItemBody", "isArchived", "isSaved", "url", "list", "reason", "subject", "__typename");

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002b. Please report as an issue. */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Integer valueOf;
        Object obj;
        Boolean bool3;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool4 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Boolean bool5 = null;
        ZonedDateTime zonedDateTime = null;
        th thVar = null;
        fb0.m0 m0Var = null;
        String str4 = null;
        Boolean bool6 = null;
        String str5 = null;
        fb0.e eVar2 = null;
        ih ihVar = null;
        fb0.l0 l0Var = null;
        String str6 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                case 3:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 4:
                    Boolean bool7 = bool4;
                    bool = bool5;
                    bool2 = bool6;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num = valueOf;
                    bool4 = bool7;
                    bool5 = bool;
                    bool6 = bool2;
                case 5:
                    h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(h6.a).a(eVar, wVar);
                case 6:
                    Boolean bool8 = bool4;
                    Integer num2 = num;
                    bool = bool5;
                    bool2 = bool6;
                    String u = eVar.u();
                    k71.k.d(u);
                    th.Companion.getClass();
                    Iterator it = th.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((th) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    th thVar2 = (th) obj;
                    thVar = thVar2 == null ? th.t : thVar2;
                    bool4 = bool8;
                    num = num2;
                    bool5 = bool;
                    bool6 = bool2;
                case 7:
                    bool3 = bool4;
                    m0Var = (fb0.m0) aa.c.b(aa.c.c(l0.a, true)).a(eVar, wVar);
                    bool4 = bool3;
                case 8:
                    str4 = (String) aa.c.i.a(eVar, wVar);
                case 9:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                case 10:
                    bool6 = (Boolean) aa.c.f.a(eVar, wVar);
                case 11:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                case 12:
                    bool3 = bool4;
                    eVar2 = (fb0.e) aa.c.c(d.a, true).a(eVar, wVar);
                    bool4 = bool3;
                case 13:
                    ihVar = (ih) aa.c.b(ic0.a.A).a(eVar, wVar);
                case 14:
                    bool3 = bool4;
                    l0Var = (fb0.l0) aa.c.c(k0.a, true).a(eVar, wVar);
                    bool4 = bool3;
                case 15:
                    str6 = (String) aa.c.a.a(eVar, wVar);
            }
            Boolean bool9 = bool4;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "threadType");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (bool9 == null) {
                k41.b.B(eVar, "isUnread");
                throw null;
            }
            Integer num3 = num;
            boolean booleanValue = bool9.booleanValue();
            if (num3 == null) {
                k41.b.B(eVar, "unreadItemsCount");
                throw null;
            }
            Boolean bool10 = bool5;
            int intValue = num3.intValue();
            if (zonedDateTime == null) {
                k41.b.B(eVar, "lastUpdatedAt");
                throw null;
            }
            if (thVar == null) {
                k41.b.B(eVar, "subscriptionStatus");
                throw null;
            }
            if (bool10 == null) {
                k41.b.B(eVar, "isArchived");
                throw null;
            }
            Boolean bool11 = bool6;
            boolean booleanValue2 = bool10.booleanValue();
            if (bool11 == null) {
                k41.b.B(eVar, "isSaved");
                throw null;
            }
            boolean booleanValue3 = bool11.booleanValue();
            if (str5 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (eVar2 == null) {
                k41.b.B(eVar, "list");
                throw null;
            }
            if (l0Var == null) {
                k41.b.B(eVar, "subject");
                throw null;
            }
            if (str6 != null) {
                return new fb0.f(str, str2, str3, booleanValue, intValue, zonedDateTime, thVar, m0Var, str4, booleanValue2, booleanValue3, str5, eVar2, ihVar, l0Var, str6);
            }
            k41.b.B(eVar, "__typename");
            throw null;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fb0.f fVar2 = (fb0.f) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fVar2.a);
        fVar.z0("threadType");
        bVar.b(fVar, wVar, fVar2.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, fVar2.c);
        fVar.z0("isUnread");
        aa.b bVar2 = aa.c.f;
        f4.C(fVar2.d, bVar2, fVar, wVar, "unreadItemsCount");
        fVar.z(fVar2.e);
        fVar.z0("lastUpdatedAt");
        h6.Companion.getClass();
        wVar.e(h6.a).b(fVar, wVar, fVar2.f);
        fVar.z0("subscriptionStatus");
        fVar.I(fVar2.g.r);
        fVar.z0("summaryItemAuthor");
        aa.c.b(aa.c.c(l0.a, true)).b(fVar, wVar, fVar2.h);
        fVar.z0("summaryItemBody");
        aa.c.i.b(fVar, wVar, fVar2.i);
        fVar.z0("isArchived");
        f4.C(fVar2.j, bVar2, fVar, wVar, "isSaved");
        f4.C(fVar2.k, bVar2, fVar, wVar, "url");
        bVar.b(fVar, wVar, fVar2.l);
        fVar.z0("list");
        aa.c.c(d.a, true).b(fVar, wVar, fVar2.m);
        fVar.z0("reason");
        aa.c.b(ic0.a.A).b(fVar, wVar, fVar2.n);
        fVar.z0("subject");
        aa.c.c(k0.a, true).b(fVar, wVar, fVar2.o);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, fVar2.p);
    }
}
