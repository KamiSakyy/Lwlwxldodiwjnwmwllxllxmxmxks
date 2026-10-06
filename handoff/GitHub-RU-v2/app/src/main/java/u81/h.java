package u81;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h implements r {
    public q a;

    public h(Throwable th) {
        this.a = new q(this, th, 2);
    }

    @Override // u81.r
    public final boolean a() {
        return false;
    }

    @Override // u81.r
    public final r b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // u81.r
    public final n c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // u81.r, v81.d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // u81.r
    public final q e() {
        return this.a;
    }

    @Override // u81.r
    public final q g() {
        return this.a;
    }
}
