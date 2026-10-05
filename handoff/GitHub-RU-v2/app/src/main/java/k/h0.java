package k;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 {

    /* renamed from: e, reason: collision with root package name */
    public static h0 f27474e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27475a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f27476b;

    /* renamed from: c, reason: collision with root package name */
    public long f27477c;

    /* renamed from: d, reason: collision with root package name */
    public long f27478d;

    public /* synthetic */ h0() {
    }

    public static void c(h0 h0Var, long j10, long j11, int i) {
        if ((i & 1) != 0) {
            j10 = 0;
        }
        if ((i & 2) != 0) {
            j11 = 0;
        }
        synchronized (h0Var) {
            try {
                if (j10 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j11 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j12 = h0Var.f27477c + j10;
                h0Var.f27477c = j12;
                long j13 = h0Var.f27478d + j11;
                h0Var.f27478d = j13;
                if (j13 > j12) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(double d10, double d11, long j10) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.f27476b = 1;
            this.f27477c = -1L;
            this.f27478d = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f27476b = 0;
                this.f27477c = -1L;
                this.f27478d = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f27477c = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f27478d = round;
            if (round >= j10 || this.f27477c <= j10) {
                this.f27476b = 1;
            } else {
                this.f27476b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.f27477c - this.f27478d;
    }

    public String toString() {
        switch (this.f27475a) {
            case 1:
                return "WindowCounter(streamId=" + this.f27476b + ", total=" + this.f27477c + ", acknowledged=" + this.f27478d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public h0(int i) {
        this.f27476b = i;
    }
}
