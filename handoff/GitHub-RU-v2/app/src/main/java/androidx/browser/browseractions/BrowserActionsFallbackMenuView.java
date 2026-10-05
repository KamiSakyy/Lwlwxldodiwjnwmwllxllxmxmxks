package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

@Deprecated
/* loaded from: /home/user/work/p/classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: r, reason: collision with root package name */
    public final int f1059r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1060s;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1059r = getResources().getDimensionPixelOffset(2131165282);
        this.f1060s = getResources().getDimensionPixelOffset(2131165281);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1059r * 2), this.f1060s), 1073741824), i10);
    }
}
