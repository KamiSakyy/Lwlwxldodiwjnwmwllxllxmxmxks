package p20;

import java.util.List;
import u10.ow;
import u10.pw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class im implements aaShadow.a {
    public static final im a = new im();
    public static final List b = sy.d0.o("readme", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ow owVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                owVar = (ow) aa.c.b(aa.c.c(hm.a, false)).a(eVar, wVar);
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
            return new pw(owVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        pw pwVar = (pw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pwVar, "value");
        fVar.z0("readme");
        aa.c.b(aa.c.c(hm.a, false)).b(fVar, wVar, pwVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pwVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, pwVar.c);
    }
}
