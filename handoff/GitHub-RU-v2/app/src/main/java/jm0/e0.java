package jm0;

import im0.r0;
import im0.t0;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 implements aa.a {
    public static final e0 a = new e0();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "mobilePushNotificationSettings", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        r0 r0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                r0Var = (r0) aa.c.b(aa.c.c(c0.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        bl0.a c = bl0.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new t0(str, r0Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t0 t0Var = (t0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t0Var.a);
        fVar.z0("mobilePushNotificationSettings");
        aa.c.b(aa.c.c(c0.a, false)).b(fVar, wVar, t0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, t0Var.c);
        List list = bl0.b.a;
        bl0.b.d(fVar, wVar, t0Var.d);
    }
}
