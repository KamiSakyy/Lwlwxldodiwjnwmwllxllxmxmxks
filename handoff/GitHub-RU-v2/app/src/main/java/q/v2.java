package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f30744a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f30745b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f30746c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f30747d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f30748e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f30749f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f30750g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j.a.f26258j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d10 = d(context, i);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f30745b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = f30744a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f6 = typedValue.getFloat();
        return r4.a.f(c(context, i), Math.round(Color.alpha(r4) * f6));
    }

    public static int c(Context context, int i) {
        int[] iArr = f30750g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f30750g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = o4.b.c(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
