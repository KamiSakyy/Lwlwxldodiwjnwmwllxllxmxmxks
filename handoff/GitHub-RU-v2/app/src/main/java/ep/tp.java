package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tp implements aaShadow.a {
    public static final tp a = new tp();
    public static final List b = sy.d0Shadow.o("linesAdded", "linesDeleted", "filesChanged", "patches");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        jo.a10 a10Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                long nextLong2 = eVar.nextLong();
                if (nextLong2 > 2147483647L) {
                    while (nextLong2 > 2147483647L) {
                        nextLong2 = jo.f4Shadow.c(1, nextLong2, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong2);
                } else {
                    num2 = Integer.valueOf((int) nextLong2);
                }
            } else if (r0 == 2) {
                long nextLong3 = eVar.nextLong();
                if (nextLong3 > 2147483647L) {
                    while (nextLong3 > 2147483647L) {
                        nextLong3 = jo.f4Shadow.c(1, nextLong3, "substring(...)");
                    }
                    num3 = Integer.valueOf((int) nextLong3);
                } else {
                    num3 = Integer.valueOf((int) nextLong3);
                }
            } else {
                if (r0 != 3) {
                    break;
                }
                a10Var = (jo.a10) aa.c.c(wp.a, false).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "linesAdded");
            throw null;
        }
        int intValue = num.intValue();
        if (num2 == null) {
            k41.b.B(eVar, "linesDeleted");
            throw null;
        }
        int intValue2 = num2.intValue();
        if (num3 == null) {
            k41.b.B(eVar, "filesChanged");
            throw null;
        }
        int intValue3 = num3.intValue();
        if (a10Var != null) {
            return new jo.x00(intValue, intValue2, intValue3, a10Var);
        }
        k41.b.B(eVar, "patches");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.x00 x00Var = (jo.x00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x00Var, "value");
        fVar.z0("linesAdded");
        fVar.z(x00Var.a);
        fVar.z0("linesDeleted");
        fVar.z(x00Var.b);
        fVar.z0("filesChanged");
        fVar.z(x00Var.c);
        fVar.z0("patches");
        aa.c.c(wp.a, false).b(fVar, wVar, x00Var.d);
    }
}
