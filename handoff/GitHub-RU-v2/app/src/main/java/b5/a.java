package b5;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: r, reason: collision with root package name */
    public final int f3464r;

    /* renamed from: s, reason: collision with root package name */
    public final f f3465s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3466t;

    public a(int i, f fVar, int i10) {
        this.f3464r = i;
        this.f3465s = fVar;
        this.f3466t = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3464r);
        this.f3465s.f3484a.performAction(this.f3466t, bundle);
    }
}
