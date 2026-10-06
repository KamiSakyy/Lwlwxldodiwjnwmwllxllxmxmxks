package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o4 implements aaShadow.a {
    public static final o4 a = new o4();
    public static final List b = sy.d0.o(new String[]{"id", "repository", "number", "title", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        kc0.a7 a7Var = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                a7Var = (kc0.a7) aa.c.c(p4.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
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
        if (a7Var == null) {
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
            return new kc0.z6(str, a7Var, intValue, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.z6 z6Var = (kc0.z6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z6Var.a);
        fVar.z0("repository");
        aa.c.c(p4.a, false).b(fVar, wVar, z6Var.b);
        fVar.z0("number");
        fVar.z(z6Var.c);
        fVar.z0("title");
        bVar.b(fVar, wVar, z6Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z6Var.e);
    }
}
