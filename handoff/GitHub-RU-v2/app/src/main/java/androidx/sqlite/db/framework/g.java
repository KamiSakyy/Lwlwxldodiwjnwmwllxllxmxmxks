package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public class g implements w7.d {

    /* renamed from: r, reason: collision with root package name */
    public final SQLiteProgram f3129r;

    public g(SQLiteProgram sQLiteProgram) {
        k.g(sQLiteProgram, "delegate");
        this.f3129r = sQLiteProgram;
    }

    @Override // w7.d
    public final void Y(String str, int i) {
        k.g(str, "value");
        this.f3129r.bindString(i, str);
    }

    @Override // w7.d
    public final void c(int i, long j10) {
        this.f3129r.bindLong(i, j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3129r.close();
    }

    @Override // w7.d
    public final void d(int i, byte[] bArr) {
        this.f3129r.bindBlob(i, bArr);
    }

    @Override // w7.d
    public final void g(int i) {
        this.f3129r.bindNull(i);
    }

    @Override // w7.d
    public final void l() {
        this.f3129r.clearBindings();
    }

    @Override // w7.d
    public final void n0(double d10, int i) {
        this.f3129r.bindDouble(i, d10);
    }
}
