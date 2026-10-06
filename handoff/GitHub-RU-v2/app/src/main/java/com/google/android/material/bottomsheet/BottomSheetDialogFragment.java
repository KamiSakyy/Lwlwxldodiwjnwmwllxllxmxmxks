package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import d31.h;
import d31.j;

/* loaded from: /home/user/work/p/classes4.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public final void A4() {
        Object obj = ((DialogFragment) this).E0;
        if (obj instanceof j) {
            boolean z = ((j) obj).g().J;
        }
        t4(true, false);
    }

    public final void s4() {
        Object obj = ((DialogFragment) this).E0;
        if (obj instanceof j) {
            boolean z = ((j) obj).g().J;
        }
        t4(false, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, d31.j, k.b0] */
    public final Dialog v4() {
        Context y3 = y3();
        int i = ((DialogFragment) this).y0;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = y3.getTheme().resolveAttribute(2130968713, typedValue, true) ? typedValue.resourceId : 2132017932;
        }
        j jVar = new j(y3, i);
        jVar.B = true;
        jVar.C = true;
        jVar.H = new h(jVar);
        jVar.c().i(1);
        TypedArray obtainStyledAttributes = jVar.getContext().getTheme().obtainStyledAttributes(new int[]{2130969067});
        jVar.F = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return jVar;
    }

    public static  P3(Object... a) {
        return null;
    }

    public static  a4(Object... a) {
        return null;
    }

    public static  t4(Object... a) {
        return null;
    }
}
