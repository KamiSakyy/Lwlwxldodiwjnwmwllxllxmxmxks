package com.github.rudroid.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import com.github.rudroid.settings.SettingsNotificationSchedulesFragment;
import com.github.rudroid.settings.k0;
import com.github.rudroid.settings.preferences.ActionPreference;
import com.github.rudroid.settings.preferences.DaysOfWeekPickerPreference;
import com.github.rudroid.settings.preferences.RadioPreferenceGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SettingsNotificationSchedulesFragment extends Hilt_SettingsNotificationSchedulesFragment implements com.github.rudroid.fragments.util.f {
    public static final a Companion = new a();
    public com.github.rudroid.activities.util.c G0;
    public final androidx.lifecycle.l1 H0;
    public final androidx.lifecycle.l1 I0;

    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final /* synthetic */ b[] r;

        static {
            b[] bVarArr = {new b("EVERY_DAY", 0), new b("CUSTOM", 1)};
            r = bVarArr;
            v8.l0.t(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) r.clone();
        }
    }

    public static final class c extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.o1 f0;
            androidx.lifecycle.r rVar = (androidx.lifecycle.u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SettingsNotificationSchedulesFragment.this.f0() : f0;
        }
    }

    public static final class d extends k71.l implements j71.a {
        public d() {
            super(0);
        }

        public final Object a() {
            return SettingsNotificationSchedulesFragment.this;
        }
    }

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ d s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.s = dVar;
        }

        public final Object a() {
            return (androidx.lifecycle.u1) this.s.a();
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
            return ((androidx.lifecycle.u1) this.s.getValue()).K0();
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
            androidx.lifecycle.r rVar = (androidx.lifecycle.u1) this.s.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return rVar2 != null ? rVar2.g0() : t6.a.b;
        }
    }

    public static final class h extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.o1 f0;
            androidx.lifecycle.r rVar = (androidx.lifecycle.u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SettingsNotificationSchedulesFragment.this.f0() : f0;
        }
    }

    public static final class i extends k71.l implements j71.a {
        public i() {
            super(0);
        }

        public final Object a() {
            return SettingsNotificationSchedulesFragment.this;
        }
    }

    public static final class j extends k71.l implements j71.a {
        public final /* synthetic */ i s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.s = iVar;
        }

        public final Object a() {
            return (androidx.lifecycle.u1) this.s.a();
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
            return ((androidx.lifecycle.u1) this.s.getValue()).K0();
        }
    }

    public static final class l extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(w61.h hVar) {
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

    public SettingsNotificationSchedulesFragment() {
        d dVar = new d();
        w61.i iVar = w61.i.s;
        w61.h s = sy.w.s(iVar, new e(dVar));
        this.H0 = new androidx.lifecycle.l1(k71.x.a(r0.class), new f(s), new h(s), new g(s));
        w61.h s2 = sy.w.s(iVar, new j(new i()));
        this.I0 = new androidx.lifecycle.l1(k71.x.a(com.github.rudroid.settings.h.class), new k(s2), new c(s2), new l(s2));
    }

    public final r0 A4() {
        return (r0) this.H0.getValue();
    }

    public final void B4(int i2, String str, int i3) {
        String e2 = com.github.rudroid.utilities.t.e(i2, i3, i4());
        ActionPreference actionPreference = (ActionPreference) t4(str);
        if (actionPreference != null) {
            Context context = ((Preference) actionPreference).r;
            String string = context.getString(2131954109, e2);
            k71.k.f(string, "getString(...)");
            String string2 = context.getString(2131953607);
            k71.k.f(string2, "getString(...)");
            actionPreference.f0 = e2;
            actionPreference.g0 = string;
            actionPreference.h0 = string2;
            actionPreference.j();
        }
    }

    public final void C4(List list, boolean z) {
        DaysOfWeekPickerPreference daysOfWeekPickerPreference = (DaysOfWeekPickerPreference) t4("preference_day_picker");
        if (daysOfWeekPickerPreference != null) {
            daysOfWeekPickerPreference.D(z);
            if (z) {
                gg.c cVar = (gg.c) daysOfWeekPickerPreference.f0.getValue();
                cVar.getClass();
                ArrayList arrayList = cVar.i;
                arrayList.clear();
                arrayList.addAll(list);
                cVar.n();
            }
        }
    }

    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.G0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public final void X3() {
        r0 A4 = A4();
        v71.b0.z(androidx.lifecycle.d1.k(A4), (a71.h) null, (v71.a0) null, new z0(A4, new c0(this, 0), null), 3);
        ((androidx.fragment.app.a0) this).Y = true;
    }

    @Override // com.github.rudroid.settings.ToolBarPreferenceFragmentCompat
    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        super.c4(view, bundle);
        com.github.rudroid.utilities.b3.b(view, 2131099700);
        ToolBarPreferenceFragmentCompat.w4(this, C3(2131954557));
        A4().y.e(F3(), new k0.a(new c0(this, 1)));
        androidx.lifecycle.l1 l1Var = this.I0;
        ((com.github.rudroid.settings.h) l1Var.getValue()).t.e(F3(), new k0.a(new c0(this, 2)));
        ((com.github.rudroid.settings.h) l1Var.getValue()).P();
    }

    public final void u4() {
        s4(2132148241);
        PreferenceCategory t4 = t4("schedules_settings_category");
        SwitchPreferenceCompat t42 = t4("preference_global_toggle");
        if (t42 != null) {
            ((Preference) t42).v = new h0(1, t4);
        }
        DaysOfWeekPickerPreference daysOfWeekPickerPreference = (DaysOfWeekPickerPreference) t4("preference_day_picker");
        if (daysOfWeekPickerPreference != null) {
            daysOfWeekPickerPreference.g0 = new j0(this);
        }
        RadioPreferenceGroup radioPreferenceGroup = (RadioPreferenceGroup) t4("radio_group");
        if (radioPreferenceGroup != null) {
            b[] bVarArr = b.r;
            List r = x61.l.r(new Integer[]{2131954498, 2131954497});
            RadioPreferenceGroup.b bVar = radioPreferenceGroup.f0;
            r71.e[] eVarArr = RadioPreferenceGroup.i0;
            bVar.y(r, eVarArr[0]);
            radioPreferenceGroup.h0.y(new RadioPreferenceGroup.a() { // from class: com.github.rudroid.settings.f0
                @Override // com.github.rudroid.settings.preferences.RadioPreferenceGroup.a
                public final void a(int i2) {
                    SettingsNotificationSchedulesFragment.b[] bVarArr2 = SettingsNotificationSchedulesFragment.b.r;
                    SettingsNotificationSchedulesFragment settingsNotificationSchedulesFragment = SettingsNotificationSchedulesFragment.this;
                    if (i2 == 2131954498) {
                        settingsNotificationSchedulesFragment.A4().d();
                    } else if (i2 == 2131954497) {
                        settingsNotificationSchedulesFragment.A4().o();
                    }
                }
            }, eVarArr[2]);
        }
    }
}
