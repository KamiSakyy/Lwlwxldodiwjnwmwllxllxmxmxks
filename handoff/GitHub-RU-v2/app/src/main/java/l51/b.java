package l51;

import java.io.OutputStream;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends OutputStream {
    public long r;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.r++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.r += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.r += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
    public static final Object a = null;
    public static final Object u = null;
}
