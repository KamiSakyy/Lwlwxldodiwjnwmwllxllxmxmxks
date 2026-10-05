package o7;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements v7.c {

    /* renamed from: r, reason: collision with root package name */
    public final v7.c f30011r;

    public f(v7.c cVar) {
        this.f30011r = cVar;
    }

    @Override // v7.c
    public final boolean B0() {
        return this.f30011r.B0();
    }

    @Override // v7.c
    public final boolean R() {
        return this.f30011r.R();
    }

    @Override // v7.c
    public final void c(int i, long j10) {
        this.f30011r.c(i, j10);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        v7.c cVar = this.f30011r;
        cVar.reset();
        cVar.l();
    }

    @Override // v7.c
    public final void d(int i, byte[] bArr) {
        this.f30011r.d(i, bArr);
    }

    @Override // v7.c
    public final void g(int i) {
        this.f30011r.g(i);
    }

    @Override // v7.c
    public final byte[] getBlob(int i) {
        return this.f30011r.getBlob(i);
    }

    @Override // v7.c
    public final int getColumnCount() {
        return this.f30011r.getColumnCount();
    }

    @Override // v7.c
    public final String getColumnName(int i) {
        return this.f30011r.getColumnName(i);
    }

    @Override // v7.c
    public final long getLong(int i) {
        return this.f30011r.getLong(i);
    }

    @Override // v7.c
    public final boolean isNull(int i) {
        return this.f30011r.isNull(i);
    }

    @Override // v7.c
    public final void k0(String str, int i) {
        k71.k.g(str, "value");
        this.f30011r.k0(str, i);
    }

    @Override // v7.c
    public final void l() {
        this.f30011r.l();
    }

    @Override // v7.c
    public final String l0(int i) {
        return this.f30011r.l0(i);
    }

    @Override // v7.c
    public final void reset() {
        this.f30011r.reset();
    }
}
