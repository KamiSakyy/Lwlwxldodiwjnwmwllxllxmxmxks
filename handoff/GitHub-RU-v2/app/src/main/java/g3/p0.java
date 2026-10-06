package g3;

/* loaded from: /home/user/work/p/classes.dex */
public final class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f24682b = g0.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f24683c = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f24684a;

    public static boolean a(long j10, Object obj) {
        return (obj instanceof p0) && j10 == ((p0) obj).f24684a;
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean c(long j10) {
        return ((int) (j10 >> 32)) == ((int) (j10 & 4294967295L));
    }

    public static final int d(long j10) {
        return e(j10) - f(j10);
    }

    public static final int e(long j10) {
        return Math.max((int) (j10 >> 32), (int) (j10 & 4294967295L));
    }

    public static final int f(long j10) {
        return Math.min((int) (j10 >> 32), (int) (j10 & 4294967295L));
    }

    public static final boolean g(long j10) {
        return ((int) (j10 >> 32)) > ((int) (j10 & 4294967295L));
    }

    public static String h(long j10) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j10 >> 32));
        sb2.append(", ");
        return x.i.j(sb2, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.f24684a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f24684a);
    }

    public final String toString() {
        return h(this.f24684a);
    }

    public static Object a(Object... a) {
        return null;
    }

    public static Object c(Object... a) {
        return null;
    }

    public static Object c;
    public Object a = null;
    public p0(Object p1) {
    }
    public p0(long p1) {
    }
}
