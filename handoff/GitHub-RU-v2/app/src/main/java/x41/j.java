package x41;

import java.io.InputStream;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends InputStream {
    public int r;
    public int s;
    public final /* synthetic */ l t;

    public j(l lVar, i iVar) {
        this.t = lVar;
        this.r = lVar.O(iVar.a + 4);
        this.s = iVar.b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.s;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.r;
        l lVar = this.t;
        lVar.K(i4, bArr, i, i2);
        this.r = lVar.O(this.r + i2);
        this.s -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.s == 0) {
            return -1;
        }
        l lVar = this.t;
        lVar.r.seek(this.r);
        int read = lVar.r.read();
        this.r = lVar.O(this.r + 1);
        this.s--;
        return read;
    }
}
