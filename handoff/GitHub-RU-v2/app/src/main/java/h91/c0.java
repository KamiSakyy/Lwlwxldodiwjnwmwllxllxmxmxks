package h91;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c0 extends OutputStream {
    public final /* synthetic */ int r = 0;
    public Object s;

    public c0(FileOutputStream fileOutputStream) {
        this.s = fileOutputStream;
    }

    private final void f() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.r) {
            case 0:
                ((d0) this.s).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.r) {
            case 0:
                d0 d0Var = (d0) this.s;
                if (!d0Var.t) {
                    d0Var.flush();
                    break;
                }
                break;
            default:
                ((FileOutputStream) this.s).flush();
                break;
        }
    }

    public String toString() {
        switch (this.r) {
            case 0:
                return ((d0) this.s) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.r) {
            case 0:
                d0 d0Var = (d0) this.s;
                if (d0Var.t) {
                    throw new IOException("closed");
                }
                d0Var.s.J0((byte) i);
                d0Var.f();
                return;
            default:
                ((FileOutputStream) this.s).write(i);
                return;
        }
    }

    public c0(d0 d0Var) {
        this.s = d0Var;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.r) {
            case 1:
                k71.k.g(bArr, "b");
                ((FileOutputStream) this.s).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        switch (this.r) {
            case 0:
                k71.k.g(bArr, "data");
                d0 d0Var = (d0) this.s;
                if (!d0Var.t) {
                    d0Var.s.write(bArr, i, i2);
                    d0Var.f();
                    return;
                }
                throw new IOException("closed");
            default:
                k71.k.g(bArr, "bytes");
                ((FileOutputStream) this.s).write(bArr, i, i2);
                return;
        }
    }
}
