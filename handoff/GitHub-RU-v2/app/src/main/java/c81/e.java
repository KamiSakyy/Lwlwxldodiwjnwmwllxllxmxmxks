package c81;

import v71.v;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e extends h {
    public static final e u;

    static {
        int i = k.c;
        int i2 = k.d;
        long j = k.e;
        String str = k.a;
        e eVar = new e();
        eVar.t = new c(i, i2, j, str);
        u = eVar;
    }

    @Override // v71.v
    public final v M0(int i) {
        a81.bShadow.a(i);
        return i >= k.c ? this : super.M0(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // v71.v
    public final String toString() {
        return "Dispatchers.Default";
    }
}
