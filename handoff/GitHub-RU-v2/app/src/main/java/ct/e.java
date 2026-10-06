package ct;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = sy.d0.o("id", "login");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
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
            return new a(str, str2);
        }
        k41.b.B(eVar, "login");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a aVar = (a) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, aVar.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, aVar.b);
    }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
