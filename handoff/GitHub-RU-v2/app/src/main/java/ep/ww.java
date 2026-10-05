package ep;

import java.util.List;
import jo.fb0;
import jo.gb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ww implements aa.a {
    public static final ww a = new ww();
    public static final List b = sy.d0.o("number", "repository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        gb0 gb0Var = null;
        String str = null;
        String str2 = null;
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
                gb0Var = (gb0) aa.c.c(xw.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num.intValue();
        if (gb0Var == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new fb0(intValue, gb0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fb0 fb0Var = (fb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fb0Var, "value");
        fVar.z0("number");
        fVar.z(fb0Var.a);
        fVar.z0("repository");
        aa.c.c(xw.a, false).b(fVar, wVar, fb0Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fb0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, fb0Var.d);
    }
}
