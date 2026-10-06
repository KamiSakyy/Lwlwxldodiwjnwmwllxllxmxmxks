package mz;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import m10.jq;
import m10.sa;
import m10.uq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = sy.d0Shadow.o("id", "threadType", "title", "isUnread", "unreadItemsCount", "lastUpdatedAt", "subscriptionStatus", "summaryItemAuthor", "summaryItemBody", "isArchived", "isSaved", "url", "optionalList", "reason", "optionalSubject", "__typename");

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
        uq uqVar = null;
        lz.n0 n0Var = null;
        String str4 = null;
        Boolean bool6 = null;
        String str5 = null;
        lz.a0Shadow a0Var = null;
        jq jqVar = null;
        lz.b0 b0Var = null;
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
                            nextLong = f4Shadow.c(1, nextLong, "substring(...)");
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
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
                case 6:
                    Boolean bool8 = bool4;
                    Integer num2 = num;
                    bool = bool5;
                    bool2 = bool6;
                    String u = eVar.u();
                    k71.k.d(u);
                    uq.Companion.getClass();
                    Iterator it = uq.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((uq) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    uq uqVar2 = (uq) obj;
                    uqVar = uqVar2 == null ? uq.t : uqVar2;
                    bool4 = bool8;
                    num = num2;
                    bool5 = bool;
                    bool6 = bool2;
                case 7:
                    bool3 = bool4;
                    n0Var = (lz.n0) aa.c.b(aa.c.c(m0.a, true)).a(eVar, wVar);
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
                    a0Var = (lz.a0Shadow) aa.c.b(aa.c.c(z.a, true)).a(eVar, wVar);
                    bool4 = bool3;
                case 13:
                    jqVar = (jq) aa.c.b(n10.b.m).a(eVar, wVar);
                case 14:
                    bool3 = bool4;
                    b0Var = (lz.b0) aa.c.b(aa.c.c(a0.a, true)).a(eVar, wVar);
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
            if (uqVar == null) {
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
            if (str6 != null) {
                return new lz.e(str, str2, str3, booleanValue, intValue, zonedDateTime, uqVar, n0Var, str4, booleanValue2, booleanValue3, str5, a0Var, jqVar, b0Var, str6);
            }
            k41.b.B(eVar, "__typename");
            throw null;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        lz.e eVar = (lz.e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.a);
        fVar.z0("threadType");
        bVar.b(fVar, wVar, eVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, eVar.c);
        fVar.z0("isUnread");
        aa.b bVar2 = aa.c.f;
        f4Shadow.C(eVar.d, bVar2, fVar, wVar, "unreadItemsCount");
        fVar.z(eVar.e);
        fVar.z0("lastUpdatedAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, eVar.f);
        fVar.z0("subscriptionStatus");
        fVar.I(eVar.g.r);
        fVar.z0("summaryItemAuthor");
        aa.c.b(aa.c.c(m0.a, true)).b(fVar, wVar, eVar.h);
        fVar.z0("summaryItemBody");
        aa.c.i.b(fVar, wVar, eVar.i);
        fVar.z0("isArchived");
        f4Shadow.C(eVar.j, bVar2, fVar, wVar, "isSaved");
        f4Shadow.C(eVar.k, bVar2, fVar, wVar, "url");
        bVar.b(fVar, wVar, eVar.l);
        fVar.z0("optionalList");
        aa.c.b(aa.c.c(z.a, true)).b(fVar, wVar, eVar.m);
        fVar.z0("reason");
        aa.c.b(n10.b.m).b(fVar, wVar, eVar.n);
        fVar.z0("optionalSubject");
        aa.c.b(aa.c.c(a0.a, true)).b(fVar, wVar, eVar.o);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, eVar.p);
    }
}
