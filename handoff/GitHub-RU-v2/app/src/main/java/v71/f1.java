package v71;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class f1 extends a81.j implements n0, a1 {
    public j1 u;

    @Override // v71.n0
    public final void a() {
        j1 j = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j1.r;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof f1) {
                if (obj != this) {
                    return;
                }
                p0 p0Var = b0.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, p0Var)) {
                    if (atomicReferenceFieldUpdater.get(j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof a1) || ((a1) obj).g() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a81.j.r;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof a81.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                k71.k.e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                a81.j jVar = (a81.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a81.j.t;
                a81.o oVar = (a81.o) atomicReferenceFieldUpdater3.get(jVar);
                if (oVar == null) {
                    oVar = new a81.o(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar.d();
                return;
            }
        }
    }

    @Override // v71.a1
    public final boolean f() {
        return true;
    }

    @Override // v71.a1
    public final l1 g() {
        return null;
    }

    public d1 getParent() {
        return j();
    }

    public final j1 j() {
        j1 j1Var = this.u;
        if (j1Var != null) {
            return j1Var;
        }
        k71.k.m("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // a81.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + b0.q(this) + "[job@" + b0.q(j()) + ']';
    }
}
