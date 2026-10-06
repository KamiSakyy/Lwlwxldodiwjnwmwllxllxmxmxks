package u81;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p implements r {
    public n a;

    public p(n nVar) {
        k71.k.g(nVar, "connection");
        this.a = nVar;
    }

    @Override // u81.r
    public final boolean a() {
        return true;
    }

    @Override // u81.r
    public final r b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // u81.r
    public final n c() {
        return this.a;
    }

    @Override // u81.r, v81.d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // u81.r
    public final q e() {
        throw new IllegalStateException("already connected");
    }

    @Override // u81.r
    public final q g() {
        throw new IllegalStateException("already connected");
    }
}
