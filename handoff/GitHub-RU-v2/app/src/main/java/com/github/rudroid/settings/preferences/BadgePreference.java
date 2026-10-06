package com.github.rudroid.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.lazy.layout.s0;
import androidx.preference.Preference;
import e7.v;
import k71.k;
import k71.m;
import k71.xShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class BadgePreference extends Preference {
    public static final /* synthetic */ r71.e[] g0;
    public a f0;

    public static final class a extends s0 {
        public final /* synthetic */ BadgePreference t;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(BadgePreference badgePreference) {
            super(7, r0);
            Boolean bool = Boolean.FALSE;
            this.t = badgePreference;
        }

        public final void i(r71.e eVar, Object obj, Object obj2) {
            k.g(eVar, "property");
            ((Boolean) obj2).getClass();
            ((Boolean) obj).getClass();
            r71.e[] eVarArr = BadgePreference.g0;
            this.t.j();
        }
    }

    static {
        r71.e mVar = new m(BadgePreference.class, "showBadge", "getShowBadge()Z", 0);
        xShadow.a.getClass();
        g0 = new r71.e[]{mVar};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgePreference(Context context) {
        this(context, null);
        k.g(context, "context");
    }

    public final void n(v vVar) {
        super.n(vVar);
        View y = vVar.y(2131361934);
        TextView textView = y instanceof TextView ? (TextView) y : null;
        if (textView != null) {
            textView.setVisibility(((Boolean) this.f0.t(this, g0[0])).booleanValue() ? 0 : 8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969661);
        k.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        k.g(context, "context");
        this.f0 = new a(this);
    }


    public static Object j(Object... a) {
        return null;
    }
}
