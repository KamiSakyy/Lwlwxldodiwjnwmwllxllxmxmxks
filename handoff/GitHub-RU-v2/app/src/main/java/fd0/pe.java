package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pe implements aa.a {
    public static final pe a = new pe();
    public static final List b = sy.d0.o(new String[]{"id", "replyTo", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.cm cmVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                cmVar = (kc0.cm) aa.c.b(aa.c.c(ue.a, false)).a(eVar, wVar);
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
            return new kc0.wl(str, cmVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.wl wlVar = (kc0.wl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wlVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wlVar.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(ue.a, false)).b(fVar, wVar, wlVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, wlVar.c);
    }
}
