package p;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: /home/user/work/p/classes.dex */
public final class p extends FrameLayout implements o.c {

    /* renamed from: r, reason: collision with root package name */
    public final CollapsibleActionView f30300r;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f30300r = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // o.c
    public final void onActionViewCollapsed() {
        this.f30300r.onActionViewCollapsed();
    }

    @Override // o.c
    public final void onActionViewExpanded() {
        this.f30300r.onActionViewExpanded();
    }
}
