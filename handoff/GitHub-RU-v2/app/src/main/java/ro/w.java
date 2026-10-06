package ro;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements aa.a {
    public static final w a = new w();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        qo.c0 c0Var;
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
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            c0Var = x.c(eVar, wVar);
        } else {
            c0Var = null;
        }
        if (str2 != null) {
            return new qo.b0(str, str2, c0Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qo.b0 b0Var = (qo.b0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, b0Var.b);
        qo.c0 c0Var = b0Var.c;
        if (c0Var != null) {
            x.d(fVar, wVar, c0Var);
        }
    }
    public Object e(Object p1) { return null; }
}
