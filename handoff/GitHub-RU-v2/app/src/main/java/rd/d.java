package rd;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import d1.c2;
import g9.f;
import s9.h;
import s9.i;
import v71.b0;
import v71.r;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements i {

    /* renamed from: r, reason: collision with root package name */
    public final TextView f31367r;

    public d(TextView textView) {
        this.f31367r = textView;
    }

    @Override // s9.i
    public final Object d(f fVar) {
        TextView textView = this.f31367r;
        if (!textView.isLayoutRequested()) {
            return new h(new s9.a(textView.getMeasuredWidth()), s9.b.f31766a);
        }
        r b10 = b0.b();
        ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
        c cVar = new c(this, viewTreeObserver, b10);
        viewTreeObserver.addOnPreDrawListener(cVar);
        b10.o0(new c2(this, viewTreeObserver, cVar, 16));
        Object s2 = b10.s(fVar);
        b71.a aVar = b71.a.r;
        return s2;
    }
}
