package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a5 implements aaShadow.a {
    public static final a5 a = new a5();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "repository", "number", "title", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        jn0.q7 q7Var = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                q7Var = (jn0.q7) aa.c.c(b5.a, false).a(eVar, wVar);
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
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                num = num2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (q7Var == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (num3 == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num3.intValue();
        if (str2 == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (str3 != null) {
            return new jn0.p7(str, q7Var, intValue, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.p7 p7Var = (jn0.p7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p7Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p7Var.a);
        fVar.z0("repository");
        aa.c.c(b5.a, false).b(fVar, wVar, p7Var.b);
        fVar.z0("number");
        fVar.z(p7Var.c);
        fVar.z0("title");
        bVar.b(fVar, wVar, p7Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p7Var.e);
    }
}
