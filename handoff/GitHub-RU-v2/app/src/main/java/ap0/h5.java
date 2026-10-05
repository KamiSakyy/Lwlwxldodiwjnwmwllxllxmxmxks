package ap0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "relatedItems"});

    public static f5 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                arrayList = aa.c.a(aa.c.c(g5.a, true)).c(eVar, wVar);
            }
        }
        eVar.s0();
        j5 c = l5.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (arrayList != null) {
            return new f5(str, arrayList, c);
        }
        k41.b.B(eVar, "relatedItems");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, f5 f5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f5Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, f5Var.a);
        fVar.z0("relatedItems");
        aa.c.a(aa.c.c(g5.a, true)).e(fVar, wVar, f5Var.b);
        List list = l5.a;
        l5.d(fVar, wVar, f5Var.c);
    }
}
