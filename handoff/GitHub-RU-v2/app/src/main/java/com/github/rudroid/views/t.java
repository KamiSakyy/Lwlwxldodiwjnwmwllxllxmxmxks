package com.github.rudroid.views;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.rudroid.copilot.h1;
import k71.x;
import lg.b;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t extends ConstraintLayout {
    public static final /* synthetic */ r71.e[] I = {new k71.m(t.class, "text", "getText()Ljava/lang/CharSequence;", 0), h1.w(x.a, t.class, "progress", "getProgress()I", 0)};
    public lg.b H;

    /* JADX WARN: Multi-variable type inference failed */
    private final void setProgressValue(int i) {
        View findViewById = findViewById(2131363196);
        ProgressBar progressBar = findViewById instanceof ProgressBar ? (ProgressBar) findViewById : null;
        if (progressBar != null) {
            progressBar.setSecondaryProgress(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTextLabel(CharSequence charSequence) {
        View findViewById = findViewById(2131363422);
        TextView textView = findViewById instanceof TextView ? (TextView) findViewById : null;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final int getProgress() {
        r71.e eVar = I[1];
        throw null;
    }

    public final CharSequence getText() {
        r71.e eVar = I[0];
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLabelColor(lg.b bVar) {
        k71.k.g(bVar, "newColor");
        this.H = bVar;
        b.a aVar = lg.b.Companion;
        Context context = getContext();
        k71.k.f(context, "getContext(...)");
        lg.b bVar2 = this.H;
        aVar.getClass();
        setBackground(b.a.b(context, bVar2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165322);
        int i = dimensionPixelSize / 3;
        setPadding(dimensionPixelSize, i, dimensionPixelSize, i);
        Context context2 = getContext();
        k71.k.f(context2, "getContext(...)");
        int d = b.a.d(context2, this.H);
        View findViewById = findViewById(2131363422);
        TextView textView = findViewById instanceof TextView ? (TextView) findViewById : null;
        if (textView != null) {
            textView.setTextColor(d);
        }
    }

    public final void setProgress(int i) {
        r71.e eVar = I[1];
        throw null;
    }

    public final void setText(CharSequence charSequence) {
        r71.e eVar = I[0];
        throw null;
    }
    public Object setBackground(Object p1) { return null; }
}
