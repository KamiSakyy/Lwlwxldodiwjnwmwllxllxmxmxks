package com.github.rudroid.utilities;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.github.rudroid.activities.m0;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k2 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a r;
        public static final a s;
        public static final /* synthetic */ a[] t;

        static {
            a aVar = new a("CRITICAL", 0);
            r = aVar;
            a aVar2 = new a("INFO", 1);
            s = aVar2;
            a[] aVarArr = {aVar, aVar2};
            t = aVarArr;
            v8.l0.t(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) t.clone();
        }
    }

    public static final /* synthetic */ class b {
        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a aVar = a.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static boolean a(k.i iVar, String str, int i, m0.b bVar, ViewGroup viewGroup, a aVar, View view) {
        k71.k.g(aVar, "snackBarType");
        androidx.lifecycle.w wVar = ((n4.g) iVar).r.v;
        if (str == null || !(wVar == androidx.lifecycle.w.u || wVar == androidx.lifecycle.w.v)) {
            return false;
        }
        if (viewGroup == null) {
            View findViewById = iVar.findViewById(R.id.content);
            k71.k.f(findViewById, "findViewById(...)");
            viewGroup = (ViewGroup) findViewById;
        }
        w31.l k = w31.l.k(viewGroup, str, i);
        w31.h hVar = ((w31.i) k).i;
        Context context = ((w31.i) k).h;
        hVar.setElevation(iVar.getResources().getDimensionPixelSize(2131166291));
        hVar.setTranslationZ(iVar.getResources().getDimensionPixelSize(2131165314));
        View findViewById2 = hVar.findViewById(2131363333);
        if (findViewById2 instanceof TextView) {
            TextView textView = (TextView) findViewById2;
            textView.setMaxLines(5);
            textView.setTextSize(0, iVar.getResources().getDimension(2131165278));
            textView.setTypeface(q4.l.a(context, 2131296256));
            textView.setTextColor(viewGroup.getContext().getColor(2131100979));
        }
        if (bVar != null) {
            int i2 = bVar.a;
            View.OnClickListener onClickListener = bVar.b;
            CharSequence text = context.getText(i2);
            Button actionView = hVar.getChildAt(0).getActionView();
            if (TextUtils.isEmpty(text)) {
                actionView.setVisibility(8);
                actionView.setOnClickListener(null);
                k.D = false;
            } else {
                k.D = true;
                actionView.setVisibility(0);
                actionView.setText(text);
                actionView.setOnClickListener(new w31.k(0, k, onClickListener));
            }
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            hVar.setBackgroundTintList(ColorStateList.valueOf(iVar.getColor(2131100991)));
            hVar.getChildAt(0).getActionView().setTextColor(-1);
            hVar.getChildAt(0).getMessageView().setTextColor(-1);
        } else if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (view != null) {
            w31.g gVar = ((w31.i) k).m;
            if (gVar != null) {
                gVar.a();
            }
            w31.g gVar2 = new w31.g(k, view);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(gVar2);
            }
            view.addOnAttachStateChangeListener(gVar2);
            ((w31.i) k).m = gVar2;
        }
        k.h();
        return true;
    }

    public static void b(com.github.rudroid.activities.h0 h0Var, ViewGroup viewGroup, k.i iVar, int i) {
        boolean z = h0Var.b;
        int i2 = z ? -1 : 0;
        if ((i & 8) != 0) {
            viewGroup = null;
        }
        c(iVar, h0Var.a, i2, viewGroup, z ? a.r : a.s);
    }

    public static /* synthetic */ boolean c(k.i iVar, String str, int i, ViewGroup viewGroup, a aVar) {
        return a(iVar, str, i, null, viewGroup, aVar, null);
    }
}
