package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "contributorsCount", "descriptionHTML", "primaryLanguage"});

    public static p4 c(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        o4 o4Var = null;
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
                o4Var = (o4) aa.c.b(aa.c.c(q4.a, false)).a(eVar, wVar);
            }
            num2 = num;
        }
        eVar.s0();
        uu0.x4 x4Var = uu0.x4.a;
        uu0.u4 c = uu0.x4.c(eVar, wVar);
        eVar.s0();
        x4 c2 = d5.c(eVar, wVar);
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
            return new p4(str, str2, intValue, str3, o4Var, c, c2);
        }
        k41.b.B(eVar, "descriptionHTML");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, p4 p4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p4Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, p4Var.b);
        fVar.z0("contributorsCount");
        fVar.z(p4Var.c);
        fVar.z0("descriptionHTML");
        bVar.b(fVar, wVar, p4Var.d);
        fVar.z0("primaryLanguage");
        aa.c.b(aa.c.c(q4.a, false)).b(fVar, wVar, p4Var.e);
        uu0.x4 x4Var = uu0.x4.a;
        uu0.x4.d(fVar, wVar, p4Var.f);
        List list = d5.a;
        d5.d(fVar, wVar, p4Var.g);
    }
}
