package com.github.rudroid.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.github.rudroid.p0;
import lg.b;

/* loaded from: /home/user/work/p/classes3.dex */
public final class TransparentLabelView extends AppCompatTextView {
    public lg.b y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransparentLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k71.k.g(context, "context");
        lg.b bVar = lg.b.r;
        this.y = bVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p0.d, 0, 0);
        try {
            switch (obtainStyledAttributes.getInt(0, 0)) {
                case 1:
                    bVar = lg.b.y;
                    break;
                case 2:
                    bVar = lg.b.s;
                    break;
                case 3:
                    bVar = lg.b.t;
                    break;
                case 4:
                    bVar = lg.b.u;
                    break;
                case 5:
                    bVar = lg.b.v;
                    break;
                case 6:
                    bVar = lg.b.w;
                    break;
                case 7:
                    bVar = lg.b.x;
                    break;
            }
            this.y = bVar;
            obtainStyledAttributes.recycle();
            g();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        Drawable mutate;
        b.a aVar = lg.b.Companion;
        Context context = getContext();
        k71.k.f(context, "getContext(...)");
        lg.b bVar = this.y;
        aVar.getClass();
        setBackground(b.a.b(context, bVar));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165322);
        int i = dimensionPixelSize / 3;
        setPadding(dimensionPixelSize, i, dimensionPixelSize, i);
        Context context2 = getContext();
        k71.k.f(context2, "getContext(...)");
        int d = b.a.d(context2, this.y);
        setTextColor(d);
        setCompoundDrawablePadding(dimensionPixelSize / 2);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        k71.k.f(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        for (Drawable drawable : compoundDrawablesRelative) {
            if (drawable != null && (mutate = drawable.mutate()) != null) {
                mutate.setTint(d);
            }
        }
    }

    public final void setLabelColor(lg.b bVar) {
        k71.k.g(bVar, "newColor");
        this.y = bVar;
        g();
    }
}
