package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class io implements aa.a {
    public static final io a = new io();
    public static final List b = sy.d0.o(new String[]{"linesAdded", "linesDeleted", "filesChanged", "patches"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        jn0.az azVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                long nextLong2 = eVar.nextLong();
                if (nextLong2 > 2147483647L) {
                    while (nextLong2 > 2147483647L) {
                        nextLong2 = jo.f4.c(1, nextLong2, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong2);
                } else {
                    num2 = Integer.valueOf((int) nextLong2);
                }
            } else if (r0 == 2) {
                long nextLong3 = eVar.nextLong();
                if (nextLong3 > 2147483647L) {
                    while (nextLong3 > 2147483647L) {
                        nextLong3 = jo.f4.c(1, nextLong3, "substring(...)");
                    }
                    num3 = Integer.valueOf((int) nextLong3);
                } else {
                    num3 = Integer.valueOf((int) nextLong3);
                }
            } else {
                if (r0 != 3) {
                    break;
                }
                azVar = (jn0.az) aa.c.c(lo.a, false).a(eVar, wVar);
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
        if (azVar != null) {
            return new jn0.xy(intValue, intValue2, intValue3, azVar);
        }
        k41.b.B(eVar, "patches");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.xy xyVar = (jn0.xy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xyVar, "value");
        fVar.z0("linesAdded");
        fVar.z(xyVar.a);
        fVar.z0("linesDeleted");
        fVar.z(xyVar.b);
        fVar.z0("filesChanged");
        fVar.z(xyVar.c);
        fVar.z0("patches");
        aa.c.c(lo.a, false).b(fVar, wVar, xyVar.d);
    }
}
