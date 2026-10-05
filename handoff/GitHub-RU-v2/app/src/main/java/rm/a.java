package rm;

import c71.j;
import j71.f;
import java.util.ArrayList;
import java.util.List;
import l51.h;
import sy.y;
import w61.a0;
import x61.m;
import x61.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends j implements f {
    public /* synthetic */ List v;
    public /* synthetic */ boolean w;
    public final /* synthetic */ h x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, a71.c cVar) {
        super(3, cVar);
        this.x = hVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        a aVar = new a(this.x, (a71.c) obj3);
        aVar.v = (List) obj;
        aVar.w = booleanValue;
        return aVar.v(a0.a);
    }

    public final Object v(Object obj) {
        List<zj.d> list = this.v;
        boolean z = this.w;
        b71.a aVar = b71.a.r;
        y.j(obj);
        if (list.isEmpty() && !z) {
            pm.c.Companion.getClass();
            return pm.c.g;
        }
        if (list.isEmpty()) {
            pm.c.Companion.getClass();
            return pm.c.a(pm.c.h, null, null, null, z, 7);
        }
        ArrayList arrayList = new ArrayList(n.F(list, 10));
        for (zj.d dVar : list) {
            arrayList.add(new pm.b(dVar.b, dVar.b.name(), dVar.c, dVar.d));
        }
        return new pm.c(arrayList, ((zj.d) m.U(list)).c, ((zj.d) m.U(list)).d, z);
    }
}
