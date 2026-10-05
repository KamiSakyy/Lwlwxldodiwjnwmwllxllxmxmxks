package fa1;

import java.io.IOException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class w extends h91.q {
    public final /* synthetic */ int s = 0;
    public Object t;

    public /* synthetic */ w(h91.k0 k0Var) {
        super(k0Var);
    }

    @Override // h91.q, h91.k0
    public final long U(h91.h hVar, long j) {
        switch (this.s) {
            case 0:
                try {
                    return super.U(hVar, j);
                } catch (IOException e) {
                    ((x) this.t).u = e;
                    throw e;
                }
            default:
                try {
                    return super.U(hVar, j);
                } catch (Exception e2) {
                    this.t = e2;
                    throw e2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, h91.j jVar) {
        super(jVar);
        this.t = xVar;
    }
}
