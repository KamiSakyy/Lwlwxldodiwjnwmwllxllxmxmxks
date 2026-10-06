package v71;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends f1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final l v;
    public n0 w;
    public final /* synthetic */ e x;

    public c(e eVar, l lVar) {
        this.x = eVar;
        this.v = lVar;
    }

    @Override // v71.f1
    public final boolean k() {
        return false;
    }

    @Override // v71.f1
    public final void l(Throwable th) {
        l lVar = this.v;
        if (th != null) {
            lVar.getClass();
            a81.t H = lVar.H(new t(th, false), null);
            if (H != null) {
                lVar.y(H);
                d dVar = (d) y.get(this);
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.b;
        e eVar = this.x;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            e0[] e0VarArr = eVar.a;
            ArrayList arrayList = new ArrayList(e0VarArr.length);
            for (e0 e0Var : e0VarArr) {
                arrayList.add(e0Var.r());
            }
            lVar.i(arrayList);
        }
    }

    public c(Object... a) {
    }
    public static final Object s = null;
}
