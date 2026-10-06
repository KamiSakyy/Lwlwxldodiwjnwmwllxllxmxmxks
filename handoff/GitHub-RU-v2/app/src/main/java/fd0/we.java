package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class we implements aaShadow.a {
    public static final we a = new we();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        kc0.hm c = xe.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new kc0.gm(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.gm gmVar = (kc0.gm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gmVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gmVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, gmVar.b);
        List list = xe.a;
        kc0.hm hmVar = gmVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hmVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, hmVar.a);
        uf0.v vVar = uf0.v.a;
        uf0.v.d(fVar, wVar, hmVar.b);
    }
}
