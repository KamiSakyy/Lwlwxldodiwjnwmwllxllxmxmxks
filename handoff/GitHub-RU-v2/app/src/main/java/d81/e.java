package d81;

import a0.s0;
import a81.r;
import a81.t;
import com.google.android.gms.internal.measurement.b4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k71.k;
import sy.d0;
import sy.y;
import v71.a2;
import v71.j;
import v71.l;
import w61.a0;
import x61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e implements j, f, a2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");
    public final a71.h r;
    public Object t;
    private volatile /* synthetic */ Object state$volatile = h.a;
    public ArrayList s = new ArrayList(2);
    public int u = -1;
    public Object v = h.d;

    public e(a71.h hVar) {
        this.r = hVar;
    }

    @Override // v71.a2
    public final void a(r rVar, int i) {
        this.t = rVar;
        this.u = i;
    }

    @Override // v71.j
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h.c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.s;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                ((c) obj2).a();
            }
            this.v = h.d;
            this.s = null;
            return;
        }
    }

    public final Object c(c71.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        Object obj = atomicReferenceFieldUpdater.get(this);
        k.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar2 = (c) obj;
        Object obj2 = this.v;
        ArrayList arrayList = this.s;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                c cVar3 = (c) obj3;
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.b);
            this.v = h.d;
            this.s = null;
        }
        Object f = cVar2.c.f(cVar2.a, cVar2.d, obj2);
        j71.c cVar4 = cVar2.e;
        return cVar2.d == h.e ? cVar4.k(cVar) : ((j71.e) cVar4).s(f, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(c71.c cVar) {
        d dVar;
        int i;
        Object obj;
        e eVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i2 = dVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.x = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.v;
                Object obj3 = b71.a.r;
                i = dVar.x;
                if (i != 0) {
                    y.j(obj2);
                    dVar.u = this;
                    dVar.x = 1;
                    l lVar = new l(1, b4.T(dVar));
                    lVar.t();
                    loop0: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
                        Object obj4 = atomicReferenceFieldUpdater.get(this);
                        obj = a0.a;
                        t tVar = h.a;
                        if (obj4 == tVar) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj4, lVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj4) {
                                    break;
                                }
                            }
                            lVar.w(this);
                            break loop0;
                        }
                        if (obj4 instanceof List) {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, obj4, tVar)) {
                                    Iterator it = ((Iterable) obj4).iterator();
                                    while (it.hasNext()) {
                                        c e = e(it.next());
                                        k.d(e);
                                        e.g = null;
                                        e.h = -1;
                                        f(e, true);
                                    }
                                } else if (atomicReferenceFieldUpdater.get(this) != obj4) {
                                    break;
                                }
                            }
                        } else {
                            if (!(obj4 instanceof c)) {
                                throw new IllegalStateException(("unexpected state: " + obj4).toString());
                            }
                            c cVar2 = (c) obj4;
                            Object obj5 = this.v;
                            j71.f fVar = cVar2.f;
                            lVar.h(obj, fVar != null ? (j71.f) fVar.f(this, cVar2.d, obj5) : null);
                        }
                    }
                    Object s = lVar.s();
                    if (s == b71.a.r) {
                        obj = s;
                    }
                    if (obj != obj3) {
                        eVar = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                    return obj2;
                }
                eVar = dVar.u;
                y.j(obj2);
                dVar.u = null;
                dVar.x = 2;
                Object c = eVar.c(dVar);
                return c != obj3 ? obj3 : c;
            }
        }
        dVar = new d(this, cVar);
        Object obj22 = dVar.v;
        Object obj32 = b71.a.r;
        i = dVar.x;
        if (i != 0) {
        }
        dVar.u = null;
        dVar.x = 2;
        Object c2 = eVar.c(dVar);
        if (c2 != obj32) {
        }
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.s;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj3 = arrayList.get(i);
            i++;
            if (((c) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z) {
        Object obj = cVar.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.s;
            k.d(arrayList);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((c) obj2).a == obj) {
                        throw new IllegalStateException(s0.h(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        cVar.b.f(obj, this, cVar.d);
        if (this.v != h.d) {
            atomicReferenceFieldUpdater.set(this, cVar);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.s;
            k.d(arrayList2);
            arrayList2.add(cVar);
        }
        cVar.g = this.t;
        cVar.h = this.u;
        this.t = null;
        this.u = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof v71.k)) {
                if (k.b(obj3, h.b) || (obj3 instanceof c)) {
                    return 3;
                }
                if (k.b(obj3, h.c)) {
                    return 2;
                }
                if (k.b(obj3, h.a)) {
                    List n = d0.n(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, n)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList m0 = m.m0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, m0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            c e = e(obj);
            if (e != null) {
                j71.f fVar = e.f;
                j71.f fVar2 = fVar != null ? (j71.f) fVar.f(this, e.d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, e)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                v71.k kVar = (v71.k) obj3;
                this.v = obj2;
                t p = kVar.p(a0.a, fVar2);
                if (p == null) {
                    this.v = h.d;
                    return 2;
                }
                kVar.y(p);
                return 0;
            }
            continue;
        }
    }
}
