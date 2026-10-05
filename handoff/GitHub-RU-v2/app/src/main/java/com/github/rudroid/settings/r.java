package com.github.rudroid.settings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.Preference;
import com.github.developersettings.DeveloperSettingsActivity;
import com.github.rudroid.activities.WebViewActivity;
import com.github.rudroid.repository.issues.RepositoryIssuesActivity;
import com.github.rudroid.settings.copilot.debug.CopilotPermissionsOverrideActivity;
import com.github.rudroid.settings.copilot.paywall.j;
import com.github.rudroid.settings.featurepreview.SettingsFeaturePreviewActivity;
import com.github.rudroid.settings.privacy.PrivacyAnalyticsActivity;
import com.github.rudroid.support.SupportBottomSheetDialog;
import com.github.testingsettings.TestingSettingsActivity;
import java.util.ArrayList;
import yz0.d5;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class r implements h.b, e7.k, androidx.fragment.app.f1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ SettingsFragment s;

    public /* synthetic */ r(SettingsFragment settingsFragment, int i) {
        this.r = i;
        this.s = settingsFragment;
    }

    public void d(Object obj) {
        j.b bVar = (j.b) obj;
        k71.k.g(bVar, "result");
        boolean z = bVar.a;
        SettingsFragment settingsFragment = this.s;
        if (z) {
            settingsFragment.F4().P();
        }
        t2 F4 = settingsFragment.F4();
        v71.b0.z(F4.y, (a71.h) null, (v71.a0) null, new a3(F4, null), 3);
    }

    public void e(String str, Bundle bundle) {
        switch (this.r) {
            case 7:
                SettingsFragment.A4(this.s, str, bundle);
                break;
            default:
                SettingsFragment.B4(this.s, str, bundle);
                break;
        }
    }

    public void t(Preference preference) {
        switch (this.r) {
            case 1:
                SettingsFragment settingsFragment = this.s;
                if (!xb.a.a(settingsFragment.J2().d().b)) {
                    new SupportBottomSheetDialog().z4(settingsFragment.A3(), (String) null);
                    return;
                }
                com.github.rudroid.w wVar = settingsFragment.G0;
                if (wVar == null) {
                    k71.k.m("deepLinkRouter");
                    throw null;
                }
                Context i4 = settingsFragment.i4();
                String C3 = settingsFragment.C3(2131953474);
                k71.k.f(C3, "getString(...)");
                com.github.rudroid.w.c(wVar, i4, Uri.parse(C3), false, settingsFragment.J2().d().c, false, (String) null, (com.github.rudroid.activities.a0) null, 236);
                return;
            case 2:
                SettingsFragment settingsFragment2 = this.s;
                settingsFragment2.E(new Intent((Context) settingsFragment2.w3(), (Class<?>) PrivacyAnalyticsActivity.class), (Bundle) null);
                return;
            case 3:
                SettingsFragment settingsFragment3 = this.s;
                settingsFragment3.h(new Intent((Context) settingsFragment3.w3(), (Class<?>) DeveloperSettingsActivity.class), (Bundle) null);
                return;
            case 4:
                SettingsFragment settingsFragment4 = this.s;
                settingsFragment4.h(new Intent((Context) settingsFragment4.w3(), (Class<?>) TestingSettingsActivity.class), (Bundle) null);
                return;
            case 5:
                CopilotPermissionsOverrideActivity.a aVar = CopilotPermissionsOverrideActivity.Companion;
                SettingsFragment settingsFragment5 = this.s;
                Context i42 = settingsFragment5.i4();
                aVar.getClass();
                settingsFragment5.h(new Intent(i42, (Class<?>) CopilotPermissionsOverrideActivity.class), (Bundle) null);
                return;
            case 6:
                SettingsFragment settingsFragment6 = this.s;
                settingsFragment6.E(new Intent((Context) settingsFragment6.w3(), (Class<?>) SettingsFeaturePreviewActivity.class), (Bundle) null);
                return;
            case 7:
            case 8:
            default:
                this.s.g4();
                return;
            case 9:
                SettingsFragment settingsFragment7 = this.s;
                d5 d5Var = settingsFragment7.O0;
                if (k71.k.b(settingsFragment7.F4().F.d(), Boolean.TRUE)) {
                    RepositoryIssuesActivity.a aVar2 = RepositoryIssuesActivity.Companion;
                    Context i43 = settingsFragment7.i4();
                    ArrayList arrayList = new ArrayList();
                    aVar2.getClass();
                    settingsFragment7.E(RepositoryIssuesActivity.a.a(i43, "github", "mobile-android", arrayList), (Bundle) null);
                    return;
                }
                if (!settingsFragment7.J2().d().o || d5Var == null) {
                    com.github.rudroid.w wVar2 = settingsFragment7.G0;
                    if (wVar2 == null) {
                        k71.k.m("deepLinkRouter");
                        throw null;
                    }
                    Context i44 = settingsFragment7.i4();
                    String C32 = settingsFragment7.C3(2131953247);
                    k71.k.f(C32, "getString(...)");
                    com.github.rudroid.w.c(wVar2, i44, Uri.parse(C32), false, settingsFragment7.J2().d().c, false, (String) null, (com.github.rudroid.activities.a0) null, 236);
                    return;
                }
                String str = d5Var.b;
                if (!d5Var.a) {
                    WebViewActivity.a aVar3 = WebViewActivity.Companion;
                    Context i45 = settingsFragment7.i4();
                    String C33 = settingsFragment7.C3(2131954554);
                    aVar3.getClass();
                    settingsFragment7.E(WebViewActivity.a.a(i45, str, C33), (Bundle) null);
                    return;
                }
                Context i46 = settingsFragment7.i4();
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                intent.putExtra("android.intent.extra.TEXT", a0.s0.k("\n\nAdditional info:\nVersion: GitHub for Android v1.257.0\nDevice: ", Build.MANUFACTURER, " ", Build.MODEL));
                i46.startActivity(Intent.createChooser(intent, i46.getString(2131954592)));
                return;
            case 10:
                SettingsFragment settingsFragment8 = this.s;
                settingsFragment8.E(new Intent((Context) settingsFragment8.w3(), (Class<?>) SettingsNotificationsActivity.class), (Bundle) null);
                return;
        }
    }

}
