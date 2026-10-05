package w61;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements h, Serializable {
    public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "s");
    public volatile j71.a r;
    public volatile Object s;

    @Override // w61.h
    public final Object getValue() {
        Object obj = this.s;
        x xVar = x.a;
        if (obj != xVar) {
            return obj;
        }
        j71.a aVar = this.r;
        if (aVar != null) {
            Object a = aVar.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, a)) {
                if (atomicReferenceFieldUpdater.get(this) != xVar) {
                }
            }
            this.r = null;
            return a;
        }
        return this.s;
    }

    public final String toString() {
        return this.s != x.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
