package com.github.rudroid.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.github.rudroid.activities.WebViewActivity;
import com.github.rudroid.settings.applock.settings.AppLockSettingsActivity;
import com.github.rudroid.settings.codeoptions.CodeOptionsActivity;
import com.github.rudroid.settings.featurepreview.SettingsFeaturePreviewFragment;
import com.github.rudroid.settings.preferences.SingleChoiceBottomSheet;
import com.github.rudroid.settings.preferences.StyledPreferenceCategory;
import com.github.rudroid.settings.preferences.TrailingMetadataPreference;
import com.github.rudroid.settings.y;
import java.util.ArrayList;
import java.util.List;
import yz0.d5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SettingsFragment extends Hilt_SettingsFragment implements com.github.rudroid.fragments.util.f {
    public static final a Companion = new a();
    public com.github.rudroid.w G0;
    public com.github.rudroid.settings.preferences.b H0;
    public com.github.rudroid.activities.util.c I0;
    public oa.m J0;
    public com.github.rudroid.utilities.e K0;
    public final androidx.lifecycle.l1 L0;
    public final androidx.lifecycle.l1 M0;
    public k.g N0;
    public d5 O0;
    public androidx.fragment.app.t P0;

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return SettingsFragment.this.g4().K0();
        }
    }

    public static final class c extends k71.l implements j71.a {
        public c() {
            super(0);
        }

        public final Object a() {
            return SettingsFragment.this.g4().g0();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public d() {
            super(0);
        }

        public final Object a() {
            return SettingsFragment.this.g4().f0();
        }
    }

    public static final class e extends k71.l implements j71.a {
        public e() {
            super(0);
        }

        public final Object a() {
            return SettingsFragment.this;
        }
    }

    public static final class f extends k71.l implements j71.a {
        public final /* synthetic */ e s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.s = eVar;
        }

        public final Object a() {
            return (androidx.lifecycle.u1) this.s.a();
        }
    }

    public static final class g extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((androidx.lifecycle.u1) this.s.getValue()).K0();
        }
    }

    public static final class h extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.r rVar = (androidx.lifecycle.u1) this.s.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return rVar2 != null ? rVar2.g0() : t6.a.b;
        }
    }

    public static final class i extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.o1 f0;
            androidx.lifecycle.r rVar = (androidx.lifecycle.u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SettingsFragment.this.f0() : f0;
        }
    }

    public SettingsFragment() {
        w61.h s = sy.w.s(w61.i.s, new f(new e()));
        this.L0 = new androidx.lifecycle.l1(k71.x.a(t2.class), new g(s), new i(s), new h(s));
        this.M0 = new androidx.lifecycle.l1(k71.x.a(com.github.rudroid.support.s.class), new b(), new d(), new c());
    }

    public static void A4(SettingsFragment settingsFragment, String str, Bundle bundle) {
        Parcelable parcelable;
        k.z F;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = (Parcelable) bundle.getParcelable("key_result_item", SingleChoiceBottomSheet.b.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("key_result_item");
            if (!(parcelable2 instanceof SingleChoiceBottomSheet.b)) {
                parcelable2 = null;
            }
            parcelable = (SingleChoiceBottomSheet.b) parcelable2;
        }
        SingleChoiceBottomSheet.b bVar = (SingleChoiceBottomSheet.b) parcelable;
        Preference t4 = settingsFragment.t4("key_dark_mode");
        fi.a aVar = fi.b.Companion;
        Context i4 = settingsFragment.i4();
        aVar.getClass();
        int a2 = fi.a.a(i4);
        if (t4 == null || bVar == null) {
            return;
        }
        String str2 = bVar.r;
        if (Integer.parseInt(str2) != a2) {
            int parseInt = Integer.parseInt(str2);
            fi.a.g(settingsFragment.i4()).edit().putString("key_dark_mode", parseInt != 1 ? parseInt != 2 ? "follow_system" : "dark" : "light").apply();
            k.n.o(parseInt);
            k.i w3 = settingsFragment.w3();
            k.i iVar = w3 != null ? w3 : null;
            if (iVar != null && (F = iVar.F()) != null) {
                F.s(true, true);
            }
            t4.B(bVar.s);
            t4.w = new s(settingsFragment, bVar, 1);
        }
    }

    public static void B4(SettingsFragment settingsFragment, String str, Bundle bundle) {
        Parcelable parcelable;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = (Parcelable) bundle.getParcelable("key_result_item", SingleChoiceBottomSheet.b.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("key_result_item");
            if (!(parcelable2 instanceof SingleChoiceBottomSheet.b)) {
                parcelable2 = null;
            }
            parcelable = (SingleChoiceBottomSheet.b) parcelable2;
        }
        SingleChoiceBottomSheet.b bVar = (SingleChoiceBottomSheet.b) parcelable;
        Preference t4 = settingsFragment.t4("key_language");
        if (settingsFragment.H0 == null) {
            k71.k.m("languagePreferenceMapper");
            throw null;
        }
        String a2 = com.github.rudroid.settings.preferences.b.a(settingsFragment.i4());
        if (t4 == null || bVar == null) {
            return;
        }
        String str2 = bVar.r;
        if (a2.equals(str2)) {
            return;
        }
        w4.c a3 = w4.c.a(str2);
        k71.k.f(a3, "forLanguageTags(...)");
        k.n.k(a3);
        fi.a aVar = fi.b.Companion;
        Context i4 = settingsFragment.i4();
        aVar.getClass();
        k71.k.g(str2, "languageCode");
        SharedPreferences.Editor edit = fi.a.g(i4).edit();
        edit.putString("key_language", str2);
        edit.apply();
        t4.B(bVar.s);
        t4.w = new s(settingsFragment, bVar, 0);
    }

    /* renamed from: C4, reason: merged with bridge method [inline-methods] */
    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.I0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public final ArrayList D4() {
        String[] stringArray = B3().getStringArray(2130903065);
        k71.k.f(stringArray, "getStringArray(...)");
        ArrayList arrayList = new ArrayList(stringArray.length);
        int length = stringArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = stringArray[i2];
            int i4 = i3 + 1;
            k71.k.d(str);
            String[] stringArray2 = B3().getStringArray(2130903064);
            k71.k.f(stringArray2, "getStringArray(...)");
            String str2 = stringArray2[i3];
            k71.k.f(str2, "get(...)");
            arrayList.add(new SingleChoiceBottomSheet.b(str2, str));
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    public final ArrayList E4() {
        List r = x61.l.r(new String[]{C3(2131954607), C3(2131954605), C3(2131954606)});
        ArrayList arrayList = new ArrayList(x61.n.F(r, 10));
        int i2 = 0;
        for (Object obj : r) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                sy.d0.x();
                throw null;
            }
            String str = (String) obj;
            k71.k.d(str);
            arrayList.add(new SingleChoiceBottomSheet.b(String.valueOf(((Number) x61.l.r(new Integer[]{1, 2, -1}).get(i2)).intValue()), str));
            i2 = i3;
        }
        return arrayList;
    }

    public final t2 F4() {
        return (t2) this.L0.getValue();
    }

    public final void S3() {
        k.g gVar = this.N0;
        if (gVar != null) {
            gVar.dismiss();
        }
        ((androidx.fragment.app.a0) this).Y = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (C4().d().f(com.github.rudroid.common.a.w) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y3() {
        boolean z = true;
        ((androidx.fragment.app.a0) this).Y = true;
        float f2 = com.github.rudroid.utilities.g.a;
        if (!com.github.rudroid.utilities.g.a(i4()) && Build.VERSION.SDK_INT >= 33) {
            androidx.fragment.app.e0 e0Var = ((androidx.fragment.app.a0) this).N;
            if (!(e0Var != null ? n4.b.e(e0Var.v) : false)) {
            }
        }
        z = false;
        Preference I = ((PreferenceScreen) ((PreferenceFragmentCompat) this).u0.g).I("key_configure_notifications");
        if (I != null) {
            I.B(z ? C3(2131954579) : null);
        }
    }

    @Override // com.github.rudroid.settings.ToolBarPreferenceFragmentCompat
    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        super.c4(view, bundle);
        ToolBarPreferenceFragmentCompat.w4(this, C3(2131954558));
        final int i2 = 0;
        F4().E.e(F3(), new y.a(new j71.c(this) { // from class: com.github.rudroid.settings.u
            public final /* synthetic */ SettingsFragment s;

            {
                this.s = this;
            }

            public final Object k(Object obj) {
                switch (i2) {
                    case 0:
                        SettingsFragment settingsFragment = this.s;
                        settingsFragment.O0 = (d5) obj;
                        Preference I = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment).u0.g).I("key_share_feedback");
                        if (I != null) {
                            I.w(true);
                        }
                        break;
                    default:
                        SettingsFragment settingsFragment2 = this.s;
                        Preference I2 = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment2).u0.g).I("key_push_notifications");
                        if (I2 != null) {
                            I2.D(settingsFragment2.J2().d().f(com.github.rudroid.common.a.w));
                        }
                        Preference I3 = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment2).u0.g).I("key_push_enterprise_disclaimer");
                        boolean z = false;
                        if (I3 != null) {
                            I3.D(false);
                        }
                        Preference I4 = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment2).u0.g).I("key_share_feedback");
                        if (I4 != null) {
                            I4.w(!settingsFragment2.J2().d().o);
                        }
                        Preference I5 = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment2).u0.g).I("key_feature_preview");
                        if (I5 != null) {
                            SettingsFeaturePreviewFragment.a aVar = SettingsFeaturePreviewFragment.Companion;
                            Context i4 = settingsFragment2.i4();
                            oa.j d2 = settingsFragment2.J2().d();
                            aVar.getClass();
                            if (!d2.o) {
                                fi.d.Companion.getClass();
                                if (fi.c.b(i4).getLong("staff_banner_last_shown", 0L) != 0) {
                                    z = true;
                                }
                            }
                            I5.D(z);
                        }
                        break;
                }
                return w61.a0.a;
            }
        }));
        final int i3 = 1;
        F4().D.e(F3(), new y.a(new j71.c(this) { // from class: com.github.rudroid.settings.u
            public final /* synthetic */ SettingsFragment s;

            {
                this.s = this;
            }

            public final Object k(Object obj) {
                switch (i3) {
                    case 0:
                        SettingsFragment settingsFragment = this.s;
                        settingsFragment.O0 = (d5) obj;
                        Preference I = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment).u0.g).I("key_share_feedback");
                        if (I != null) {
                            I.w(true);
                        }
                        break;
                    default:
                        SettingsFragment settingsFragment2 = this.s;
                        Preference I2 = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment2).u0.g).I("key_push_notifications");
                        if (I2 != null) {
                            I2.D(settingsFragment2.J2().d().f(com.github.rudroid.common.a.w));
                        }
                        Preference I3 = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment2).u0.g).I("key_push_enterprise_disclaimer");
                        boolean z = false;
                        if (I3 != null) {
                            I3.D(false);
                        }
                        Preference I4 = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment2).u0.g).I("key_share_feedback");
                        if (I4 != null) {
                            I4.w(!settingsFragment2.J2().d().o);
                        }
                        Preference I5 = ((PreferenceScreen) ((PreferenceFragmentCompat) settingsFragment2).u0.g).I("key_feature_preview");
                        if (I5 != null) {
                            SettingsFeaturePreviewFragment.a aVar = SettingsFeaturePreviewFragment.Companion;
                            Context i4 = settingsFragment2.i4();
                            oa.j d2 = settingsFragment2.J2().d();
                            aVar.getClass();
                            if (!d2.o) {
                                fi.d.Companion.getClass();
                                if (fi.c.b(i4).getLong("staff_banner_last_shown", 0L) != 0) {
                                    z = true;
                                }
                            }
                            I5.D(z);
                        }
                        break;
                }
                return w61.a0.a;
            }
        }));
        com.github.rudroid.utilities.w0.a(((com.github.rudroid.support.s) this.M0.getValue()).v, F3(), androidx.lifecycle.w.u, new v(this, null));
        com.github.rudroid.utilities.w0.a(F4().H, F3(), androidx.lifecycle.w.u, new w(this, null));
        x3().i0("key_single_choice_dialog_theme", F3(), new r(this, 7));
        x3().i0("key_single_choice_dialog_language", F3(), new r(this, 8));
        Preference I = ((PreferenceScreen) ((PreferenceFragmentCompat) this).u0.g).I("key_share_feedback");
        if (I != null) {
            I.w(false);
        }
        Preference I2 = ((PreferenceScreen) ((PreferenceFragmentCompat) this).u0.g).I("key_share_feedback");
        if (I2 != null) {
            I2.w = new r(this, 9);
        }
        this.P0 = f4(new r(this, 0), new com.github.rudroid.settings.copilot.paywall.j(J2()));
    }

    public final void u4() {
        Object obj;
        String str;
        String str2;
        e7.t tVar = ((PreferenceFragmentCompat) this).u0;
        tVar.getClass();
        tVar.f = "settings_preferences";
        tVar.d = null;
        e7.t tVar2 = ((PreferenceFragmentCompat) this).u0;
        Context i4 = i4();
        tVar2.getClass();
        PreferenceScreen preferenceScreen = new PreferenceScreen(i4, (AttributeSet) null);
        preferenceScreen.m(tVar2);
        StyledPreferenceCategory styledPreferenceCategory = new StyledPreferenceCategory(i4());
        styledPreferenceCategory.z("key_notifications");
        styledPreferenceCategory.C(C3(2131954507));
        styledPreferenceCategory.y();
        Preference preference = new Preference(i4(), (AttributeSet) null);
        preference.z("key_configure_notifications");
        preference.C(C3(2131954566));
        preference.y();
        preference.w = new r(this, 10);
        preferenceScreen.H(styledPreferenceCategory);
        styledPreferenceCategory.H(preference);
        PreferenceCategory preferenceCategory = new PreferenceCategory(i4(), (AttributeSet) null);
        ((Preference) preferenceCategory).W = 2131559950;
        preferenceScreen.H(preferenceCategory);
        StyledPreferenceCategory styledPreferenceCategory2 = new StyledPreferenceCategory(i4());
        styledPreferenceCategory2.C(C3(2131954505));
        styledPreferenceCategory2.y();
        Preference preference2 = new Preference(i4(), (AttributeSet) null);
        fi.a aVar = fi.b.Companion;
        Context context = preference2.r;
        k71.k.f(context, "getContext(...)");
        aVar.getClass();
        int a2 = fi.a.a(context);
        preference2.z("key_dark_mode");
        preference2.L = "follow_system";
        preference2.C(C3(2131954608));
        ArrayList E4 = E4();
        int size = E4.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = E4.get(i2);
            i2++;
            if (Integer.parseInt(((SingleChoiceBottomSheet.b) obj).r) == a2) {
                break;
            }
        }
        SingleChoiceBottomSheet.b bVar = (SingleChoiceBottomSheet.b) obj;
        if (bVar == null || (str = bVar.s) == null) {
            str = "";
        }
        preference2.B(str);
        preference2.y();
        preference2.w = new o(a2, this);
        final Preference preference3 = new Preference(i4(), (AttributeSet) null);
        preference3.C(C3(2131954517));
        preference3.A();
        preference3.y();
        final int i3 = 3;
        preference3.w = new e7.k(this) { // from class: com.github.rudroid.settings.p
            public final /* synthetic */ SettingsFragment s;

            {
                this.s = this;
            }

            public final void t(Preference preference4) {
                switch (i3) {
                    case 0:
                        WebViewActivity.a aVar2 = WebViewActivity.Companion;
                        Context context2 = preference3.r;
                        k71.k.f(context2, "getContext(...)");
                        SettingsFragment settingsFragment = this.s;
                        String C3 = settingsFragment.C3(2131954765);
                        k71.k.f(C3, "getString(...)");
                        String C32 = settingsFragment.C3(2131954603);
                        aVar2.getClass();
                        settingsFragment.E(WebViewActivity.a.a(context2, C3, C32), (Bundle) null);
                        break;
                    case 1:
                        WebViewActivity.a aVar3 = WebViewActivity.Companion;
                        Context context3 = preference3.r;
                        k71.k.f(context3, "getContext(...)");
                        SettingsFragment settingsFragment2 = this.s;
                        String C33 = settingsFragment2.C3(2131954582);
                        aVar3.getClass();
                        settingsFragment2.E(WebViewActivity.a.a(context3, "file:///android_asset/open_source_licenses.html", C33), (Bundle) null);
                        break;
                    case 2:
                        b21.v vVar = new b21.v(preference3.r);
                        k.d dVar = (k.d) vVar.t;
                        dVar.d = dVar.a.getText(2131954504);
                        SettingsFragment settingsFragment3 = this.s;
                        vVar.y(2131954504, new q(settingsFragment3, 0));
                        vVar.w(2131951840, (DialogInterface.OnClickListener) null);
                        settingsFragment3.N0 = vVar.A();
                        break;
                    case 3:
                        CodeOptionsActivity.a aVar4 = CodeOptionsActivity.Companion;
                        Context context4 = preference3.r;
                        k71.k.f(context4, "getContext(...)");
                        aVar4.getClass();
                        this.s.E(CodeOptionsActivity.a.a(context4), (Bundle) null);
                        break;
                    default:
                        AppLockSettingsActivity.a aVar5 = AppLockSettingsActivity.Companion;
                        Context context5 = preference3.r;
                        k71.k.f(context5, "getContext(...)");
                        aVar5.getClass();
                        this.s.E(new Intent(context5, (Class<?>) AppLockSettingsActivity.class), (Bundle) null);
                        break;
                }
            }
        };
        Preference preference4 = new Preference(i4(), (AttributeSet) null);
        preference4.z("key_language");
        if (this.H0 == null) {
            k71.k.m("languagePreferenceMapper");
            throw null;
        }
        Context context2 = preference4.r;
        k71.k.f(context2, "getContext(...)");
        String a3 = com.github.rudroid.settings.preferences.b.a(context2);
        String[] stringArray = B3().getStringArray(2130903065);
        k71.k.f(stringArray, "getStringArray(...)");
        String[] stringArray2 = B3().getStringArray(2130903064);
        k71.k.f(stringArray2, "getStringArray(...)");
        preference4.B(stringArray[x61.l.Q(stringArray2, a3)]);
        preference4.C(C3(2131954560));
        preference4.y();
        preference4.w = new androidx.compose.foundation.lazy.layout.q1(2, this, a3);
        TrailingMetadataPreference trailingMetadataPreference = new TrailingMetadataPreference(i4(), null);
        oa.m mVar = this.J0;
        if (mVar == null) {
            k71.k.m("userManager");
            throw null;
        }
        if (mVar.e().size() > 1) {
            oa.m mVar2 = this.J0;
            if (mVar2 == null) {
                k71.k.m("userManager");
                throw null;
            }
            str2 = String.valueOf(mVar2.e().size());
        } else {
            str2 = null;
        }
        trailingMetadataPreference.f0.y(str2, TrailingMetadataPreference.g0[0]);
        ((Preference) trailingMetadataPreference).W = 2131559960;
        trailingMetadataPreference.y();
        trailingMetadataPreference.C(C3(2131951653));
        ((Preference) trailingMetadataPreference).w = new androidx.compose.foundation.lazy.layout.q1(3, this, trailingMetadataPreference);
        final Preference preference5 = new Preference(i4(), (AttributeSet) null);
        preference5.C(C3(2131954503));
        preference5.A();
        preference5.y();
        final int i5 = 4;
        preference5.w = new e7.k(this) { // from class: com.github.rudroid.settings.p
            public final /* synthetic */ SettingsFragment s;

            {
                this.s = this;
            }

            public final void t(Preference preference42) {
                switch (i5) {
                    case 0:
                        WebViewActivity.a aVar2 = WebViewActivity.Companion;
                        Context context22 = preference5.r;
                        k71.k.f(context22, "getContext(...)");
                        SettingsFragment settingsFragment = this.s;
                        String C3 = settingsFragment.C3(2131954765);
                        k71.k.f(C3, "getString(...)");
                        String C32 = settingsFragment.C3(2131954603);
                        aVar2.getClass();
                        settingsFragment.E(WebViewActivity.a.a(context22, C3, C32), (Bundle) null);
                        break;
                    case 1:
                        WebViewActivity.a aVar3 = WebViewActivity.Companion;
                        Context context3 = preference5.r;
                        k71.k.f(context3, "getContext(...)");
                        SettingsFragment settingsFragment2 = this.s;
                        String C33 = settingsFragment2.C3(2131954582);
                        aVar3.getClass();
                        settingsFragment2.E(WebViewActivity.a.a(context3, "file:///android_asset/open_source_licenses.html", C33), (Bundle) null);
                        break;
                    case 2:
                        b21.v vVar = new b21.v(preference5.r);
                        k.d dVar = (k.d) vVar.t;
                        dVar.d = dVar.a.getText(2131954504);
                        SettingsFragment settingsFragment3 = this.s;
                        vVar.y(2131954504, new q(settingsFragment3, 0));
                        vVar.w(2131951840, (DialogInterface.OnClickListener) null);
                        settingsFragment3.N0 = vVar.A();
                        break;
                    case 3:
                        CodeOptionsActivity.a aVar4 = CodeOptionsActivity.Companion;
                        Context context4 = preference5.r;
                        k71.k.f(context4, "getContext(...)");
                        aVar4.getClass();
                        this.s.E(CodeOptionsActivity.a.a(context4), (Bundle) null);
                        break;
                    default:
                        AppLockSettingsActivity.a aVar5 = AppLockSettingsActivity.Companion;
                        Context context5 = preference5.r;
                        k71.k.f(context5, "getContext(...)");
                        aVar5.getClass();
                        this.s.E(new Intent(context5, (Class<?>) AppLockSettingsActivity.class), (Bundle) null);
                        break;
                }
            }
        };
        preferenceScreen.H(styledPreferenceCategory2);
        styledPreferenceCategory2.H(preference2);
        styledPreferenceCategory2.H(preference3);
        styledPreferenceCategory2.H(preference4);
        styledPreferenceCategory2.H(trailingMetadataPreference);
        styledPreferenceCategory2.H(preference5);
        PreferenceCategory preferenceCategory2 = new PreferenceCategory(i4(), (AttributeSet) null);
        ((Preference) preferenceCategory2).W = 2131559950;
        preferenceScreen.H(preferenceCategory2);
        StyledPreferenceCategory styledPreferenceCategory3 = new StyledPreferenceCategory(i4());
        styledPreferenceCategory3.z("key_category_subscriptions");
        styledPreferenceCategory3.C(C3(2131954510));
        styledPreferenceCategory3.y();
        styledPreferenceCategory3.D(false);
        TrailingMetadataPreference trailingMetadataPreference2 = new TrailingMetadataPreference(i4(), null);
        trailingMetadataPreference2.z("key_settings_copilot");
        trailingMetadataPreference2.C(C3(2131954551));
        trailingMetadataPreference2.A();
        trailingMetadataPreference2.y();
        preferenceScreen.H(styledPreferenceCategory3);
        styledPreferenceCategory3.H(trailingMetadataPreference2);
        PreferenceCategory preferenceCategory3 = new PreferenceCategory(i4(), (AttributeSet) null);
        preferenceCategory3.z("key_divider_subscriptions");
        ((Preference) preferenceCategory3).W = 2131559950;
        preferenceScreen.H(preferenceCategory3);
        StyledPreferenceCategory styledPreferenceCategory4 = new StyledPreferenceCategory(i4());
        styledPreferenceCategory4.y();
        styledPreferenceCategory4.C(C3(2131954506));
        Preference preference6 = new Preference(i4(), (AttributeSet) null);
        preference6.z("key_showcase");
        preference6.C(preference6.r.getString(2131954642));
        preference6.A();
        preference6.y();
        preference6.w = new r(this, 11);
        Preference preference7 = new Preference(i4(), (AttributeSet) null);
        preference7.z("key_share_feedback");
        preference7.C(C3(2131954592));
        preference7.A();
        preference7.y();
        preference7.w(false);
        Preference preference8 = new Preference(i4(), (AttributeSet) null);
        preference8.z("key_get_help");
        preference8.C(C3(2131954609));
        preference8.A();
        preference8.y();
        com.github.rudroid.support.h hVar = (com.github.rudroid.support.h) ((com.github.rudroid.utilities.ui.g1) ((com.github.rudroid.support.s) this.M0.getValue()).v.r.getValue()).getData();
        preference8.D(hVar != null && hVar.b);
        preference8.w = new r(this, 1);
        final Preference preference9 = new Preference(i4(), (AttributeSet) null);
        preference9.C(C3(2131954603));
        preference9.A();
        preference9.y();
        final int i6 = 0;
        preference9.w = new e7.k(this) { // from class: com.github.rudroid.settings.p
            public final /* synthetic */ SettingsFragment s;

            {
                this.s = this;
            }

            public final void t(Preference preference42) {
                switch (i6) {
                    case 0:
                        WebViewActivity.a aVar2 = WebViewActivity.Companion;
                        Context context22 = preference9.r;
                        k71.k.f(context22, "getContext(...)");
                        SettingsFragment settingsFragment = this.s;
                        String C3 = settingsFragment.C3(2131954765);
                        k71.k.f(C3, "getString(...)");
                        String C32 = settingsFragment.C3(2131954603);
                        aVar2.getClass();
                        settingsFragment.E(WebViewActivity.a.a(context22, C3, C32), (Bundle) null);
                        break;
                    case 1:
                        WebViewActivity.a aVar3 = WebViewActivity.Companion;
                        Context context3 = preference9.r;
                        k71.k.f(context3, "getContext(...)");
                        SettingsFragment settingsFragment2 = this.s;
                        String C33 = settingsFragment2.C3(2131954582);
                        aVar3.getClass();
                        settingsFragment2.E(WebViewActivity.a.a(context3, "file:///android_asset/open_source_licenses.html", C33), (Bundle) null);
                        break;
                    case 2:
                        b21.v vVar = new b21.v(preference9.r);
                        k.d dVar = (k.d) vVar.t;
                        dVar.d = dVar.a.getText(2131954504);
                        SettingsFragment settingsFragment3 = this.s;
                        vVar.y(2131954504, new q(settingsFragment3, 0));
                        vVar.w(2131951840, (DialogInterface.OnClickListener) null);
                        settingsFragment3.N0 = vVar.A();
                        break;
                    case 3:
                        CodeOptionsActivity.a aVar4 = CodeOptionsActivity.Companion;
                        Context context4 = preference9.r;
                        k71.k.f(context4, "getContext(...)");
                        aVar4.getClass();
                        this.s.E(CodeOptionsActivity.a.a(context4), (Bundle) null);
                        break;
                    default:
                        AppLockSettingsActivity.a aVar5 = AppLockSettingsActivity.Companion;
                        Context context5 = preference9.r;
                        k71.k.f(context5, "getContext(...)");
                        aVar5.getClass();
                        this.s.E(new Intent(context5, (Class<?>) AppLockSettingsActivity.class), (Bundle) null);
                        break;
                }
            }
        };
        Preference preference10 = new Preference(i4(), (AttributeSet) null);
        preference10.z("key_privacy_analytics");
        preference10.D(true);
        preference10.C(C3(2131954583));
        preference10.A();
        preference10.y();
        preference10.w = new r(this, 2);
        final Preference preference11 = new Preference(i4(), (AttributeSet) null);
        preference11.C(C3(2131954582));
        preference11.A();
        preference11.y();
        final int i7 = 1;
        preference11.w = new e7.k(this) { // from class: com.github.rudroid.settings.p
            public final /* synthetic */ SettingsFragment s;

            {
                this.s = this;
            }

            public final void t(Preference preference42) {
                switch (i7) {
                    case 0:
                        WebViewActivity.a aVar2 = WebViewActivity.Companion;
                        Context context22 = preference11.r;
                        k71.k.f(context22, "getContext(...)");
                        SettingsFragment settingsFragment = this.s;
                        String C3 = settingsFragment.C3(2131954765);
                        k71.k.f(C3, "getString(...)");
                        String C32 = settingsFragment.C3(2131954603);
                        aVar2.getClass();
                        settingsFragment.E(WebViewActivity.a.a(context22, C3, C32), (Bundle) null);
                        break;
                    case 1:
                        WebViewActivity.a aVar3 = WebViewActivity.Companion;
                        Context context3 = preference11.r;
                        k71.k.f(context3, "getContext(...)");
                        SettingsFragment settingsFragment2 = this.s;
                        String C33 = settingsFragment2.C3(2131954582);
                        aVar3.getClass();
                        settingsFragment2.E(WebViewActivity.a.a(context3, "file:///android_asset/open_source_licenses.html", C33), (Bundle) null);
                        break;
                    case 2:
                        b21.v vVar = new b21.v(preference11.r);
                        k.d dVar = (k.d) vVar.t;
                        dVar.d = dVar.a.getText(2131954504);
                        SettingsFragment settingsFragment3 = this.s;
                        vVar.y(2131954504, new q(settingsFragment3, 0));
                        vVar.w(2131951840, (DialogInterface.OnClickListener) null);
                        settingsFragment3.N0 = vVar.A();
                        break;
                    case 3:
                        CodeOptionsActivity.a aVar4 = CodeOptionsActivity.Companion;
                        Context context4 = preference11.r;
                        k71.k.f(context4, "getContext(...)");
                        aVar4.getClass();
                        this.s.E(CodeOptionsActivity.a.a(context4), (Bundle) null);
                        break;
                    default:
                        AppLockSettingsActivity.a aVar5 = AppLockSettingsActivity.Companion;
                        Context context5 = preference11.r;
                        k71.k.f(context5, "getContext(...)");
                        aVar5.getClass();
                        this.s.E(new Intent(context5, (Class<?>) AppLockSettingsActivity.class), (Bundle) null);
                        break;
                }
            }
        };
        final Preference preference12 = new Preference(i4(), (AttributeSet) null);
        preference12.C(C3(2131954504));
        preference12.A();
        preference12.y();
        final int i8 = 2;
        preference12.w = new e7.k(this) { // from class: com.github.rudroid.settings.p
            public final /* synthetic */ SettingsFragment s;

            {
                this.s = this;
            }

            public final void t(Preference preference42) {
                switch (i8) {
                    case 0:
                        WebViewActivity.a aVar2 = WebViewActivity.Companion;
                        Context context22 = preference12.r;
                        k71.k.f(context22, "getContext(...)");
                        SettingsFragment settingsFragment = this.s;
                        String C3 = settingsFragment.C3(2131954765);
                        k71.k.f(C3, "getString(...)");
                        String C32 = settingsFragment.C3(2131954603);
                        aVar2.getClass();
                        settingsFragment.E(WebViewActivity.a.a(context22, C3, C32), (Bundle) null);
                        break;
                    case 1:
                        WebViewActivity.a aVar3 = WebViewActivity.Companion;
                        Context context3 = preference12.r;
                        k71.k.f(context3, "getContext(...)");
                        SettingsFragment settingsFragment2 = this.s;
                        String C33 = settingsFragment2.C3(2131954582);
                        aVar3.getClass();
                        settingsFragment2.E(WebViewActivity.a.a(context3, "file:///android_asset/open_source_licenses.html", C33), (Bundle) null);
                        break;
                    case 2:
                        b21.v vVar = new b21.v(preference12.r);
                        k.d dVar = (k.d) vVar.t;
                        dVar.d = dVar.a.getText(2131954504);
                        SettingsFragment settingsFragment3 = this.s;
                        vVar.y(2131954504, new q(settingsFragment3, 0));
                        vVar.w(2131951840, (DialogInterface.OnClickListener) null);
                        settingsFragment3.N0 = vVar.A();
                        break;
                    case 3:
                        CodeOptionsActivity.a aVar4 = CodeOptionsActivity.Companion;
                        Context context4 = preference12.r;
                        k71.k.f(context4, "getContext(...)");
                        aVar4.getClass();
                        this.s.E(CodeOptionsActivity.a.a(context4), (Bundle) null);
                        break;
                    default:
                        AppLockSettingsActivity.a aVar5 = AppLockSettingsActivity.Companion;
                        Context context5 = preference12.r;
                        k71.k.f(context5, "getContext(...)");
                        aVar5.getClass();
                        this.s.E(new Intent(context5, (Class<?>) AppLockSettingsActivity.class), (Bundle) null);
                        break;
                }
            }
        };
        Preference preference13 = new Preference(i4(), (AttributeSet) null);
        preference13.C(C3(2131954553));
        preference13.A();
        preference13.y();
        preference13.w = new r(this, 3);
        Preference preference14 = new Preference(i4(), (AttributeSet) null);
        preference14.C(C3(2131954604));
        preference14.A();
        preference14.y();
        preference14.w = new r(this, 4);
        Preference preference15 = new Preference(i4(), (AttributeSet) null);
        preference15.C("Copilot Permission Overrides");
        preference15.A();
        preference15.y();
        preference15.w = new r(this, 5);
        Preference preference16 = new Preference(i4(), (AttributeSet) null);
        preference16.z("key_feature_preview");
        preference16.D(false);
        preference16.C(C3(2131954555));
        preference16.A();
        preference16.y();
        preference16.w = new r(this, 6);
        Preference preference17 = new Preference(i4(), (AttributeSet) null);
        preference17.W = 2131559234;
        if (preference17.H) {
            preference17.H = false;
            preference17.j();
        }
        preference17.C("GitHub Mobile v1.257.0 (925)");
        preference17.y();
        preferenceScreen.H(styledPreferenceCategory4);
        styledPreferenceCategory4.H(preference16);
        styledPreferenceCategory4.H(preference7);
        styledPreferenceCategory4.H(preference8);
        styledPreferenceCategory4.H(preference9);
        styledPreferenceCategory4.H(preference10);
        styledPreferenceCategory4.H(preference11);
        styledPreferenceCategory4.H(preference12);
        styledPreferenceCategory4.H(preference17);
        v4(preferenceScreen);
    }
}
