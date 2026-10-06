package c30;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements aa.a {
    public static final z a = new z();
    public static final List b = sy.d0Shadow.o("extension", "path", "fileType");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        m mVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    return new l(str, str2, mVar);
                }
                mVar = (m) aa.c.b(aa.c.c(a0Shadow.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l lVar = (l) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("extension");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, lVar.a);
        fVar.z0("path");
        o0Var.b(fVar, wVar, lVar.b);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(a0Shadow.a, true)).b(fVar, wVar, lVar.c);
    }
}
