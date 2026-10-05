package tz;

import java.time.LocalDate;
import java.util.List;
import m10.qa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "title", "titleHTML", "duration", "startDate"});

    public static o4 c(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        LocalDate localDate = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                num = num2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 4) {
                    break;
                }
                num = num2;
                qa.Companion.getClass();
                localDate = (LocalDate) wVar.e(qa.a).a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "titleHTML");
            throw null;
        }
        if (num3 == null) {
            k41.b.B(eVar, "duration");
            throw null;
        }
        int intValue = num3.intValue();
        if (localDate != null) {
            return new o4(str, str2, str3, intValue, localDate);
        }
        k41.b.B(eVar, "startDate");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, o4 o4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o4Var.a);
        fVar.z0("title");
        bVar.b(fVar, wVar, o4Var.b);
        fVar.z0("titleHTML");
        bVar.b(fVar, wVar, o4Var.c);
        fVar.z0("duration");
        fVar.z(o4Var.d);
        fVar.z0("startDate");
        qa.Companion.getClass();
        wVar.e(qa.a).b(fVar, wVar, o4Var.e);
    }
}
