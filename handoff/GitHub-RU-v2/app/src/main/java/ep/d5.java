package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d5 implements aa.a {
    public static final d5 a = new d5();
    public static final List b = sy.d0.o("success", "message");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "success");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str != null) {
            return new jo.v7(str, booleanValue);
        }
        k41.b.B(eVar, "message");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.v7 v7Var = (jo.v7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v7Var, "value");
        fVar.z0("success");
        jo.f4.C(v7Var.a, aa.c.f, fVar, wVar, "message");
        aa.c.a.b(fVar, wVar, v7Var.b);
    }
}
