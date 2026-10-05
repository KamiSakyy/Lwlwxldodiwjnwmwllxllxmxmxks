package p;

import android.widget.PopupWindow;

/* loaded from: /home/user/work/p/classes.dex */
public final class u implements PopupWindow.OnDismissListener {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f30308r;

    public u(v vVar) {
        this.f30308r = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f30308r.c();
    }
}
