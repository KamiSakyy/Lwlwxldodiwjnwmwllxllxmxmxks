package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zp implements aaShadow.a {
    public static final zp a = new zp();
    public static final List b = sy.d0.o("id", "additions", "deletions", "changedFiles", "latestCommit", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer valueOf;
        Integer valueOf2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num5 = null;
        String str = null;
        Integer num6 = null;
        Integer num7 = null;
        jo.i10 i10Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 != 0) {
                if (r0 == 1) {
                    Integer num8 = num6;
                    num2 = num7;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        num5 = Integer.valueOf((int) nextLong);
                    } else {
                        num5 = Integer.valueOf((int) nextLong);
                    }
                    num6 = num8;
                } else if (r0 != 2) {
                    if (r0 == 3) {
                        num3 = num5;
                        num4 = num6;
                        long nextLong2 = eVar.nextLong();
                        if (nextLong2 > 2147483647L) {
                            while (nextLong2 > 2147483647L) {
                                nextLong2 = jo.f4.c(1, nextLong2, "substring(...)");
                            }
                            valueOf = Integer.valueOf((int) nextLong2);
                        } else {
                            valueOf = Integer.valueOf((int) nextLong2);
                        }
                        num7 = valueOf;
                    } else if (r0 == 4) {
                        num3 = num5;
                        num4 = num6;
                        i10Var = (jo.i10) aa.c.c(cqShadow.a, false).a(eVar, wVar);
                    } else {
                        if (r0 != 5) {
                            break;
                        }
                        num = num5;
                        str2 = (String) aa.c.a.a(eVar, wVar);
                    }
                    num5 = num3;
                    num6 = num4;
                } else {
                    Integer num9 = num5;
                    num2 = num7;
                    long nextLong3 = eVar.nextLong();
                    if (nextLong3 > 2147483647L) {
                        while (nextLong3 > 2147483647L) {
                            nextLong3 = jo.f4.c(1, nextLong3, "substring(...)");
                        }
                        valueOf2 = Integer.valueOf((int) nextLong3);
                    } else {
                        valueOf2 = Integer.valueOf((int) nextLong3);
                    }
                    num6 = valueOf2;
                    num5 = num9;
                }
                num7 = num2;
            } else {
                num = num5;
                str = (String) aa.c.a.a(eVar, wVar);
            }
            num5 = num;
        }
        Integer num10 = num5;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num10 == null) {
            k41.b.B(eVar, "additions");
            throw null;
        }
        Integer num11 = num6;
        int intValue = num10.intValue();
        if (num11 == null) {
            k41.b.B(eVar, "deletions");
            throw null;
        }
        Integer num12 = num7;
        int intValue2 = num11.intValue();
        if (num12 == null) {
            k41.b.B(eVar, "changedFiles");
            throw null;
        }
        int intValue3 = num12.intValue();
        if (i10Var == null) {
            k41.b.B(eVar, "latestCommit");
            throw null;
        }
        if (str2 != null) {
            return new jo.f10(str, intValue, intValue2, intValue3, i10Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.f10 f10Var = (jo.f10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f10Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f10Var.a);
        fVar.z0("additions");
        fVar.z(f10Var.b);
        fVar.z0("deletions");
        fVar.z(f10Var.c);
        fVar.z0("changedFiles");
        fVar.z(f10Var.d);
        fVar.z0("latestCommit");
        aa.c.c(cqShadow.a, false).b(fVar, wVar, f10Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, f10Var.f);
    }
}
