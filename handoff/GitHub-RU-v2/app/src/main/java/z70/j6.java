package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j6 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "conclusion", "name", "duration", "summary", "permalink", "checkSuite", "isRequired"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001d. Please report as an issue. */
    public static w4 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        hc0.j2 j2Var = null;
        String str2 = null;
        Boolean bool2 = null;
        String str3 = null;
        String str4 = null;
        d4 d4Var = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 1:
                    num = num2;
                    j2Var = (hc0.j2) aa.c.b(ic0.a.b).a(eVar, wVar);
                    num2 = num;
                case 2:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 3:
                    bool = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                    }
                    bool2 = bool;
                case 4:
                    num = num2;
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    num2 = num;
                case 5:
                    num = num2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 6:
                    bool = bool2;
                    d4Var = (d4) aa.c.c(q5.a, false).a(eVar, wVar);
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
            if (num3 == null) {
                k41.b.B(eVar, "duration");
                throw null;
            }
            Boolean bool3 = bool2;
            int intValue = num3.intValue();
            if (str4 == null) {
                k41.b.B(eVar, "permalink");
                throw null;
            }
            if (d4Var == null) {
                k41.b.B(eVar, "checkSuite");
                throw null;
            }
            if (bool3 != null) {
                return new w4(str, j2Var, str2, intValue, str3, str4, d4Var, bool3.booleanValue());
            }
            k41.b.B(eVar, "isRequired");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, w4 w4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w4Var.a);
        fVar.z0("conclusion");
        aa.c.b(ic0.a.b).b(fVar, wVar, w4Var.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, w4Var.c);
        fVar.z0("duration");
        fVar.z(w4Var.d);
        fVar.z0("summary");
        aa.c.i.b(fVar, wVar, w4Var.e);
        fVar.z0("permalink");
        bVar.b(fVar, wVar, w4Var.f);
        fVar.z0("checkSuite");
        aa.c.c(q5.a, false).b(fVar, wVar, w4Var.g);
        fVar.z0("isRequired");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(w4Var.h));
    }
}
