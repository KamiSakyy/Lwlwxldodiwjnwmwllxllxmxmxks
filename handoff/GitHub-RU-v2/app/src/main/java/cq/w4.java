package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w4 implements aa.a {
    public static final w4 a = new w4();
    public static final List b = sy.d0.o("extension", "path", "fileType");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        j4 j4Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    return new i4(str, str2, j4Var);
                }
                j4Var = (j4) aa.c.b(aa.c.c(x4.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i4 i4Var = (i4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i4Var, "value");
        fVar.z0("extension");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, i4Var.a);
        fVar.z0("path");
        o0Var.b(fVar, wVar, i4Var.b);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(x4.a, true)).b(fVar, wVar, i4Var.c);
    }
}
