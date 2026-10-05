package x41;

import com.google.android.gms.internal.measurement.n4;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements Closeable {
    public static final Logger x = Logger.getLogger(l.class.getName());
    public final RandomAccessFile r;
    public int s;
    public int t;
    public i u;
    public i v;
    public final byte[] w;

    public l(File file) {
        byte[] bArr = new byte[16];
        this.w = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    b0(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.r = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int E = E(0, bArr);
        this.s = E;
        if (E > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.s + ", Actual length: " + randomAccessFile2.length());
        }
        this.t = E(4, bArr);
        int E2 = E(8, bArr);
        int E3 = E(12, bArr);
        this.u = A(E2);
        this.v = A(E3);
    }

    public static int E(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void b0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final i A(int i) {
        if (i == 0) {
            return i.c;
        }
        RandomAccessFile randomAccessFile = this.r;
        randomAccessFile.seek(i);
        return new i(i, randomAccessFile.readInt());
    }

    public final synchronized void F() {
        if (t()) {
            throw new NoSuchElementException();
        }
        if (this.t == 1) {
            synchronized (this) {
                W(4096, 0, 0, 0);
                this.t = 0;
                i iVar = i.c;
                this.u = iVar;
                this.v = iVar;
                if (this.s > 4096) {
                    RandomAccessFile randomAccessFile = this.r;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.s = 4096;
            }
        } else {
            i iVar2 = this.u;
            int O = O(iVar2.a + 4 + iVar2.b);
            K(O, this.w, 0, 4);
            int E = E(0, this.w);
            W(this.s, this.t - 1, O, this.v.a);
            this.t--;
            this.u = new i(O, E);
        }
    }

    public final void K(int i, byte[] bArr, int i2, int i3) {
        int O = O(i);
        int i4 = O + i3;
        int i5 = this.s;
        RandomAccessFile randomAccessFile = this.r;
        if (i4 <= i5) {
            randomAccessFile.seek(O);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - O;
        randomAccessFile.seek(O);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void M(byte[] bArr, int i, int i2) {
        int O = O(i);
        int i3 = O + i2;
        int i4 = this.s;
        RandomAccessFile randomAccessFile = this.r;
        if (i3 <= i4) {
            randomAccessFile.seek(O);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - O;
        randomAccessFile.seek(O);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int N() {
        if (this.t == 0) {
            return 16;
        }
        i iVar = this.v;
        int i = iVar.a;
        int i2 = this.u.a;
        return i >= i2 ? (i - i2) + 4 + iVar.b + 16 : (((i + 4) + iVar.b) + this.s) - i2;
    }

    public final int O(int i) {
        int i2 = this.s;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void W(int i, int i2, int i3, int i4) {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.w;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.r;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                b0(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.r.close();
    }

    public final void f(byte[] bArr) {
        int O;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    m(length);
                    boolean t = t();
                    if (t) {
                        O = 16;
                    } else {
                        i iVar = this.v;
                        O = O(iVar.a + 4 + iVar.b);
                    }
                    i iVar2 = new i(O, length);
                    b0(this.w, 0, length);
                    M(this.w, O, 4);
                    M(bArr, O + 4, length);
                    W(this.s, this.t + 1, t ? O : this.u.a, O);
                    this.v = iVar2;
                    this.t++;
                    if (t) {
                        this.u = iVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void m(int i) {
        int i2 = i + 4;
        int N = this.s - N();
        if (N >= i2) {
            return;
        }
        int i3 = this.s;
        do {
            N += i3;
            i3 <<= 1;
        } while (N < i2);
        RandomAccessFile randomAccessFile = this.r;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        i iVar = this.v;
        int O = O(iVar.a + 4 + iVar.b);
        if (O < this.u.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.s);
            long j = O - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.v.a;
        int i5 = this.u.a;
        if (i4 < i5) {
            int i6 = (this.s + i4) - 16;
            W(i3, this.t, i5, i6);
            this.v = new i(i6, this.v.b);
        } else {
            W(i3, this.t, i5, i4);
        }
        this.s = i3;
    }

    public final synchronized void r(k kVar) {
        int i = this.u.a;
        for (int i2 = 0; i2 < this.t; i2++) {
            i A = A(i);
            kVar.a(new j(this, A), A.b);
            i = O(A.a + 4 + A.b);
        }
    }

    public final synchronized boolean t() {
        return this.t == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(l.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.s);
        sb.append(", size=");
        sb.append(this.t);
        sb.append(", first=");
        sb.append(this.u);
        sb.append(", last=");
        sb.append(this.v);
        sb.append(", element lengths=[");
        try {
            r(new n4((Object) sb, (byte) 0));
        } catch (IOException e) {
            x.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
