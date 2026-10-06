package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jd implements aaShadow.a {
    public static final jd a = new jd();
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
            return new jo.qj(str, booleanValue);
        }
        k41.b.B(eVar, "message");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.qj qjVar = (jo.qj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qjVar, "value");
        fVar.z0("success");
        jo.f4.C(qjVar.a, aa.c.f, fVar, wVar, "message");
        aa.c.a.b(fVar, wVar, qjVar.b);
    }
}
