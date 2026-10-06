package com.github.commonandroid.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import f0.b2;
import k71.k;
import sy.w;
import w61.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ScrollableTitleToolbar extends Toolbar {
    public static final /* synthetic */ int p0 = 0;
    public p o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTitleToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k.g(context, "context");
        this.o0 = w.t(new b2(15, this));
    }

    private final ViewGroup getHeaderText() {
        Object value = this.o0.getValue();
        k.f(value, "getValue(...)");
        return (ViewGroup) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(float f) {
        getHeaderText().setTranslationY(f);
        if (getHeaderText().getTranslationY() > getHeight()) {
            getHeaderText().setVisibility(8);
        } else {
            getHeaderText().setVisibility(0);
        }
    }

    public static Object setTag(Object... a) {
        return null;
    }

    public static Object getHeight(Object... a) {
        return null;
    }

    public static Object m(Object... a) {
        return null;
    }

    public static Object getMenu(Object... a) {
        return null;
    }

    public static Object setOnMenuItemClickListener(Object... a) {
        return null;
    }
}
