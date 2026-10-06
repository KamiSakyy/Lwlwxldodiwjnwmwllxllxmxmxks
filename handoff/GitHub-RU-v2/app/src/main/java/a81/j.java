package a81;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v71.b0;

/* loaded from: /home/user/work/p/classes5.dex */
public class j {
    public static final /* synthetic */ AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(j jVar, int i) {
        while (true) {
            j d = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    d = (j) obj;
                    if (!d.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            if (d instanceof h) {
                return (((h) d).u & i) == 0 && d.c(jVar, i);
            }
            atomicReferenceFieldUpdater.set(jVar, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(d, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(d) != this) {
                    break;
                }
            }
            jVar.e(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((a81.o) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            j jVar2 = jVar;
            while (true) {
                j jVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r;
                    Object obj = atomicReferenceFieldUpdater2.get(jVar2);
                    if (obj == this) {
                        if (jVar == jVar2) {
                            return jVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, jVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != jVar) {
                                break;
                            }
                        }
                        return jVar2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof o)) {
                        k71.k.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        jVar3 = jVar2;
                        jVar2 = (j) obj;
                    } else {
                        if (jVar3 != null) {
                            break;
                        }
                        jVar2 = (j) atomicReferenceFieldUpdater.get(jVar2);
                    }
                }
                jVar2 = jVar3;
            }
        }
    }

    public final void e(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (r.get(this) != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (i()) {
                jVar.d();
                return;
            }
            return;
        }
    }

    public final j h() {
        j jVar;
        Object obj = r.get(this);
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null && (jVar = oVar.a) != null) {
            return jVar;
        }
        k71.k.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (j) obj;
    }

    public boolean i() {
        return r.get(this) instanceof o;
    }

    public String toString() {
        return new i(1, 0, b0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + b0.q(this);
    }
    public Object g0(Object p1) { return null; }
}
