package com.github.rudroid.settings.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.lifecycle.d1;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.github.rudroid.activities.WebViewActivity;
import v71.a0;
import v71.b0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d implements e7.j, e7.k {
    public final /* synthetic */ SettingsPrivacyAnalyticsFragment r;
    public final /* synthetic */ Preference s;

    public /* synthetic */ d(SwitchPreferenceCompat switchPreferenceCompat, SettingsPrivacyAnalyticsFragment settingsPrivacyAnalyticsFragment) {
        this.s = switchPreferenceCompat;
        this.r = settingsPrivacyAnalyticsFragment;
    }

    public void h(Preference preference, Object obj) {
        SwitchPreferenceCompat switchPreferenceCompat = this.s;
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            fi.a aVar = fi.b.Companion;
            Context context = ((Preference) switchPreferenceCompat).r;
            k71.k.f(context, "getContext(...)");
            aVar.getClass();
            SharedPreferences.Editor edit = fi.a.g(context).edit();
            edit.putBoolean("key_analytics_enabled", booleanValue);
            edit.apply();
            if (booleanValue) {
                return;
            }
            h hVar = (h) this.r.H0.getValue();
            b0.z(d1.k(hVar), (a71.h) null, (a0) null, new g(hVar, null), 3);
        }
    }

    public void t(Preference preference) {
        WebViewActivity.a aVar = WebViewActivity.Companion;
        Context context = this.s.r;
        k71.k.f(context, "getContext(...)");
        SettingsPrivacyAnalyticsFragment settingsPrivacyAnalyticsFragment = this.r;
        String C3 = settingsPrivacyAnalyticsFragment.C3(2131953438);
        k71.k.f(C3, "getString(...)");
        String C32 = settingsPrivacyAnalyticsFragment.C3(2131953437);
        aVar.getClass();
        settingsPrivacyAnalyticsFragment.E(WebViewActivity.a.a(context, C3, C32), (Bundle) null);
    }

    public /* synthetic */ d(SettingsPrivacyAnalyticsFragment settingsPrivacyAnalyticsFragment, Preference preference) {
        this.r = settingsPrivacyAnalyticsFragment;
        this.s = preference;
    }





}
