package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import k41.b;
import w31.j;
import y21.a;

/* loaded from: /home/user/work/p/classes4.dex */
public class SnackbarContentLayout extends LinearLayout implements j {
    public TextView r;
    public Button s;
    public TimeInterpolator t;
    public int u;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = b.K(context, 2130969550, a.b);
    }

    @Override // w31.j
    public final void a(int i) {
        this.r.setAlpha(1.0f);
        long j = i;
        ViewPropertyAnimator duration = this.r.animate().alpha(0.0f).setDuration(j);
        TimeInterpolator timeInterpolator = this.t;
        long j2 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (this.s.getVisibility() == 0) {
            this.s.setAlpha(1.0f);
            this.s.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }

    @Override // w31.j
    public final void b(int i, int i2) {
        this.r.setAlpha(0.0f);
        long j = i2;
        ViewPropertyAnimator duration = this.r.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = this.t;
        long j2 = i;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (this.s.getVisibility() == 0) {
            this.s.setAlpha(0.0f);
            this.s.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }

    public final boolean c(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.r.getPaddingTop() == i2 && this.r.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.r;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.s;
    }

    public TextView getMessageView() {
        return this.r;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.r = (TextView) findViewById(2131363333);
        this.s = (Button) findViewById(2131363332);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165368);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165367);
        Layout layout = this.r.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.u <= 0 || this.s.getMeasuredWidth() <= this.u) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!c(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!c(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.u = i;
    }
}
