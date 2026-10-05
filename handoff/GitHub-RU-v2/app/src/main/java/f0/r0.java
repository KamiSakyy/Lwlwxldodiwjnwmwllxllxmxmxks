package f0;

import android.content.Context;
import android.widget.EdgeEffect;

/* loaded from: /home/user/work/p/classes.dex */
public final class r0 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f22359a;

    /* renamed from: b, reason: collision with root package name */
    public float f22360b;

    public r0(Context context) {
        super(context);
        this.f22359a = i21.a.b(context).f31691r * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f22360b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6, float f10) {
        this.f22360b = 0.0f;
        super.onPull(f6, f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f22360b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6) {
        this.f22360b = 0.0f;
        super.onPull(f6);
    }
}
