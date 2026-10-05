package w5;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: r, reason: collision with root package name */
    public long f33322r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f33323s;

    public a(f fVar) {
        this.f33323s = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f33322r;
            f fVar = this.f33323s;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + fVar.f33324r.available()) {
                    return -1;
                }
                fVar.m(j10);
                this.f33322r = j10;
            }
            if (i10 > fVar.f33324r.available()) {
                i10 = fVar.f33324r.available();
            }
            int read = fVar.read(bArr, i, i10);
            if (read >= 0) {
                this.f33322r += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f33322r = -1L;
        return -1;
    }
}
