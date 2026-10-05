package com.github.rudroid.settings.featurepreview;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.lazy.layout.q1;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import com.github.rudroid.settings.ToolBarPreferenceFragmentCompat;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SettingsFeaturePreviewFragment extends Hilt_SettingsFeaturePreviewFragment {
    public static final a Companion = new a();
    public com.github.rudroid.settings.featurepreview.a G0;

    public static final class a {
    }

    @Override // com.github.rudroid.settings.ToolBarPreferenceFragmentCompat
    public final void c4(View view, Bundle bundle) {
        Preference t4;
        PreferenceCategory t42;
        k.g(view, "view");
        super.c4(view, bundle);
        ToolBarPreferenceFragmentCompat.w4(this, C3(2131954555));
        fi.c cVar = fi.d.Companion;
        Context i4 = i4();
        cVar.getClass();
        if (fi.c.b(i4).getLong("staff_banner_last_shown", 0L) == 0) {
            Preference t43 = t4("switch_display_staff_banner");
            if (t43 != null && (t42 = t4("feature_feature_preview_category")) != null) {
                t42.K(t43);
            }
        } else {
            c cVar2 = c.r;
            SwitchPreferenceCompat t44 = t4("switch_display_staff_banner");
            if (t44 != null) {
                com.github.rudroid.settings.featurepreview.a aVar = this.G0;
                if (aVar == null) {
                    k.m("featurePreviewFlagProvider");
                    throw null;
                }
                t44.H(aVar.a(cVar2));
                ((Preference) t44).v = new q1(5, this, cVar2);
            }
        }
        PreferenceCategory t45 = t4("feature_feature_preview_category");
        if ((t45 != null ? ((PreferenceGroup) t45).h0.size() : 0) != 1 || (t4 = t4("feature_preview_disclaimer")) == null) {
            return;
        }
        t4.D(true);
    }

    public final void u4() {
        s4(2132148239);
    }
}
