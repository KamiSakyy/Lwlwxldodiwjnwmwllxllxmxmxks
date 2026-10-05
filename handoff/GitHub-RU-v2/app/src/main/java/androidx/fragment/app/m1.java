package androidx.fragment.app;

import java.io.Writer;

/* loaded from: /home/user/work/p/classes.dex */
public final class m1 extends Writer {

    /* renamed from: r, reason: collision with root package name */
    public final StringBuilder f2605r = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final void f() {
        StringBuilder sb2 = this.f2605r;
        if (sb2.length() > 0) {
            sb2.toString();
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        f();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i + i11];
            if (c10 == '\n') {
                f();
            } else {
                this.f2605r.append(c10);
            }
        }
    }
}
