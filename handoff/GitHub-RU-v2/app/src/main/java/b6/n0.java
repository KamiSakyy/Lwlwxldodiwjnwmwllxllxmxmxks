package b6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class n0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3639v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3640w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Set f3641x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Set set, a71.c cVar, int i) {
        super(2, cVar);
        this.f3639v = i;
        this.f3641x = set;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f3639v) {
            case k5.f.J:
                n0 n0Var = new n0(this.f3641x, cVar, 0);
                n0Var.f3640w = obj;
                return n0Var;
            default:
                n0 n0Var2 = new n0(this.f3641x, cVar, 1);
                n0Var2.f3640w = obj;
                return n0Var2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        s5.b bVar = (s5.b) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f3639v) {
        }
        return r(cVar, bVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        int i = this.f3639v;
        Set set = this.f3641x;
        int i10 = 0;
        r2 = false;
        boolean z10 = false;
        switch (i) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                s5.b bVar = (s5.b) this.f3640w;
                Set set2 = (Set) bVar.d(q0.f3673g);
                if (set2 == null) {
                    return bVar;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set2) {
                    if (!set.contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return bVar;
                }
                s5.b h10 = bVar.h();
                h10.f(q0.f3673g, sy.f0.l(set2, arrayList));
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    h10.e(l0.b(q0.f3670d, (String) obj3));
                }
                return h10.i();
            default:
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                Set keySet = ((s5.b) this.f3640w).a().keySet();
                ArrayList arrayList2 = new ArrayList(x61.n.F(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((s5.e) it.next()).f31718a);
                }
                if (set != r5.h.f31169a) {
                    Set set3 = set;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        Iterator it2 = set3.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList2.contains((String) it2.next())) {
                            }
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                z10 = true;
                return Boolean.valueOf(z10);
        }
    }
}
