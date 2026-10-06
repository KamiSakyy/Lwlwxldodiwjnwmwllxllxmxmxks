package wc0;

import gn0.r6;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "fullDatabaseId", "name", "status", "conclusion", "duration", "title", "summary", "startedAt", "completedAt", "permalink", "isRequired", "__typename"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0026. Please report as an issue. */
    public static s1 c(ea.e eVar, aa.w wVar) {
        String str;
        Object obj;
        Integer valueOf;
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        gn0.r2 r2Var = null;
        gn0.l2 l2Var = null;
        String str5 = null;
        String str6 = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        String str7 = null;
        Boolean bool = null;
        String str8 = null;
        while (true) {
            int r0 = eVar.r0(a);
            aa.xShadow xVar = r6.a;
            switch (r0) {
                case 0:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                case 1:
                    str3 = (String) aa.c.i.a(eVar, wVar);
                case 2:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                case 3:
                    Integer num3 = num2;
                    str = str2;
                    String u = eVar.u();
                    k71.k.d(u);
                    gn0.r2.Companion.getClass();
                    Iterator it = gn0.r2.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((gn0.r2) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    gn0.r2 r2Var2 = (gn0.r2) obj;
                    r2Var = r2Var2 == null ? gn0.r2.t : r2Var2;
                    num2 = num3;
                    str2 = str;
                case 4:
                    l2Var = (gn0.l2) aa.c.b(hn0.a.b).a(eVar, wVar);
                case 5:
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                            str2 = str2;
                        }
                        str = str2;
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        str = str2;
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    str2 = str;
                case 6:
                    str5 = (String) aa.c.i.a(eVar, wVar);
                case 7:
                    str6 = (String) aa.c.i.a(eVar, wVar);
                case 8:
                    num = num2;
                    r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                    num2 = num;
                case 9:
                    num = num2;
                    r6.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                    num2 = num;
                case 10:
                    str7 = (String) aa.c.a.a(eVar, wVar);
                case 11:
                    bool = (Boolean) aa.c.k.a(eVar, wVar);
                case 12:
                    str8 = (String) aa.c.a.a(eVar, wVar);
            }
            Integer num4 = num2;
            if (str2 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "name");
                throw null;
            }
            if (r2Var == null) {
                k41.b.B(eVar, "status");
                throw null;
            }
            if (num4 == null) {
                k41.b.B(eVar, "duration");
                throw null;
            }
            int intValue = num4.intValue();
            if (str7 == null) {
                k41.b.B(eVar, "permalink");
                throw null;
            }
            if (str8 != null) {
                return new s1(str2, str3, str4, r2Var, l2Var, intValue, str5, str6, zonedDateTime, zonedDateTime2, str7, bool, str8);
            }
            k41.b.B(eVar, "__typename");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, s1 s1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s1Var.a);
        fVar.z0("fullDatabaseId");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, s1Var.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, s1Var.c);
        fVar.z0("status");
        fVar.I(s1Var.d.r);
        fVar.z0("conclusion");
        aa.c.b(hn0.a.b).b(fVar, wVar, s1Var.e);
        fVar.z0("duration");
        fVar.z(s1Var.f);
        fVar.z0("title");
        o0Var.b(fVar, wVar, s1Var.g);
        fVar.z0("summary");
        o0Var.b(fVar, wVar, s1Var.h);
        fVar.z0("startedAt");
        r6.Companion.getClass();
        aa.xShadow xVar = r6.a;
        aa.c.b(wVar.e(xVar)).b(fVar, wVar, s1Var.i);
        no.a.e(fVar, "completedAt", wVar, xVar).b(fVar, wVar, s1Var.j);
        fVar.z0("permalink");
        bVar.b(fVar, wVar, s1Var.k);
        fVar.z0("isRequired");
        aa.c.k.b(fVar, wVar, s1Var.l);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, s1Var.m);
    }
}
