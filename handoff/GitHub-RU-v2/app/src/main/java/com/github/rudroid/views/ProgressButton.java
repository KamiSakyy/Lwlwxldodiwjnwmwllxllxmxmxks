package com.github.rudroid.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.github.rudroid.p0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ProgressButton extends FrameLayout {
    public ProgressBar r;
    public TextView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        k71.k.g(context, "context");
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleSmall);
        this.r = progressBar;
        TextView textView = new TextView(context, null, R.attr.textAppearanceButton);
        this.s = textView;
        int color = context.getColor(2131100986);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p0.c, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 2131231012);
            int color2 = obtainStyledAttributes.getColor(3, color);
            int color3 = obtainStyledAttributes.getColor(1, color);
            String string = obtainStyledAttributes.getString(2);
            string = string == null ? "" : string;
            boolean z = obtainStyledAttributes.getBoolean(4, false);
            obtainStyledAttributes.recycle();
            setBackgroundResource(resourceId);
            setMinimumHeight(getResources().getDimensionPixelSize(2131165283));
            textView.setTextAppearance(2132017904);
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            textView.setGravity(17);
            textView.setVisibility(0);
            textView.setTextColor(color2);
            textView.setText(string);
            addView(textView);
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131165284);
            progressBar.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            progressBar.setVisibility(8);
            progressBar.setIndeterminate(true);
            Drawable mutate = progressBar.getIndeterminateDrawable().mutate();
            mutate.setTint(color3);
            progressBar.setIndeterminateDrawable(mutate);
            addView(progressBar);
            setHasTransientState(z);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final void setLoading(boolean z) {
        setEnabled(!z);
        this.r.setVisibility(z ? 0 : 8);
        this.s.setVisibility(z ? 8 : 0);
    }

    public final void setText(String str) {
        k71.k.g(str, "text");
        this.s.setText(str);
    }

    public final void setTextColor(int i) {
        this.s.setTextColor(i);
        ProgressBar progressBar = this.r;
        Drawable mutate = progressBar.getIndeterminateDrawable().mutate();
        mutate.setTint(i);
        progressBar.setIndeterminateDrawable(mutate);
    }

    public final void setText(int i) {
        this.s.setText(i);
    }
}
