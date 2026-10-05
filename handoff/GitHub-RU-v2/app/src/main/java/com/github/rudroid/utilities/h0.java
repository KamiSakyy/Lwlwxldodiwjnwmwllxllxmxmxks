package com.github.rudroid.utilities;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.widget.TextView;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements t9.b {
    public final /* synthetic */ TextView r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Spannable t;
    public final /* synthetic */ Integer u;
    public final /* synthetic */ Integer v;

    public h0(TextView textView, int i, Spannable spannable, Integer num, Integer num2) {
        this.r = textView;
        this.s = i;
        this.t = spannable;
        this.u = num;
        this.v = num2;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        TextView textView = this.r;
        int lineHeight = textView.getLineHeight() - this.s;
        int min = lineHeight > 0 ? Math.min(drawable.getIntrinsicHeight(), lineHeight) : textView.getLineHeight() > 0 ? Math.min(drawable.getIntrinsicHeight(), textView.getLineHeight()) : drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth * min, min);
        ImageSpan imageSpan = new ImageSpan(drawable, 1);
        int intValue = this.u.intValue();
        int intValue2 = this.v.intValue() + 1;
        Spannable spannable = this.t;
        spannable.setSpan(imageSpan, intValue, intValue2, 33);
        textView.setText(spannable);
    }

    public final void b(Drawable drawable) {
        Objects.toString(drawable);
    }

    public final void c(Drawable drawable) {
    }
}
