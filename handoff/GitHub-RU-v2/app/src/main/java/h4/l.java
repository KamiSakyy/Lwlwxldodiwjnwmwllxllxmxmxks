package h4;

import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class l extends p {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f25510k;

    @Override // h4.p
    public final boolean d(float f6, long j10, View view, b4.e eVar) {
        switch (this.f25510k) {
            case k5.f.J:
                view.setAlpha(b(f6, j10, view, eVar));
                break;
            case 1:
                view.setElevation(b(f6, j10, view, eVar));
                break;
            case 2:
                view.setRotation(b(f6, j10, view, eVar));
                break;
            case 3:
                view.setRotationX(b(f6, j10, view, eVar));
                break;
            case 4:
                view.setRotationY(b(f6, j10, view, eVar));
                break;
            case 5:
                view.setScaleX(b(f6, j10, view, eVar));
                break;
            case 6:
                view.setScaleY(b(f6, j10, view, eVar));
                break;
            case 7:
                view.setTranslationX(b(f6, j10, view, eVar));
                break;
            case 8:
                view.setTranslationY(b(f6, j10, view, eVar));
                break;
            default:
                view.setTranslationZ(b(f6, j10, view, eVar));
                break;
        }
        return this.f25521h;
    }
}
