package ep;

import java.util.List;
import jo.sh0;
import jo.wh0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e10Shadow implements aaShadow.a {
    public static final e10Shadow a = new e10Shadow();
    public static final List b = sy.d0Shadow.o("user", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        wh0 wh0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wh0Var = (wh0) aa.c.b(aa.c.c(i10.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
            return new sh0(wh0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sh0 sh0Var = (sh0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sh0Var, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(i10.a, false)).b(fVar, wVar, sh0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, sh0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, sh0Var.c);
    }
}
