package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u8 implements aa.a {
    public static final u8 a = new u8();
    public static final List b = sy.d0.o(new String[]{"extension", "fileType"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.gd gdVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new kc0.fd(str, gdVar);
                }
                gdVar = (kc0.gd) aa.c.b(aa.c.c(v8.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.fd fdVar = (kc0.fd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fdVar, "value");
        fVar.z0("extension");
        aa.c.i.b(fVar, wVar, fdVar.a);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(v8.a, true)).b(fVar, wVar, fdVar.b);
    }
}
