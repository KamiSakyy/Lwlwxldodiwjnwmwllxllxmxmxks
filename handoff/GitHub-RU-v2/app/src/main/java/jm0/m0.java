package jm0;

import im0.d1;
import im0.f1;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 implements aa.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0.o(new String[]{"mobilePushNotificationSettings", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d1 d1Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d1Var = (d1) aa.c.b(aa.c.c(k0.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
        if (str2 != null) {
            return new f1(d1Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f1 f1Var = (f1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f1Var, "value");
        fVar.z0("mobilePushNotificationSettings");
        aa.c.b(aa.c.c(k0.a, false)).b(fVar, wVar, f1Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, f1Var.c);
    }
}
