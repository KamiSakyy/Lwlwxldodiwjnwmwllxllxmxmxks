package q;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: /home/user/work/p/classes.dex */
public class b implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f30543r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f30544s;

    public /* synthetic */ b(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f30543r = i;
        this.f30544s = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30543r) {
            case k5.f.J:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f30544s;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.N = actionBarOverlayLayout.f935u.animate().translationY(0.0f).setListener(actionBarOverlayLayout.O);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f30544s;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.N = actionBarOverlayLayout2.f935u.animate().translationY(-actionBarOverlayLayout2.f935u.getHeight()).setListener(actionBarOverlayLayout2.O);
                break;
        }
    }
    public static final Object f1079h = null;
}
