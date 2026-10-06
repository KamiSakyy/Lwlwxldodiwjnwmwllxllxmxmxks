package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fq implements aaShadow.a {
    public static final fq a = new fq();
    public static final List b = sy.d0.o("filename", "body");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jo.l10(str, str2);
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.l10 l10Var = (jo.l10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l10Var, "value");
        fVar.z0("filename");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, l10Var.a);
        fVar.z0("body");
        o0Var.b(fVar, wVar, l10Var.b);
    }
}
