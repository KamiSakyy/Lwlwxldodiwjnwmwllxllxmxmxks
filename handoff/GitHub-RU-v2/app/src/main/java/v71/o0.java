package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o0 extends f1 {
    public final /* synthetic */ int v;
    public Object w;

    public /* synthetic */ o0(int i, Object obj) {
        this.v = i;
        this.w = obj;
    }

    @Override // v71.f1
    public final boolean k() {
        switch (this.v) {
        }
        return false;
    }

    @Override // v71.f1
    public final void l(Throwable th) {
        switch (this.v) {
            case 0:
                ((n0) this.w).a();
                break;
            case 1:
                ((j71.c) this.w).k(th);
                break;
            default:
                g1 g1Var = (g1) this.w;
                Object obj = j1.r.get(j());
                if (!(obj instanceof t)) {
                    g1Var.i(b0.J(obj));
                    break;
                } else {
                    g1Var.i(sy.y.d(((t) obj).a));
                    break;
                }
        }
    }
}
