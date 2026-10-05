package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v4 implements aa.a {
    public static final v4 a = new v4();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "url", "number", "parent"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        jn0.j7 j7Var = null;
        while (true) {
            int r0 = eVar.r0(b);
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
                j7Var = (jn0.j7) aa.c.b(aa.c.c(w4.a, true)).a(eVar, wVar);
            }
            num2 = num;
        }
        eVar.s0();
        uu0.j5 c = uu0.r5.c(eVar, wVar);
        Integer num3 = num2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (num3 != null) {
            return new jn0.i7(str, str2, str3, num3.intValue(), j7Var, c);
        }
        k41.b.B(eVar, "number");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.i7 i7Var = (jn0.i7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i7Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i7Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, i7Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, i7Var.c);
        fVar.z0("number");
        fVar.z(i7Var.d);
        fVar.z0("parent");
        aa.c.b(aa.c.c(w4.a, true)).b(fVar, wVar, i7Var.e);
        List list = uu0.r5.a;
        uu0.r5.d(fVar, wVar, i7Var.f);
    }
}
