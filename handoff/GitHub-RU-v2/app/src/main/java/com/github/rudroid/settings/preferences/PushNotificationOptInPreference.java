package com.github.rudroid.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.preference.Preference;
import e7.v;
import k71.k;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class PushNotificationOptInPreference extends Preference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PushNotificationOptInPreference(Context context) {
        this(context, null);
        k.g(context, "context");
    }

    public final void n(v vVar) {
        View view = ((n1) vVar).a;
        super.n(vVar);
        if (vVar.y(2131362160) == null) {
            LayoutInflater from = LayoutInflater.from(((Preference) this).r);
            k.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            from.inflate(2131559364, (ViewGroup) view, true);
            ComposeView findViewById = view.findViewById(2131362160);
            k.f(findViewById, "findViewById(...)");
            findViewById.setContent(new r1.d(new e(this, 0), true, 1112463524));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PushNotificationOptInPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969661);
        k.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationOptInPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        k.g(context, "context");
    }
}
