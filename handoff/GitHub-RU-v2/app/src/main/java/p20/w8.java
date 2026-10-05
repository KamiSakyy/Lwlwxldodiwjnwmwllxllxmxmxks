package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w8 implements aa.a {
    public static final w8 a = new w8();
    public static final List b = sy.d0.o("id", "object", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.fd fdVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                fdVar = (u10.fd) aa.c.b(aa.c.c(u8.a, true)).a(eVar, wVar);
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
            return new u10.hd(str, fdVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.hd hdVar = (u10.hd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hdVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hdVar.a);
        fVar.z0("object");
        aa.c.b(aa.c.c(u8.a, true)).b(fVar, wVar, hdVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, hdVar.c);
    }
}
