package w5;

import java.io.InputStream;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f33324r.mark(Integer.MAX_VALUE);
    }

    public final void m(long j10) {
        int i = this.f33325s;
        if (i > j10) {
            this.f33325s = 0;
            this.f33324r.reset();
        } else {
            j10 -= i;
        }
        f((int) j10);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f33324r.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
