package gk;

import java.util.Iterator;
import java.util.List;
import x61.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements e {
    @Override // gk.e
    public final Object a(List list, oa.j jVar, String str, String str2, a71.c cVar) {
        Object obj;
        if (jVar != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (k71.k.b(((oa.j) obj).a, jVar.a)) {
                    break;
                }
            }
            oa.j jVar2 = (oa.j) obj;
            if (jVar2 != null) {
                return jVar2;
            }
        }
        return (oa.j) m.U(list);
    }
    public Object M(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object a(Object p1) { return null; }
}
