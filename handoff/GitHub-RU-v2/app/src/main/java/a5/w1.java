package a5;

import android.view.animation.Interpolator;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f505a;

    /* renamed from: b, reason: collision with root package name */
    public float f506b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f507c;

    /* renamed from: d, reason: collision with root package name */
    public final long f508d;

    public w1(int i, Interpolator interpolator, long j10) {
        this.f505a = i;
        this.f507c = interpolator;
        this.f508d = j10;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f508d;
    }

    public float c() {
        Interpolator interpolator = this.f507c;
        return interpolator != null ? interpolator.getInterpolation(this.f506b) : this.f506b;
    }

    public int d() {
        return this.f505a;
    }

    public void e(float f6) {
        this.f506b = f6;
    }
}
