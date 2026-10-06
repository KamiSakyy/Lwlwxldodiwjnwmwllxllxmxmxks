package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d implements j {
    public c[] r;

    public d(c[] cVarArr) {
        this.r = cVarArr;
    }

    public final void a() {
        for (c cVar : this.r) {
            n0 n0Var = cVar.w;
            if (n0Var == null) {
                k71.k.m("handle");
                throw null;
            }
            n0Var.a();
        }
    }

    @Override // v71.j
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.r + ']';
    }
}
