package com.github.rudroid.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.github.rudroid.p0;
import com.github.rudroid.utilities.u2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class MetadataLabelView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetadataLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k71.k.g(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165322);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p0.b, 0, 0);
        try {
            int i = obtainStyledAttributes.getInt(0, 0);
            lg.c cVar = i != 1 ? i != 2 ? i != 3 ? lg.c.r : lg.c.v : lg.c.u : lg.c.t;
            setTextAppearance(2132017644);
            g(this, cVar);
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(MetadataLabelView metadataLabelView, lg.c cVar) {
        metadataLabelView.getClass();
        Context context = metadataLabelView.getContext();
        k71.k.f(context, "getContext(...)");
        Drawable drawable = context.getDrawable(2131231563);
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        k71.k.e(mutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) mutate;
        Drawable mutate2 = layerDrawable.getDrawable(0).mutate();
        Resources resources = context.getResources();
        int a = lg.d.a(cVar);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = q4.l.a;
        mutate2.setColorFilter(new PorterDuffColorFilter(resources.getColor(a, theme), PorterDuff.Mode.SRC_OVER));
        layerDrawable.getDrawable(1).mutate().setColorFilter(new PorterDuffColorFilter(context.getResources().getColor(lg.d.c(cVar), context.getTheme()), PorterDuff.Mode.SRC_ATOP));
        metadataLabelView.setBackground(layerDrawable);
        Context context2 = metadataLabelView.getContext();
        k71.k.f(context2, "getContext(...)");
        super/*android.widget.TextView*/.setTextColor(context2.getResources().getColor(lg.d.d(cVar), context2.getTheme()));
        Context context3 = metadataLabelView.getContext();
        k71.k.f(context3, "getContext(...)");
        metadataLabelView.setCompoundDrawableColor(context3.getResources().getColor(lg.d.b(cVar), context3.getTheme()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCompoundDrawableColor(int i) {
        Drawable mutate;
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(2131165322) / 2);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        k71.k.f(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        for (Drawable drawable : compoundDrawablesRelative) {
            if (drawable != null && (mutate = drawable.mutate()) != null) {
                mutate.setTint(i);
            }
        }
    }

    public void setBackgroundResource(int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLabelIcon(int i) {
        u2.c(this, getContext().getDrawable(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLabelText(String str) {
        k71.k.g(str, "text");
        setText(str);
    }

    public void setTextColor(int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLabelIcon(Drawable drawable) {
        k71.k.g(drawable, "icon");
        u2.c(this, drawable);
    }
}
