package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "conclusion", "name", "summary", "permalink", "duration", "checkSuite", "isRequired"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001d. Please report as an issue. */
    public static jn0.i4 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        pz0.y2 y2Var = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool2 = null;
        jn0.y3 y3Var = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 1:
                    num = num2;
                    y2Var = (pz0.y2) aa.c.b(qz0.a.c).a(eVar, wVar);
                    num2 = num;
                case 2:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 3:
                    num = num2;
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    num2 = num;
                case 4:
                    num = num2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 5:
                    bool = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                    }
                    bool2 = bool;
                case 6:
                    bool = bool2;
                    y3Var = (jn0.y3) aa.c.c(i2.a, false).a(eVar, wVar);
                    num2 = num2;
                    bool2 = bool;
                case 7:
                    num = num2;
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
            }
            Integer num3 = num2;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "name");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "permalink");
                throw null;
            }
            if (num3 == null) {
                k41.b.B(eVar, "duration");
                throw null;
            }
            Boolean bool3 = bool2;
            int intValue = num3.intValue();
            if (y3Var == null) {
                k41.b.B(eVar, "checkSuite");
                throw null;
            }
            if (bool3 != null) {
                return new jn0.i4(str, y2Var, str2, str3, str4, intValue, y3Var, bool3.booleanValue());
            }
            k41.b.B(eVar, "isRequired");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.i4 i4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i4Var.a);
        fVar.z0("conclusion");
        aa.c.b(qz0.a.c).b(fVar, wVar, i4Var.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, i4Var.c);
        fVar.z0("summary");
        aa.c.i.b(fVar, wVar, i4Var.d);
        fVar.z0("permalink");
        bVar.b(fVar, wVar, i4Var.e);
        fVar.z0("duration");
        fVar.z(i4Var.f);
        fVar.z0("checkSuite");
        aa.c.c(i2.a, false).b(fVar, wVar, i4Var.g);
        fVar.z0("isRequired");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(i4Var.h));
    }
}
