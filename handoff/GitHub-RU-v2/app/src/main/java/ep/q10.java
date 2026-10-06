package ep;

import java.util.List;
import jo.ji0;
import jo.ki0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q10 implements aaShadow.a {
    public static final q10 a = new q10();
    public static final List b = sy.d0.o("notificationThreads", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ji0 ji0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ji0Var = (ji0) aa.c.c(p10.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (ji0Var == null) {
            k41.b.B(eVar, "notificationThreads");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new ki0(ji0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ki0 ki0Var = (ki0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ki0Var, "value");
        fVar.z0("notificationThreads");
        aa.c.c(p10.a, false).b(fVar, wVar, ki0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ki0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ki0Var.c);
    }
}
