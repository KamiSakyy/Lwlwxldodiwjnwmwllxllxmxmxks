package com.github.rudroid.settings;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.settings.SettingsNotificationsFragment;
import com.github.rudroid.settings.j2;
import com.github.rudroid.settings.preferences.ActionPreferenceIcon;
import com.github.rudroid.settings.preferences.BadgePreference;
import com.github.rudroid.settings.preferences.BadgeSwitchPreference;
import com.github.rudroid.settings.preferences.SingleChoiceBottomSheet;
import com.github.rudroid.settings.preferences.SwipeActionPreference;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SettingsNotificationsFragment extends Hilt_SettingsNotificationsFragment implements com.github.rudroid.fragments.util.f {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] L0;
    public final com.github.rudroid.fragments.util.c G0 = new com.github.rudroid.fragments.util.c("EXTRA_SHOW_TOOLBAR", new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(2));
    public com.github.rudroid.activities.util.c H0;
    public androidx.lifecycle.l1 I0;
    public androidx.lifecycle.l1 J0;
    public androidx.lifecycle.l1 K0;

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.o1 f0;
            androidx.lifecycle.r rVar = (androidx.lifecycle.u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SettingsNotificationsFragment.this.f0() : f0;
        }
    }

    public static final class c extends k71.l implements j71.a {
        public c() {
            super(0);
        }

        public final Object a() {
            return SettingsNotificationsFragment.this;
        }
    }

    public static final class d extends k71.l implements j71.a {
        public final /* synthetic */ c s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.s = cVar;
        }

        public final Object a() {
            return (androidx.lifecycle.u1) this.s.a();
        }
    }

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((androidx.lifecycle.u1) this.s.getValue()).K0();
        }
    }

    public static final class f extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w61.h hVar) {
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

    public static final class g extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.o1 f0;
            androidx.lifecycle.r rVar = (androidx.lifecycle.u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SettingsNotificationsFragment.this.f0() : f0;
        }
    }

    public static final class h extends k71.l implements j71.a {
        public h() {
            super(0);
        }

        public final Object a() {
            return SettingsNotificationsFragment.this;
        }
    }

    public static final class i extends k71.l implements j71.a {
        public final /* synthetic */ h s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.s = hVar;
        }

        public final Object a() {
            return (androidx.lifecycle.u1) this.s.a();
        }
    }

    public static final class j extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((androidx.lifecycle.u1) this.s.getValue()).K0();
        }
    }

    public static final class k extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(w61.h hVar) {
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

    public static final class l extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.o1 f0;
            androidx.lifecycle.r rVar = (androidx.lifecycle.u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SettingsNotificationsFragment.this.f0() : f0;
        }
    }

    public static final class m extends k71.l implements j71.a {
        public m() {
            super(0);
        }

        public final Object a() {
            return SettingsNotificationsFragment.this;
        }
    }

    public static final class n extends k71.l implements j71.a {
        public final /* synthetic */ m s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.s = mVar;
        }

        public final Object a() {
            return (androidx.lifecycle.u1) this.s.a();
        }
    }

    public static final class o extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((androidx.lifecycle.u1) this.s.getValue()).K0();
        }
    }

    public static final class p extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(w61.h hVar) {
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

    static {
        r71.e pVar = new k71.p(SettingsNotificationsFragment.class, "showToolbar", "getShowToolbar()Z", 0);
        k71.xShadow.a.getClass();
        L0 = new r71.e[]{pVar};
        Companion = new a();
    }

    public SettingsNotificationsFragment() {
        h hVar = new h();
        w61.i iVar = w61.i.s;
        w61.h s = sy.w.s(iVar, new i(hVar));
        this.I0 = new androidx.lifecycle.l1(k71.xShadow.a(com.github.rudroid.settings.h.class), new j(s), new l(s), new k(s));
        w61.h s2 = sy.w.s(iVar, new n(new m()));
        this.J0 = new androidx.lifecycle.l1(k71.xShadow.a(i1.class), new o(s2), new b(s2), new p(s2));
        w61.h s3 = sy.w.s(iVar, new d(new c()));
        this.K0 = new androidx.lifecycle.l1(k71.xShadow.a(j3.class), new e(s3), new g(s3), new f(s3));
        f4(new c2(this, 2), new androidx.fragment.app.t0(2));
    }

    public static void A4(SettingsNotificationsFragment settingsNotificationsFragment, String str, Bundle bundle) {
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
        Preference t4 = settingsNotificationsFragment.t4("left_swipe");
        SwipeActionPreference swipeActionPreference = t4 instanceof SwipeActionPreference ? (SwipeActionPreference) t4 : null;
        if (bVar == null || swipeActionPreference == null) {
            return;
        }
        settingsNotificationsFragment.E4(swipeActionPreference, Integer.parseInt(bVar.r));
    }

    public static void B4(SettingsNotificationsFragment settingsNotificationsFragment, String str, Bundle bundle) {
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
        Preference t4 = settingsNotificationsFragment.t4("right_swipe");
        SwipeActionPreference swipeActionPreference = t4 instanceof SwipeActionPreference ? (SwipeActionPreference) t4 : null;
        if (bVar == null || swipeActionPreference == null) {
            return;
        }
        settingsNotificationsFragment.E4(swipeActionPreference, Integer.parseInt(bVar.r));
    }

    public final ArrayList C4() {
        String[] stringArray = B3().getStringArray(2130903040);
        k71.k.f(stringArray, "getStringArray(...)");
        ArrayList arrayList = new ArrayList(stringArray.length);
        int length = stringArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = stringArray[i2];
            int i4 = i3 + 1;
            k71.k.d(str);
            String[] stringArray2 = B3().getStringArray(2130903041);
            k71.k.f(stringArray2, "getStringArray(...)");
            String str2 = stringArray2[i3];
            k71.k.f(str2, "get(...)");
            arrayList.add(new SingleChoiceBottomSheet.b(str2, str));
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    public final i1 D4() {
        return (i1) this.J0.getValue();
    }

    public final void E4(SwipeActionPreference swipeActionPreference, int i2) {
        String str = ((Preference) swipeActionPreference).C;
        if (k71.k.b(str, "right_swipe")) {
            fi.a aVar = fi.b.Companion;
            Context i4 = i4();
            aVar.getClass();
            fi.a.f(i4, i2);
            return;
        }
        if (k71.k.b(str, "left_swipe")) {
            fi.a aVar2 = fi.b.Companion;
            Context i42 = i4();
            aVar2.getClass();
            fi.a.e(i42, i2);
        }
    }

    public final void F4(String str) {
        PreferenceCategory t4;
        Preference t42 = t4(str);
        if (t42 == null || (t4 = t4("push_notifications_settings")) == null) {
            return;
        }
        t4.K(t42);
    }

    public final void G4(String str) {
        PreferenceCategory t4 = t4(str);
        if (t4 != null) {
            t4.D(true);
        }
    }

    public final void H4(boolean z, final ak.a aVar, boolean z2) {
        String str;
        switch (aVar.ordinal()) {
            case 0:
            case 11:
                throw new IllegalStateException(("invalid notification setting type for conversion to xml string: " + aVar.name()).toString());
            case 1:
                str = "switch_enable_direct_mentions";
                break;
            case 2:
                str = "switch_enable_review_requested";
                break;
            case 3:
                str = "switch_enable_assignments";
                break;
            case 4:
                str = "switch_enable_deploy_reviews";
                break;
            case 5:
                str = "switch_enable_pr_reviews";
                break;
            case 6:
                str = "switch_enable_merge_queue_events";
                break;
            case 7:
                str = "switch_enable_ci_activity";
                break;
            case 8:
                str = "switch_enable_ci_activity_failed_only";
                break;
            case 9:
                str = "switch_enable_releases";
                break;
            case 10:
                str = "switch_enable_live_activity_copilot_coding_agent";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        final BadgeSwitchPreference t4 = t4(str);
        if (t4 != null) {
            t4.H(z);
            t4.o0.y(Boolean.valueOf(z2), BadgeSwitchPreference.p0[0]);
            ((Preference) t4).v = new e7.j() { // from class: com.github.rudroid.settings.b2
                public final void h(Preference preference, Object obj) {
                    SettingsNotificationsFragment.a aVar2 = SettingsNotificationsFragment.Companion;
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        SettingsNotificationsFragment settingsNotificationsFragment = SettingsNotificationsFragment.this;
                        i1 D4 = settingsNotificationsFragment.D4();
                        com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e eVar = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(18, settingsNotificationsFragment, t4);
                        ak.a aVar3 = aVar;
                        k71.k.g(aVar3, "settingType");
                        v71.b0.z(androidx.lifecycle.d1.k(D4), (a71.h) null, (v71.a0Shadow) null, new u1(D4, booleanValue, aVar3, eVar, null), 3);
                    }
                }
            };
        }
    }

    public final void I4(g3 g3Var, final SwipeActionPreference swipeActionPreference) {
        final int b2;
        final String C3;
        swipeActionPreference.B(C3(g3Var.s));
        swipeActionPreference.H(g3Var.t, g3Var.w);
        String str = ((Preference) swipeActionPreference).C;
        if (k71.k.b(str, "right_swipe")) {
            fi.a aVar = fi.b.Companion;
            Context i4 = i4();
            aVar.getClass();
            b2 = fi.a.c(i4);
        } else {
            if (!k71.k.b(str, "left_swipe")) {
                throw new IllegalStateException(("invalid swipe preference: " + ((Preference) swipeActionPreference).C).toString());
            }
            fi.a aVar2 = fi.b.Companion;
            Context i42 = i4();
            aVar2.getClass();
            b2 = fi.a.b(i42);
        }
        String str2 = ((Preference) swipeActionPreference).C;
        if (k71.k.b(str2, "right_swipe")) {
            C3 = C3(2131954598);
        } else {
            if (!k71.k.b(str2, "left_swipe")) {
                throw new IllegalStateException(("invalid swipe preference: " + ((Preference) swipeActionPreference).C).toString());
            }
            C3 = C3(2131954595);
        }
        k71.k.d(C3);
        ((Preference) swipeActionPreference).w = new e7.k() { // from class: com.github.rudroid.settings.d2
            public final void t(Preference preference) {
                SettingsNotificationsFragment.a aVar3 = SettingsNotificationsFragment.Companion;
                SettingsNotificationsFragment.this.L4(swipeActionPreference, C3, b2);
            }
        };
    }

    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.H0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public final void J4() {
        float f2 = com.github.rudroid.utilities.g.a;
        Context y3 = y3();
        if (y3 == null) {
            return;
        }
        int i2 = com.github.rudroid.utilities.g.a(y3) ? 2131954580 : 2131954496;
        Context y32 = y3();
        if (y32 == null) {
            return;
        }
        Integer num = com.github.rudroid.utilities.g.a(y32) ? null : 2131100991;
        ActionPreferenceIcon actionPreferenceIcon = (ActionPreferenceIcon) t4("notification_system_options");
        if (actionPreferenceIcon != null) {
            actionPreferenceIcon.f0.y(num, ActionPreferenceIcon.g0[0]);
            actionPreferenceIcon.B(((Preference) actionPreferenceIcon).r.getString(i2));
            ((Preference) actionPreferenceIcon).w = new c2(this, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (com.github.commonandroid.featureflag.RuntimeFeatureFlag.a(r3) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K4() {
        String str;
        Object obj;
        String str2;
        G4("push_notifications_settings");
        Preference t4 = t4("push_opt_in_header");
        int i2 = 0;
        if (t4 != null) {
            t4.D(false);
        }
        J4();
        if (!D4().K || !D4().M) {
            F4("switch_enable_review_requested");
            F4("switch_enable_assignments");
            F4("switch_enable_deploy_reviews");
            F4("switch_enable_pr_reviews");
            F4("switch_enable_ci_activity");
            F4("switch_enable_ci_activity_failed_only");
        }
        com.github.rudroid.activities.util.c cVar = this.H0;
        Object obj2 = null;
        if (cVar == null) {
            k71.k.m("accountHolder");
            throw null;
        }
        if (cVar.d().f(com.github.rudroid.common.a.w)) {
            RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
            ei.c cVar2 = ei.c.G;
            runtimeFeatureFlag.getClass();
        }
        F4("switch_enable_releases");
        G4("schedules_category");
        G4("divider_notification_settings");
        BadgePreference badgePreference = (BadgePreference) t4("preference_set_schedules");
        if (badgePreference != null) {
            ((Preference) badgePreference).w = new androidx.compose.foundation.lazy.layout.q1(4, this, badgePreference);
        }
        G4("swipe_options");
        G4("divider_swipe_settings");
        Preference t42 = t4("right_swipe");
        SwipeActionPreference swipeActionPreference = t42 instanceof SwipeActionPreference ? (SwipeActionPreference) t42 : null;
        String str3 = "";
        if (swipeActionPreference != null) {
            if (!swipeActionPreference.h0) {
                swipeActionPreference.h0 = true;
            }
            swipeActionPreference.j();
            fi.a aVar = fi.b.Companion;
            Context i4 = i4();
            aVar.getClass();
            final int c2 = fi.a.c(i4);
            ArrayList C4 = C4();
            int size = C4.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    obj = null;
                    break;
                }
                obj = C4.get(i3);
                i3++;
                if (Integer.parseInt(((SingleChoiceBottomSheet.b) obj).r) == c2) {
                    break;
                }
            }
            SingleChoiceBottomSheet.b bVar = (SingleChoiceBottomSheet.b) obj;
            if (bVar == null || (str2 = bVar.s) == null) {
                str2 = "";
            }
            swipeActionPreference.B(str2);
            final int i5 = 0;
            ((Preference) swipeActionPreference).w = new e7.k(this) { // from class: com.github.rudroid.settings.f2
                public final /* synthetic */ SettingsNotificationsFragment s;

                {
                    this.s = this;
                }

                public final void t(Preference preference) {
                    int i6 = i5;
                    int i7 = c2;
                    SettingsNotificationsFragment settingsNotificationsFragment = this.s;
                    switch (i6) {
                        case 0:
                            SettingsNotificationsFragment.a aVar2 = SettingsNotificationsFragment.Companion;
                            String C3 = settingsNotificationsFragment.C3(2131954598);
                            k71.k.f(C3, "getString(...)");
                            settingsNotificationsFragment.L4(preference, C3, i7);
                            break;
                        default:
                            SettingsNotificationsFragment.a aVar3 = SettingsNotificationsFragment.Companion;
                            String C32 = settingsNotificationsFragment.C3(2131954595);
                            k71.k.f(C32, "getString(...)");
                            settingsNotificationsFragment.L4(preference, C32, i7);
                            break;
                    }
                }
            };
        }
        Preference t43 = t4("left_swipe");
        SwipeActionPreference swipeActionPreference2 = t43 instanceof SwipeActionPreference ? (SwipeActionPreference) t43 : null;
        if (swipeActionPreference2 != null) {
            if (swipeActionPreference2.h0) {
                swipeActionPreference2.h0 = false;
            }
            swipeActionPreference2.j();
            fi.a aVar2 = fi.b.Companion;
            Context i42 = i4();
            aVar2.getClass();
            final int b2 = fi.a.b(i42);
            ArrayList C42 = C4();
            int size2 = C42.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj3 = C42.get(i2);
                i2++;
                if (Integer.parseInt(((SingleChoiceBottomSheet.b) obj3).r) == b2) {
                    obj2 = obj3;
                    break;
                }
            }
            SingleChoiceBottomSheet.b bVar2 = (SingleChoiceBottomSheet.b) obj2;
            if (bVar2 != null && (str = bVar2.s) != null) {
                str3 = str;
            }
            swipeActionPreference2.B(str3);
            final int i6 = 1;
            ((Preference) swipeActionPreference2).w = new e7.k(this) { // from class: com.github.rudroid.settings.f2
                public final /* synthetic */ SettingsNotificationsFragment s;

                {
                    this.s = this;
                }

                public final void t(Preference preference) {
                    int i62 = i6;
                    int i7 = b2;
                    SettingsNotificationsFragment settingsNotificationsFragment = this.s;
                    switch (i62) {
                        case 0:
                            SettingsNotificationsFragment.a aVar22 = SettingsNotificationsFragment.Companion;
                            String C3 = settingsNotificationsFragment.C3(2131954598);
                            k71.k.f(C3, "getString(...)");
                            settingsNotificationsFragment.L4(preference, C3, i7);
                            break;
                        default:
                            SettingsNotificationsFragment.a aVar3 = SettingsNotificationsFragment.Companion;
                            String C32 = settingsNotificationsFragment.C3(2131954595);
                            k71.k.f(C32, "getString(...)");
                            settingsNotificationsFragment.L4(preference, C32, i7);
                            break;
                    }
                }
            };
        }
    }

    public final void L4(Preference preference, String str, int i2) {
        SingleChoiceBottomSheet.a aVar = SingleChoiceBottomSheet.Companion;
        t71.n nVar = com.github.rudroid.utilities.n2.a;
        Locale locale = Locale.getDefault();
        k71.k.f(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        k71.k.f(lowerCase, "toLowerCase(...)");
        String D3 = D3(2131954600, new Object[]{lowerCase});
        k71.k.f(D3, "getString(...)");
        ArrayList arrayList = new ArrayList(C4());
        String valueOf = String.valueOf(i2);
        String str2 = k71.k.b(preference.C, "left_swipe") ? "swipe_dialog_request_key_left" : "swipe_dialog_request_key_right";
        aVar.getClass();
        SingleChoiceBottomSheet.a.a(D3, valueOf, arrayList, str2).z4(x3(), "SingeChoiceBottomSheet");
    }

    public final void Y3() {
        ((androidx.fragment.app.a0) this).Y = true;
        J4();
    }

    @Override // com.github.rudroid.settings.ToolBarPreferenceFragmentCompat
    public final void c4(View view, Bundle bundle) {
        BadgeSwitchPreference t4;
        k71.k.g(view, "view");
        super.c4(view, bundle);
        K4();
        com.github.rudroid.utilities.w0.a(D4().F, F3(), androidx.lifecycle.w.u, new g2(this, null));
        com.github.rudroid.utilities.w0.a(D4().H, F3(), androidx.lifecycle.w.u, new h2(this, null));
        final int i2 = 0;
        ((com.github.rudroid.settings.h) this.I0.getValue()).t.e(F3(), new j2.b(new j71.c(this) { // from class: com.github.rudroid.settings.e2
            public final /* synthetic */ SettingsNotificationsFragment s;

            {
                this.s = this;
            }

            public final Object k(Object obj) {
                int i3 = i2;
                w61.a0 a0Var = w61.a0.a;
                SettingsNotificationsFragment settingsNotificationsFragment = this.s;
                switch (i3) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        SettingsNotificationsFragment.a aVar = SettingsNotificationsFragment.Companion;
                        k71.k.d(bool);
                        settingsNotificationsFragment.x4(bool.booleanValue(), new g0(settingsNotificationsFragment, 1));
                        break;
                    default:
                        h3 h3Var = (h3) obj;
                        SettingsNotificationsFragment.a aVar2 = SettingsNotificationsFragment.Companion;
                        k71.k.d(h3Var);
                        SwipeActionPreference swipeActionPreference = (SwipeActionPreference) settingsNotificationsFragment.t4("right_swipe");
                        if (swipeActionPreference != null) {
                            settingsNotificationsFragment.I4(h3Var.a, swipeActionPreference);
                        }
                        SwipeActionPreference swipeActionPreference2 = (SwipeActionPreference) settingsNotificationsFragment.t4("left_swipe");
                        if (swipeActionPreference2 != null) {
                            settingsNotificationsFragment.I4(h3Var.b, swipeActionPreference2);
                            break;
                        }
                        break;
                }
                return a0Var;
            }
        }));
        final int i3 = 1;
        ((j3) this.K0.getValue()).t.e(F3(), new j2.b(new j71.c(this) { // from class: com.github.rudroid.settings.e2
            public final /* synthetic */ SettingsNotificationsFragment s;

            {
                this.s = this;
            }

            public final Object k(Object obj) {
                int i32 = i3;
                w61.a0 a0Var = w61.a0.a;
                SettingsNotificationsFragment settingsNotificationsFragment = this.s;
                switch (i32) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        SettingsNotificationsFragment.a aVar = SettingsNotificationsFragment.Companion;
                        k71.k.d(bool);
                        settingsNotificationsFragment.x4(bool.booleanValue(), new g0(settingsNotificationsFragment, 1));
                        break;
                    default:
                        h3 h3Var = (h3) obj;
                        SettingsNotificationsFragment.a aVar2 = SettingsNotificationsFragment.Companion;
                        k71.k.d(h3Var);
                        SwipeActionPreference swipeActionPreference = (SwipeActionPreference) settingsNotificationsFragment.t4("right_swipe");
                        if (swipeActionPreference != null) {
                            settingsNotificationsFragment.I4(h3Var.a, swipeActionPreference);
                        }
                        SwipeActionPreference swipeActionPreference2 = (SwipeActionPreference) settingsNotificationsFragment.t4("left_swipe");
                        if (swipeActionPreference2 != null) {
                            settingsNotificationsFragment.I4(h3Var.b, swipeActionPreference2);
                            break;
                        }
                        break;
                }
                return a0Var;
            }
        }));
        com.github.rudroid.utilities.w0.a(D4().J, F3(), androidx.lifecycle.w.u, new i2(this, null));
        if (D4().K) {
            i1 D4 = D4();
            v71.b0.z(androidx.lifecycle.d1.k(D4), (a71.h) null, (v71.a0Shadow) null, new r1(D4, null), 3);
        }
        if (D4().L) {
            i1 D42 = D4();
            v71.b0.z(androidx.lifecycle.d1.k(D42), (a71.h) null, (v71.a0Shadow) null, new q1(D42, null), 3);
        }
        if (((Boolean) this.G0.a(this, L0[0])).booleanValue()) {
            ToolBarPreferenceFragmentCompat.w4(this, C3(2131954556));
        } else {
            View view2 = ((androidx.fragment.app.a0) this).a0;
            AppBarLayout appBarLayout = view2 != null ? (AppBarLayout) view2.findViewById(2131361906) : null;
            if (appBarLayout == null) {
                appBarLayout = null;
            }
            if (appBarLayout != null) {
                appBarLayout.setVisibility(8);
            }
        }
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.B;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar)) {
            com.github.rudroid.activities.util.c cVar2 = this.H0;
            if (cVar2 == null) {
                k71.k.m("accountHolder");
                throw null;
            }
            if (cVar2.d().f(com.github.rudroid.common.a.E) && (t4 = t4("switch_enable_merge_queue_events")) != null) {
                t4.D(true);
            }
        }
        if (RuntimeFeatureFlag.a(ei.c.Q)) {
            com.github.rudroid.activities.util.c cVar3 = this.H0;
            if (cVar3 == null) {
                k71.k.m("accountHolder");
                throw null;
            }
            if (cVar3.d().f(com.github.rudroid.common.a.w)) {
                G4("live_notifications_settings");
                G4("divider_live_notifications");
                BadgeSwitchPreference t42 = t4("switch_enable_live_activity_copilot_coding_agent");
                if (t42 != null) {
                    t42.D(true);
                    if (Build.VERSION.SDK_INT < 36) {
                        t42.B(((Preference) t42).r.getString(2131954569));
                    }
                }
            }
        }
        x3().i0("swipe_dialog_request_key_left", F3(), new c2(this, 3));
        x3().i0("swipe_dialog_request_key_right", F3(), new c2(this, 0));
    }

    public final void u4() {
        s4(2132148238);
    }


    public static Object f4(Object... a) {
        return null;
    }

    public static Object t4(Object... a) {
        return null;
    }

    public static Object B3(Object... a) {
        return null;
    }

    public static Object i4(Object... a) {
        return null;
    }

    public static Object C3(Object... a) {
        return null;
    }

    public static Object D3(Object... a) {
        return null;
    }

    public static Object x3(Object... a) {
        return null;
    }

    public static Object F3(Object... a) {
        return null;
    }

    public static Object s4(Object... a) {
        return null;
    }

    public static Object E(Object... a) {
        return null;
    }
    public Object E(Object p1, Object p2) { return null; }
}
