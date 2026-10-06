package k00;

import j00.i1;
import j00.k1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 implements aa.a {
    public static final p0 a = new p0();
    public static final List b = sy.d0Shadow.o("id", "mobilePushNotificationSettings", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        i1 i1Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                i1Var = (i1) aa.c.b(aa.c.c(n0.a, false)).a(eVar, wVar);
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
            return new k1(str, i1Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k1 k1Var = (k1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k1Var.a);
        fVar.z0("mobilePushNotificationSettings");
        aa.c.b(aa.c.c(n0.a, false)).b(fVar, wVar, k1Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k1Var.c);
    }
}
