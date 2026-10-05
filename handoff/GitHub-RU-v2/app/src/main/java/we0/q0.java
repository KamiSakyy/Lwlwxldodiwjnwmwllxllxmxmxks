package we0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 implements aa.a {
    public static final q0 a = new q0();
    public static final List b = sy.d0.o(new String[]{"path", "fileType"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        h hVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new n(str, hVar);
                }
                hVar = (h) aa.c.b(aa.c.c(k0.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n nVar = (n) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("path");
        aa.c.i.b(fVar, wVar, nVar.a);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(k0.a, true)).b(fVar, wVar, nVar.b);
    }
}
