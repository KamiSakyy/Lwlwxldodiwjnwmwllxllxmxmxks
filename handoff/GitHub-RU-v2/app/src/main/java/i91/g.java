package i91;

import h91.k0;
import h91.q;
import java.io.IOException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends q {
    public long s;
    public boolean t;
    public long u;

    public g(k0 k0Var, long j, boolean z) {
        super(k0Var);
        this.s = j;
        this.t = z;
    }

    @Override // h91.q, h91.k0
    public final long U(h91.h hVar, long j) {
        k71.k.g(hVar, "sink");
        long j2 = this.u;
        long j3 = this.s;
        if (j2 > j3) {
            j = 0;
        } else if (this.t) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long U = super.U(hVar, j);
        if (U != -1) {
            this.u += U;
        }
        long j5 = this.u;
        if ((j5 >= j3 || U != -1) && j5 <= j3) {
            return U;
        }
        if (U > 0 && j5 > j3) {
            long j6 = hVar.s - (j5 - j3);
            h91.h hVar2 = new h91.h();
            hVar2.G(hVar);
            hVar.I0(hVar2, j6);
            hVar2.r();
        }
        throw new IOException("expected " + j3 + " bytes but got " + this.u);
    }
}
