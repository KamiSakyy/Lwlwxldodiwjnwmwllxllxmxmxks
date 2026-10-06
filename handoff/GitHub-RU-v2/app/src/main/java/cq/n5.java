package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "contributorsCount", "descriptionHTML", "primaryLanguage"});

    public static l5 c(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        k5 k5Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 3) {
                num = num2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                num = num2;
                k5Var = (k5) aa.c.b(aa.c.c(m5.a, false)).a(eVar, wVar);
            }
            num2 = num;
        }
        eVar.s0();
        dw.r5 r5Var = dw.r5.a;
        dw.o5 c = dw.r5.c(eVar, wVar);
        eVar.s0();
        t5 c2 = z5.c(eVar, wVar);
        Integer num3 = num2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num3 == null) {
            k41.b.B(eVar, "contributorsCount");
            throw null;
        }
        int intValue = num3.intValue();
        if (str3 != null) {
            return new l5(str, str2, intValue, str3, k5Var, c, c2);
        }
        k41.b.B(eVar, "descriptionHTML");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, l5 l5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l5Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l5Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, l5Var.b);
        fVar.z0("contributorsCount");
        fVar.z(l5Var.c);
        fVar.z0("descriptionHTML");
        bVar.b(fVar, wVar, l5Var.d);
        fVar.z0("primaryLanguage");
        aa.c.b(aa.c.c(m5.a, false)).b(fVar, wVar, l5Var.e);
        dw.r5 r5Var = dw.r5.a;
        dw.r5.d(fVar, wVar, l5Var.f);
        List list = z5.a;
        z5.d(fVar, wVar, l5Var.g);
    }
}
