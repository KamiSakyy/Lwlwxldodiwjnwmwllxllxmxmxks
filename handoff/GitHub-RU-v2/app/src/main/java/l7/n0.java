package l7;

import android.database.Observable;

/* loaded from: /home/user/work/p/classes.dex */
public final class n0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((o0) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((o0) ((Observable) this).mObservers.get(size)).e(i, i10);
        }
    }

    public final void d(int i, Object obj, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((o0) ((Observable) this).mObservers.get(size)).c(i, obj, i10);
        }
    }

    public final void e(int i, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((o0) ((Observable) this).mObservers.get(size)).d(i, i10);
        }
    }

    public final void f(int i, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((o0) ((Observable) this).mObservers.get(size)).f(i, i10);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((o0) ((Observable) this).mObservers.get(size)).g();
        }
    }
}
