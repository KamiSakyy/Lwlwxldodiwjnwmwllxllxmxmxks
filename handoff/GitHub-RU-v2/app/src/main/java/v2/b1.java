package v2;

/* loaded from: /home/user/work/p/classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32438a;

    public static final int a(int i, long j10) {
        int i10 = x1.f32636b;
        return ((int) (j10 >> (i * 15))) & 32767;
    }

    public static long c(int i, int i10, int i11, int i12) {
        return ((i10 & 32767) << 15) | (i & 32767) | ((i11 & 32767) << 30) | ((i12 & 32767) << 45) | Long.MIN_VALUE;
    }

    public int b() {
        switch (this.f32438a) {
            case k5.f.J /* 0 */:
                return 16;
            default:
                return 8;
        }
    }
}
