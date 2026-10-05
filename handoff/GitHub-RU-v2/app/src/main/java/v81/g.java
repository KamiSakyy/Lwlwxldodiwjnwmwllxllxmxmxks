package v81;

import com.google.android.gms.internal.measurement.i4;
import h91.e0;
import h91.j;
import q81.c0;
import q81.q;
import t71.n;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends c0 {
    public final String s;
    public final long t;
    public final e0 u;

    public g(String str, long j, e0 e0Var) {
        this.s = str;
        this.t = j;
        this.u = e0Var;
    }

    @Override // q81.c0
    public final long f() {
        return this.t;
    }

    @Override // q81.c0
    public final q m() {
        String str = this.s;
        if (str == null) {
            return null;
        }
        n nVar = q.d;
        return i4.g0(str);
    }

    @Override // q81.c0
    public final j r() {
        return this.u;
    }
}
