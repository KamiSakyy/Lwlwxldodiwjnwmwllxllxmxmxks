package com.github.rudroid.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import e7.v;
import k71.k;
import k71.m;
import k71.x;
import t71.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class TrailingMetadataPreference extends Preference {
    public static final /* synthetic */ r71.e[] g0;
    public final i f0;

    static {
        r71.e mVar = new m(TrailingMetadataPreference.class, "metadata", "getMetadata()Ljava/lang/String;", 0);
        x.a.getClass();
        g0 = new r71.e[]{mVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrailingMetadataPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969661, 0);
        k.g(context, "context");
        this.f0 = new i(this);
    }

    public final void n(v vVar) {
        super.n(vVar);
        View y = vVar.y(2131363032);
        TextView textView = y instanceof TextView ? (TextView) y : null;
        if (textView != null) {
            r71.e[] eVarArr = g0;
            r71.e eVar = eVarArr[0];
            i iVar = this.f0;
            String str = (String) iVar.t(this, eVar);
            textView.setVisibility((str == null || p.T(str)) ? 8 : 0);
            textView.setText((String) iVar.t(this, eVarArr[0]));
        }
    }
    public Object j() { return null; }
}
