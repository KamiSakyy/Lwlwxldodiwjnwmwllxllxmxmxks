package fd0;

import java.util.List;
import kc0.pa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bw implements aa.a {
    public static final bw a = new bw();
    public static final List b = sy.d0.o(new String[]{"__typename", "name", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        ud0.a c = ud0.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str3 != null) {
            return new pa0(str, str2, str3, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        pa0 pa0Var = (pa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pa0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pa0Var.a);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, pa0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, pa0Var.c);
        List list = ud0.b.a;
        ud0.b.d(fVar, wVar, pa0Var.d);
    }
}
