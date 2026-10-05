package h4;

import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends k {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25501f;

    @Override // h4.k
    public final void c(View view, float f6) {
        switch (this.f25501f) {
            case k5.f.J /* 0 */:
                view.setAlpha(a(f6));
                break;
            case 1:
                view.setElevation(a(f6));
                break;
            case 2:
                view.setPivotX(a(f6));
                break;
            case 3:
                view.setPivotY(a(f6));
                break;
            case 4:
                view.setRotation(a(f6));
                break;
            case 5:
                view.setRotationX(a(f6));
                break;
            case 6:
                view.setRotationY(a(f6));
                break;
            case 7:
                view.setScaleX(a(f6));
                break;
            case 8:
                view.setScaleY(a(f6));
                break;
            case 9:
                view.setTranslationX(a(f6));
                break;
            case 10:
                view.setTranslationY(a(f6));
                break;
            default:
                view.setTranslationZ(a(f6));
                break;
        }
    }
}
