package f0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: /home/user/work/p/classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public Context f22316a;

    /* renamed from: b, reason: collision with root package name */
    public int f22317b;

    /* renamed from: c, reason: collision with root package name */
    public long f22318c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f22319d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f22320e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f22321f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f22322g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f22323h;
    public EdgeEffect i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f22324j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f22325k;

    public k0(Context context, int i) {
        this.f22316a = context;
        this.f22317b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? m.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(h0.b2 b2Var) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f22316a;
        EdgeEffect a10 = i >= 31 ? m.a(context) : new r0(context);
        a10.setColor(this.f22317b);
        if (!s3.l.a(this.f22318c, 0L)) {
            if (b2Var == h0.b2.f24910r) {
                long j10 = this.f22318c;
                a10.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
                return a10;
            }
            long j11 = this.f22318c;
            a10.setSize((int) (j11 & 4294967295L), (int) (j11 >> 32));
        }
        return a10;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f22320e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a10 = a(h0.b2.f24910r);
        this.f22320e = a10;
        return a10;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f22321f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a10 = a(h0.b2.f24911s);
        this.f22321f = a10;
        return a10;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f22322g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a10 = a(h0.b2.f24911s);
        this.f22322g = a10;
        return a10;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f22319d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a10 = a(h0.b2.f24910r);
        this.f22319d = a10;
        return a10;
    }
}
