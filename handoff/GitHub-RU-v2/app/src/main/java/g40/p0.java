package g40;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 implements aa.a {
    public static final p0 a = new p0();
    public static final List b = sy.d0.o("__typename", "name", "avatarUrl", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        z zVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                zVar = (z) aa.c.b(aa.c.c(c1.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str3 != null) {
            return new m(str, str2, str3, zVar);
        }
        k41.b.B(eVar, "avatarUrl");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m mVar = (m) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mVar.a);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, mVar.b);
        fVar.z0("avatarUrl");
        bVar.b(fVar, wVar, mVar.c);
        fVar.z0("user");
        aa.c.b(aa.c.c(c1.a, false)).b(fVar, wVar, mVar.d);
    }
}
