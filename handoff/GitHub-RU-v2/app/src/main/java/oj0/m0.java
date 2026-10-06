package oj0;

import gn0.yv;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 implements aa.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0.o(new String[]{"state", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        yv yvVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                yv.Companion.getClass();
                Iterator it = yv.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((yv) obj).r.equals(u)) {
                        break;
                    }
                }
                yv yvVar2 = (yv) obj;
                yvVar = yvVar2 == null ? yv.t : yvVar2;
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (yvVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new h0(yvVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        h0 h0Var = (h0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h0Var, "value");
        fVar.z0("state");
        fVar.I(h0Var.a.r);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h0Var.c);
    }
    public Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object a(Object p1, Object p2, Object p3) { return null; }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public Object w(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
