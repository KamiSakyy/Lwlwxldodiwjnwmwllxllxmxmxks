package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z4 implements aa.a {
    public static final z4 a = new z4();
    public static final List b = sy.d0.o("taskId", "title", "__typename");

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
        if (str == null) {
            k41.b.B(eVar, "taskId");
            throw null;
        }
        if (str3 != null) {
            return new jo.n7(str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.n7 n7Var = (jo.n7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n7Var, "value");
        fVar.z0("taskId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n7Var.a);
        fVar.z0("title");
        aa.c.i.b(fVar, wVar, n7Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, n7Var.c);
    }
}
