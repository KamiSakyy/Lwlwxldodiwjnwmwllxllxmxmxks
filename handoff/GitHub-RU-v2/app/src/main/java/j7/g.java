package j7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f27260a;

    /* renamed from: b, reason: collision with root package name */
    public int f27261b;

    /* renamed from: c, reason: collision with root package name */
    public long f27262c;

    /* renamed from: d, reason: collision with root package name */
    public long f27263d;

    public g(int i, int i10, long j10, long j11) {
        this.f27260a = i;
        this.f27261b = i10;
        this.f27262c = j10;
        this.f27263d = j11;
    }

    public static g a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return gVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f27260a);
            dataOutputStream.writeInt(this.f27261b);
            dataOutputStream.writeLong(this.f27262c);
            dataOutputStream.writeLong(this.f27263d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f27261b == gVar.f27261b && this.f27262c == gVar.f27262c && this.f27260a == gVar.f27260a && this.f27263d == gVar.f27263d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f27261b), Long.valueOf(this.f27262c), Integer.valueOf(this.f27260a), Long.valueOf(this.f27263d));
    }
}
