package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jm implements aaShadow.a {
    public static final jm a = new jm();
    public static final List b = sy.d0.o(new String[]{"id", "gitObject", "ref", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.gw gwVar = null;
        kc0.hw hwVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                gwVar = (kc0.gw) aa.c.b(aa.c.c(hm.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                hwVar = (kc0.hw) aa.c.b(aa.c.c(im.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new kc0.iw(str, gwVar, hwVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.iw iwVar = (kc0.iw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iwVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iwVar.a);
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(hm.a, true)).b(fVar, wVar, iwVar.b);
        fVar.z0("ref");
        aa.c.b(aa.c.c(im.a, false)).b(fVar, wVar, iwVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, iwVar.d);
    }
}
