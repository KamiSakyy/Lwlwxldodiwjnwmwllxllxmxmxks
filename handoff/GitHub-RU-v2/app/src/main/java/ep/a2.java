package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a2 implements aaShadow.a {
    public static final a2 a = new a2();
    public static final List b = sy.d0.o("id", "planLimit", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "planLimit");
            throw null;
        }
        int intValue = num.intValue();
        if (str2 != null) {
            return new jo.j3(str, intValue, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.j3 j3Var = (jo.j3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j3Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j3Var.a);
        fVar.z0("planLimit");
        fVar.z(j3Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j3Var.c);
    }
}
