package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k1 implements aa.a {
    public static final k1 a = new k1();
    public static final List b = sy.d0Shadow.o("path", "fileType");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        h0 h0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new p0(str, h0Var);
                }
                h0Var = (h0) aa.c.b(aa.c.c(b1.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p0 p0Var = (p0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p0Var, "value");
        fVar.z0("path");
        aa.c.i.b(fVar, wVar, p0Var.a);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(b1.a, true)).b(fVar, wVar, p0Var.b);
    }
}
