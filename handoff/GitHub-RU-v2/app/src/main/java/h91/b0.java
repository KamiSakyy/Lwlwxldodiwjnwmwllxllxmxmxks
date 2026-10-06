package h91;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b0 implements k0 {
    public j r;
    public h s;
    public f0 t;
    public int u;
    public boolean v;
    public long w;

    public b0(j jVar) {
        this.r = jVar;
        h a = jVar.a();
        this.s = a;
        f0 f0Var = a.r;
        this.t = f0Var;
        this.u = f0Var != null ? f0Var.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // h91.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long U(h hVar, long j) {
        f0 f0Var;
        k71.k.g(hVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        if (this.v) {
            throw new IllegalStateException("closed");
        }
        f0 f0Var2 = this.t;
        h hVar2 = this.s;
        if (f0Var2 != null) {
            f0 f0Var3 = hVar2.r;
            if (f0Var2 == f0Var3) {
                int i = this.u;
                k71.k.d(f0Var3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.r.request(this.w + 1)) {
            return -1L;
        }
        if (this.t == null && (f0Var = hVar2.r) != null) {
            this.t = f0Var;
            this.u = f0Var.b;
        }
        long min = Math.min(j, hVar2.s - this.w);
        this.s.E(hVar, this.w, min);
        this.w += min;
        return min;
    }

    @Override // h91.k0
    public final m0 b() {
        return this.r.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.v = true;
    }
}
