package com.github.rudroid.settings.preferences;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import e7.v;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class InformationPreference extends Preference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationPreference(Context context) {
        this(context, null);
        k.g(context, "context");
    }

    public final void n(v vVar) {
        super.n(vVar);
        View y = vVar.y(R.id.summary);
        TextView textView = y instanceof TextView ? (TextView) y : null;
        if (textView != null) {
            textView.setTextAppearance(2132017494);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969661);
        k.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        k.g(context, "context");
    }
}
