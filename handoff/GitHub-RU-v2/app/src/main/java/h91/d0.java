package h91;

import java.nio.ByteBuffer;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d0 implements i {
    public final i0 r;
    public final h s;
    public boolean t;

    public d0(i0 i0Var) {
        k71.k.g(i0Var, "sink");
        this.r = i0Var;
        this.s = new h();
    }

    @Override // h91.i
    public final long G(k0 k0Var) {
        k71.k.g(k0Var, "source");
        long j = 0;
        while (true) {
            long U = k0Var.U(this.s, 8192L);
            if (U == -1) {
                return j;
            }
            j += U;
            f();
        }
    }

    @Override // h91.i0
    public final void I0(h hVar, long j) {
        k71.k.g(hVar, "source");
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        this.s.I0(hVar, j);
        f();
    }

    @Override // h91.i
    public final h a() {
        return this.s;
    }

    @Override // h91.i
    public final i a0(int i, byte[] bArr) {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        this.s.write(bArr, 0, i);
        f();
        return this;
    }

    @Override // h91.i0
    public final m0 b() {
        return this.r.b();
    }

    @Override // h91.i0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        i0 i0Var = this.r;
        if (this.t) {
            return;
        }
        try {
            h hVar = this.s;
            long j = hVar.s;
            if (j > 0) {
                i0Var.I0(hVar, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            i0Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.t = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // h91.i
    public final i d0(String str) {
        k71.k.g(str, "string");
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        this.s.P0(str);
        f();
        return this;
    }

    public final i f() {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.s;
        long A = hVar.A();
        if (A > 0) {
            this.r.I0(hVar, A);
        }
        return this;
    }

    @Override // h91.i, h91.i0, java.io.Flushable
    public final void flush() {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.s;
        long j = hVar.s;
        i0 i0Var = this.r;
        if (j > 0) {
            i0Var.I0(hVar, j);
        }
        i0Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.t;
    }

    public final i m(long j) {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        this.s.K0(j);
        f();
        return this;
    }

    @Override // h91.i
    public final i p(k kVar) {
        k71.k.g(kVar, "byteString");
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        this.s.E0(kVar);
        f();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.r + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        k71.k.g(byteBuffer, "source");
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        int write = this.s.write(byteBuffer);
        f();
        return write;
    }

    @Override // h91.i
    public final i writeByte(int i) {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        this.s.J0(i);
        f();
        return this;
    }

    @Override // h91.i
    public final i writeInt(int i) {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        this.s.M0(i);
        f();
        return this;
    }

    @Override // h91.i
    public final i writeShort(int i) {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        this.s.N0(i);
        f();
        return this;
    }

    @Override // h91.i
    public final i write(byte[] bArr) {
        k71.k.g(bArr, "source");
        if (!this.t) {
            this.s.write(bArr, 0, bArr.length);
            f();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
