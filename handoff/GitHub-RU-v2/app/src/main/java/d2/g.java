package d2;

import android.graphics.Bitmap;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f21341a;

    public g(Bitmap bitmap) {
        this.f21341a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.f21341a.getConfig();
        k71.k.d(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
