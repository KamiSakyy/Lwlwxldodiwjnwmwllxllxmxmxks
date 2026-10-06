package fa1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h0 extends x0Shadow {
    public boolean d;

    public h0(boolean z) {
        this.d = z;
    }

    @Override // fa1.x0Shadow
    public final void a(n0 n0Var, Object obj) {
        if (obj == null) {
            return;
        }
        n0Var.d(obj.toString(), null, this.d);
    }
}
