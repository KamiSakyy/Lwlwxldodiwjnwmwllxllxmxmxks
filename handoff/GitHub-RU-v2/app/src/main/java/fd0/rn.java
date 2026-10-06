package fd0;

import java.util.List;
import kc0.ny;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rn implements aaShadow.a {
    public static final rn a = new rn();
    public static final List b = sy.d0Shadow.o(new String[]{"contentHTML", "path"});

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
                    return new ny(str, str2);
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ny nyVar = (ny) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nyVar, "value");
        fVar.z0("contentHTML");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, nyVar.a);
        fVar.z0("path");
        o0Var.b(fVar, wVar, nyVar.b);
    }
}
