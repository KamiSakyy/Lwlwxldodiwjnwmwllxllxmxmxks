package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w9 implements aaShadow.a {
    public static final w9 a = new w9();
    public static final List b = sy.d0.o("__typename", "starsSince", "contributorsCount", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        Integer valueOf;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        Integer num3 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                Integer num4 = num3;
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
                num3 = num4;
            } else if (r0 == 2) {
                num = num2;
                long nextLong2 = eVar.nextLong();
                if (nextLong2 > 2147483647L) {
                    while (nextLong2 > 2147483647L) {
                        nextLong2 = jo.f4.c(1, nextLong2, "substring(...)");
                    }
                    valueOf = Integer.valueOf((int) nextLong2);
                } else {
                    valueOf = Integer.valueOf((int) nextLong2);
                }
                num3 = valueOf;
            } else {
                if (r0 != 3) {
                    break;
                }
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            num2 = num;
        }
        eVar.s0();
        dw.m3 c = dw.t3.c(eVar, wVar);
        Integer num5 = num2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (num5 == null) {
            k41.b.B(eVar, "starsSince");
            throw null;
        }
        Integer num6 = num3;
        int intValue = num5.intValue();
        if (num6 == null) {
            k41.b.B(eVar, "contributorsCount");
            throw null;
        }
        int intValue2 = num6.intValue();
        if (str2 != null) {
            return new jo.se(str, intValue, intValue2, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.se seVar = (jo.se) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(seVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, seVar.a);
        fVar.z0("starsSince");
        fVar.z(seVar.b);
        fVar.z0("contributorsCount");
        fVar.z(seVar.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, seVar.d);
        List list = dw.t3.a;
        dw.t3.d(fVar, wVar, seVar.e);
    }
}
