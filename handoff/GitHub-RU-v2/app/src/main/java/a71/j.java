package a71;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements c, c71.d {
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");
    public final c r;
    private volatile Object result;

    public j(c cVar) {
        b71.a aVar = b71.a.r;
        this.r = cVar;
        this.result = aVar;
    }

    @Override // c71.d
    public final c71.d g() {
        c cVar = this.r;
        if (cVar instanceof c71.d) {
            return (c71.d) cVar;
        }
        return null;
    }

    @Override // a71.c
    public final void i(Object obj) {
        while (true) {
            Object obj2 = this.result;
            b71.a aVar = b71.a.s;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            b71.a aVar2 = b71.a.r;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s;
            b71.a aVar3 = b71.a.t;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.r.i(obj);
            return;
        }
    }

    @Override // a71.c
    public final h q() {
        return this.r.q();
    }

    public final String toString() {
        return "SafeContinuation for " + this.r;
    }
}
