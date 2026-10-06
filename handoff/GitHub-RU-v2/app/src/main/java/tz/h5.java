package tz;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "title", "number", "updatedAt", "shortDescription", "public", "url", "closed", "owner", "repositories", "__typename"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0021. Please report as an issue. */
    public static b5 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Integer valueOf;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Throwable th2 = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        ZonedDateTime zonedDateTime = null;
        String str3 = null;
        Boolean bool2 = null;
        String str4 = null;
        z4 z4Var = null;
        a5 a5Var = null;
        String str5 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    th2 = null;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    th2 = null;
                case 2:
                    Boolean bool3 = bool;
                    Boolean bool4 = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    bool = bool3;
                    bool2 = bool4;
                    th2 = null;
                case 3:
                    num = num2;
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
                    num2 = num;
                case 4:
                    num = num2;
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    num2 = num;
                case 5:
                    num = num2;
                    bool = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 6:
                    num = num2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 7:
                    num = num2;
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 8:
                    num = num2;
                    z4Var = (z4) aa.c.c(f5.a, true).a(eVar, wVar);
                    num2 = num;
                case 9:
                    a5Var = (a5) aa.c.c(g5.a, false).a(eVar, wVar);
                    num2 = num2;
                    bool = bool;
                case 10:
                    num = num2;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
            }
            Integer num3 = num2;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw th2;
            }
            if (str2 == null) {
                k41.b.B(eVar, "title");
                throw th2;
            }
            if (num3 == null) {
                k41.b.B(eVar, "number");
                throw th2;
            }
            Boolean bool5 = bool;
            int intValue = num3.intValue();
            if (zonedDateTime == null) {
                k41.b.B(eVar, "updatedAt");
                throw th2;
            }
            if (bool5 == null) {
                k41.b.B(eVar, "public");
                throw th2;
            }
            Boolean bool6 = bool2;
            boolean booleanValue = bool5.booleanValue();
            if (str4 == null) {
                k41.b.B(eVar, "url");
                throw th2;
            }
            if (bool6 == null) {
                k41.b.B(eVar, "closed");
                throw th2;
            }
            boolean booleanValue2 = bool6.booleanValue();
            if (z4Var == null) {
                k41.b.B(eVar, "owner");
                throw th2;
            }
            if (a5Var == null) {
                k41.b.B(eVar, "repositories");
                throw th2;
            }
            if (str5 != null) {
                return new b5(str, str2, intValue, zonedDateTime, str3, booleanValue, str4, booleanValue2, z4Var, a5Var, str5);
            }
            k41.b.B(eVar, "__typename");
            throw th2;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, b5 b5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b5Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b5Var.a);
        fVar.z0("title");
        bVar.b(fVar, wVar, b5Var.b);
        fVar.z0("number");
        fVar.z(b5Var.c);
        fVar.z0("updatedAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, b5Var.d);
        fVar.z0("shortDescription");
        aa.c.i.b(fVar, wVar, b5Var.e);
        fVar.z0("public");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(b5Var.f, bVar2, fVar, wVar, "url");
        bVar.b(fVar, wVar, b5Var.g);
        fVar.z0("closed");
        jo.f4Shadow.C(b5Var.h, bVar2, fVar, wVar, "owner");
        aa.c.c(f5.a, true).b(fVar, wVar, b5Var.i);
        fVar.z0("repositories");
        aa.c.c(g5.a, false).b(fVar, wVar, b5Var.j);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, b5Var.k);
    }
}
