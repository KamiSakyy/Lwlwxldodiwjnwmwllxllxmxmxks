package w2;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f33000a = new d0();

    public final void a(View view, q2.r rVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = rVar instanceof q2Shadow.a ? PointerIcon.getSystemIcon(context, ((q2.a) rVar).f30818b) : PointerIcon.getSystemIcon(context, 1000);
        if (k71.k.b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
