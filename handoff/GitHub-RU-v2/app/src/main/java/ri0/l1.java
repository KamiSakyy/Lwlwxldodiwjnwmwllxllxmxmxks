package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l1 implements aa.a {
    public static final l1 a = new l1();
    public static final List b = sy.d0Shadow.o(new String[]{"path", "fileType"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        i0 i0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new q0(str, i0Var);
                }
                i0Var = (i0) aa.c.b(aa.c.c(c1.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q0 q0Var = (q0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("path");
        aa.c.i.b(fVar, wVar, q0Var.a);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(c1.a, true)).b(fVar, wVar, q0Var.b);
    }
}
