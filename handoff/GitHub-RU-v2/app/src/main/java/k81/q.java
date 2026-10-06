package k81;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;

/* loaded from: /home/user/work/p/classes5.dex */
public final class q implements m1, b1 {
    public final r r = new r();
    public w61.e s;

    public q(j71.c cVar) {
        this.s = cVar;
    }

    @Override // k81.b1
    public Object a(r71.b bVar, ArrayList arrayList) {
        KSerializer d;
        Object obj = this.r.get(v8.l0.x(bVar));
        k71.k.f(obj, "get(...)");
        v0 v0Var = (v0) obj;
        Object obj2 = v0Var.a.get();
        if (obj2 == null) {
            synchronized (v0Var) {
                obj2 = v0Var.a.get();
                if (obj2 == null) {
                    obj2 = new a1();
                    v0Var.a = new SoftReference(obj2);
                }
            }
        }
        a1 a1Var = (a1) obj2;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            arrayList2.add(new m0((r71.f) obj3));
        }
        ConcurrentHashMap concurrentHashMap = a1Var.a;
        Object obj4 = concurrentHashMap.get(arrayList2);
        if (obj4 == null) {
            try {
                d = (KSerializer) this.s.s(bVar, arrayList);
            } catch (Throwable th) {
                d = sy.y.d(th);
            }
            w61.n nVar = new w61.n(d);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, nVar);
            obj4 = putIfAbsent == null ? nVar : putIfAbsent;
        }
        return ((w61.n) obj4).r;
    }

    @Override // k81.m1
    public KSerializer h(r71.b bVar) {
        Object obj = this.r.get(v8.l0.x(bVar));
        k71.k.f(obj, "get(...)");
        v0 v0Var = (v0) obj;
        Object obj2 = v0Var.a.get();
        if (obj2 == null) {
            synchronized (v0Var) {
                obj2 = v0Var.a.get();
                if (obj2 == null) {
                    obj2 = new k((KSerializer) this.s.k(bVar));
                    v0Var.a = new SoftReference(obj2);
                }
            }
        }
        return ((k) obj2).a;
    }

    public q(j71.e eVar) {
        this.s = eVar;
    }
}
