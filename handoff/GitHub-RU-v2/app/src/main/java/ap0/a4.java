package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a4 implements aa.a {
    public static final a4 a = new a4();
    public static final List b = sy.d0.o(new String[]{"extension", "path", "fileType"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        n3 n3Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    return new m3(str, str2, n3Var);
                }
                n3Var = (n3) aa.c.b(aa.c.c(b4.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m3 m3Var = (m3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m3Var, "value");
        fVar.z0("extension");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, m3Var.a);
        fVar.z0("path");
        o0Var.b(fVar, wVar, m3Var.b);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(b4.a, true)).b(fVar, wVar, m3Var.c);
    }
}
