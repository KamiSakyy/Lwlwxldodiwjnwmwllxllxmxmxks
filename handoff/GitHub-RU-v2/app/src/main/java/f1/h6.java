package f1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: /home/user/work/p/classes.dex */
public final class h6 extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22918a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f22918a) {
            case k5.f.J /* 0 */:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                if (!(view instanceof g2.k) || (outline2 = ((g2.k) view).f24553v) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 2:
                k71.k.e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                no.a.y(view);
                throw null;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
        }
    }
}
