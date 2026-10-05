package ci;

import android.util.SparseIntArray;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends c {
    public static final SparseIntArray P;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(2131363449, 1);
        sparseIntArray.put(2131363447, 2);
        sparseIntArray.put(2131363450, 3);
        sparseIntArray.put(2131363448, 4);
    }

    public final void D0() {
        synchronized (this) {
            this.O = 0L;
        }
    }

    public final boolean H0() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void I0() {
        synchronized (this) {
            this.O = 1L;
        }
        L0();
    }
}
