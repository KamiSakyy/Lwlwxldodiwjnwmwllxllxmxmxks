package sd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"file", "id"});

    public static y c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u uVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                uVar = (u) aa.c.b(aa.c.c(i0.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str != null) {
            return new y(uVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, y yVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yVar, "value");
        fVar.z0("file");
        aa.c.b(aa.c.c(i0.a, false)).b(fVar, wVar, yVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, yVar.b);
    }
    public static Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object h(Object p1, Object p2, Object p3) { return null; }
    public static Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object o(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
