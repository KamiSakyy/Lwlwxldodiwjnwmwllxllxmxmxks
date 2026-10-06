package ci;

import a5.s;
import androidx.lifecycle.c0;

/* loaded from: /home/user/work/p/classes3.dex */
public class b extends a {
    public static final s Q;
    public long P;

    static {
        s sVar = new s(2);
        Q = sVar;
        sVar.D(0, new String[]{"toolbar"}, new int[]{1}, new int[]{2131559958});
    }

    public final void D0() {
        synchronized (this) {
            this.P = 0L;
        }
        this.O.E0();
    }

    public final boolean H0() {
        synchronized (this) {
            try {
                if (this.P != 0) {
                    return true;
                }
                return this.O.H0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void I0() {
        synchronized (this) {
            this.P = 2L;
        }
        this.O.I0();
        L0();
    }

    public final void M0(c0 c0Var) {
        super.M0(c0Var);
        this.O.M0(c0Var);
    }

}
