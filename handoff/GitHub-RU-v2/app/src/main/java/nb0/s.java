package nb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s implements aa.a {
    public static final s a = new s();
    public static final List b = sy.d0.o("mobilePushNotificationSettings", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        mb0.z zVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                zVar = (mb0.z) aa.c.b(aa.c.c(q.a, false)).a(eVar, wVar);
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
            return new mb0.b0(zVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mb0.b0 b0Var = (mb0.b0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("mobilePushNotificationSettings");
        aa.c.b(aa.c.c(q.a, false)).b(fVar, wVar, b0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, b0Var.c);
    }
}
