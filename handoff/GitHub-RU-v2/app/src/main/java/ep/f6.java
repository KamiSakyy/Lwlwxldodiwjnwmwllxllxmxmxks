package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f6 implements aaShadow.a {
    public static final f6 a = new f6();
    public static final List b = sy.d0.n("totalCount");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        while (eVar.r0(b) == 0) {
            long nextLong = eVar.nextLong();
            if (nextLong > 2147483647L) {
                while (nextLong > 2147483647L) {
                    nextLong = jo.f4.c(1, nextLong, "substring(...)");
                }
                num = Integer.valueOf((int) nextLong);
            } else {
                num = Integer.valueOf((int) nextLong);
            }
        }
        if (num != null) {
            return new jo.i9(num.intValue());
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.i9 i9Var = (jo.i9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i9Var, "value");
        fVar.z0("totalCount");
        fVar.z(i9Var.a);
    }
}
