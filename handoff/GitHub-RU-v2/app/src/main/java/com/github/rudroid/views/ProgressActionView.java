package com.github.rudroid.views;

import android.R;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ProgressActionView extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressActionView(Context context) {
        this(context, 0);
        k71.k.g(context, "context");
    }

    public ProgressActionView(Context context, int i) {
        super(context, null, R.attr.actionButtonStyle, 0);
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleSmall);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165315);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165284);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17));
        progressBar.setIndeterminate(true);
        addView(progressBar);
    }
}
