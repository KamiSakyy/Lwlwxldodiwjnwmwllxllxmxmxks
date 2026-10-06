package i9;

import java.io.InputStream;

/* loaded from: /home/user/work/p/classes.dex */
public final class k extends InputStream {

    /* renamed from: r, reason: collision with root package name */
    public final InputStream f26106r;

    /* renamed from: s, reason: collision with root package name */
    public int f26107s = 1073741824;

    public k(InputStream inputStream) {
        this.f26106r = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f26107s;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26106r.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f26106r.read();
        if (read == -1) {
            this.f26107s = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        return this.f26106r.skip(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.f26106r.read(bArr);
        if (read == -1) {
            this.f26107s = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        int read = this.f26106r.read(bArr, i, i10);
        if (read == -1) {
            this.f26107s = 0;
        }
        return read;
    }
}
