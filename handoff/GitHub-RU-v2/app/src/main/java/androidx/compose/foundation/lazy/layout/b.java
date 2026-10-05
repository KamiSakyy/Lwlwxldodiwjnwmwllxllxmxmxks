package androidx.compose.foundation.lazy.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1336a;

    /* renamed from: b, reason: collision with root package name */
    public long f1337b;

    public long a() {
        if (this.f1336a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f1337b - System.nanoTime());
    }
}
