package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.material.button.MaterialButton;
import h31.c;
import k.d0;
import q.n;
import q.o;
import q.pShadow;
import q.z;
import q31.a;
import y31.r;

/* loaded from: /home/user/work/p/classes4.dex */
public class MaterialComponentsViewInflater extends d0 {
    public final n a(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    public final o b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final p c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, android.widget.CompoundButton, q.z, q31.a] */
    public final z d(Context context, AttributeSet attributeSet) {
        a aVar = new a(a41.a.a(context, attributeSet, 2130969679, 2132018481), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray f = o31.o.f(context2, attributeSet, x21.a.y, 2130969679, 2132018481, new int[0]);
        if (f.hasValue(0)) {
            aVar.setButtonTintList(i4.W(context2, f, 0));
        }
        aVar.w = f.getBoolean(1, false);
        f.recycle();
        return aVar;
    }

    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        AppCompatTextView aVar = new z31.a(a41.a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (b4.d0(2130969925, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = x21.a.C;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int g = z31.a.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, x21.a.B);
                    int g2 = z31.a.g(aVar.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g2 >= 0) {
                        aVar.setLineHeight(g2);
                    }
                }
            }
        }
        return aVar;
    }





}
