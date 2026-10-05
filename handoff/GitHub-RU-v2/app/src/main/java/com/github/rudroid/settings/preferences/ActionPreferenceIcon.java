package com.github.rudroid.settings.preferences;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.lazy.layout.s0;
import androidx.preference.Preference;
import e7.v;
import k71.k;
import k71.m;
import k71.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ActionPreferenceIcon extends Preference {
    public static final /* synthetic */ r71.e[] g0;
    public final a f0;

    public static final class a extends s0 {
        public a() {
            super(7, (Object) null);
        }

        public final void i(r71.e eVar, Object obj, Object obj2) {
            k.g(eVar, "property");
            r71.e[] eVarArr = ActionPreferenceIcon.g0;
            ActionPreferenceIcon.this.j();
        }
    }

    static {
        r71.e mVar = new m(ActionPreferenceIcon.class, "summaryColor", "getSummaryColor()Ljava/lang/Integer;", 0);
        x.a.getClass();
        g0 = new r71.e[]{mVar};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionPreferenceIcon(Context context) {
        this(context, null);
        k.g(context, "context");
    }

    public final void n(v vVar) {
        int i;
        super.n(vVar);
        Integer num = (Integer) this.f0.t(this, g0[0]);
        Context context = ((Preference) this).r;
        if (num != null) {
            i = context.getColor(num.intValue());
        } else {
            k.f(context, "getContext(...)");
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            k.f(theme, "getTheme(...)");
            theme.resolveAttribute(R.attr.textColorSecondary, typedValue, true);
            i = typedValue.data;
        }
        View y = vVar.y(R.id.summary);
        TextView textView = y instanceof TextView ? (TextView) y : null;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionPreferenceIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969661);
        k.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionPreferenceIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        k.g(context, "context");
        this.f0 = new a();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s0<T1,T2,T3,T4> {
        public s0() {
        }
    }
}
