package b8;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends Animation {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3822r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f3823s;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f3822r = i;
        this.f3823s = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f6, Transformation transformation) {
        switch (this.f3822r) {
            case k5.f.J:
                this.f3823s.setAnimationProgress(f6);
                break;
            case 1:
                this.f3823s.setAnimationProgress(1.0f - f6);
                break;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f3823s;
                int abs = !swipeRefreshLayout.f3135d0 ? swipeRefreshLayout.Q - Math.abs(swipeRefreshLayout.P) : swipeRefreshLayout.Q;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.N + ((int) ((abs - r1) * f6))) - swipeRefreshLayout.L.getTop());
                e eVar = swipeRefreshLayout.S;
                float f10 = 1.0f - f6;
                d dVar = eVar.f3814r;
                if (f10 != dVar.f3805p) {
                    dVar.f3805p = f10;
                }
                eVar.invalidateSelf();
                break;
            case 3:
                this.f3823s.k(f6);
                break;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f3823s;
                float f11 = swipeRefreshLayout2.O;
                swipeRefreshLayout2.setAnimationProgress(((-f11) * f6) + f11);
                swipeRefreshLayout2.k(f6);
                break;
        }
    }


}
