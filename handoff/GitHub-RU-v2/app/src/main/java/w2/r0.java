package w2;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: /home/user/work/p/classes.dex */
public final class r0 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f33134a;

    public r0(ViewConfiguration viewConfiguration) {
        this.f33134a = viewConfiguration;
    }

    @Override // w2.q2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // w2.q2
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // w2.q2
    public final float c() {
        return this.f33134a.getScaledMinimumFlingVelocity();
    }

    @Override // w2.q2
    public final float d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return s0.b(this.f33134a);
        }
        return 2.0f;
    }

    @Override // w2.q2
    public final float f() {
        return this.f33134a.getScaledMaximumFlingVelocity();
    }

    @Override // w2.q2
    public final float g() {
        return this.f33134a.getScaledTouchSlop();
    }

    @Override // w2.q2
    public final float h() {
        if (Build.VERSION.SDK_INT >= 34) {
            return s0.a(this.f33134a);
        }
        return 16.0f;
    }
}
