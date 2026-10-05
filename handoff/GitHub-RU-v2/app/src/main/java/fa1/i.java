package fa1;

import retrofit2.HttpException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i implements h {
    public final /* synthetic */ int r;
    public final k s;

    public /* synthetic */ i(k kVar, int i) {
        this.r = i;
        this.s = kVar;
    }

    @Override // fa1.h
    public final void i(e eVar, q0 q0Var) {
        switch (this.r) {
            case 0:
                boolean z = q0Var.a.H;
                k kVar = this.s;
                if (!z) {
                    kVar.completeExceptionally(new HttpException(q0Var));
                    break;
                } else {
                    kVar.complete(q0Var.b);
                    break;
                }
            default:
                this.s.complete(q0Var);
                break;
        }
    }

    @Override // fa1.h
    public final void s(e eVar, Throwable th) {
        switch (this.r) {
            case 0:
                this.s.completeExceptionally(th);
                break;
            default:
                this.s.completeExceptionally(th);
                break;
        }
    }
}
