package f00;

import java.util.Iterator;
import java.util.List;
import m10.mx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 implements aa.a {
    public static final d0 a = new d0();
    public static final List b = sy.d0Shadow.o("type", "value");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        mx mxVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                mx.Companion.getClass();
                Iterator it = mx.z.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((mx) obj).r.equals(u)) {
                        break;
                    }
                }
                mx mxVar2 = (mx) obj;
                mxVar = mxVar2 == null ? mx.x : mxVar2;
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (mxVar != null) {
            return new a0Shadow(mxVar, str);
        }
        k41.b.B(eVar, "type");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a0Shadow a0Var = (a0Shadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("type");
        fVar.I(a0Var.a.r);
        fVar.z0("value");
        aa.c.i.b(fVar, wVar, a0Var.b);
    }
}
