package v71;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i1 implements a1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(i1.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(i1.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(i1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public l1 r;

    public i1(l1 l1Var, Throwable th) {
        this.r = l1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable b = b();
        if (b == null) {
            t.set(this, th);
            return;
        }
        if (th == b) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable b() {
        return (Throwable) t.get(this);
    }

    public final boolean c() {
        return b() != null;
    }

    public final ArrayList d(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable b = b();
        if (b != null) {
            arrayList.add(0, b);
        }
        if (th != null && !th.equals(b)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, b0.h);
        return arrayList;
    }

    @Override // v71.a1
    public final boolean f() {
        return b() == null;
    }

    @Override // v71.a1
    public final l1 g() {
        return this.r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(c());
        sb.append(", completing=");
        sb.append(s.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(b());
        sb.append(", exceptions=");
        sb.append(u.get(this));
        sb.append(", list=");
        sb.append(this.r);
        sb.append(']');
        return sb.toString();
    }
}
