package com.github.rudroid.settings.privacy;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.r;
import androidx.lifecycle.u1;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.github.rudroid.settings.ToolBarPreferenceFragmentCompat;
import com.github.rudroid.utilities.b3;
import k71.xShadow;
import sy.w;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SettingsPrivacyAnalyticsFragment extends Hilt_SettingsPrivacyAnalyticsFragment implements com.github.rudroid.fragments.util.f {
    public static final a Companion = new a();
    public com.github.rudroid.activities.util.c G0;
    public l1 H0;

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return SettingsPrivacyAnalyticsFragment.this;
        }
    }

    public static final class c extends k71.l implements j71.a {
        public final /* synthetic */ b s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.s = bVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
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
            r rVar = (u1) this.s.getValue();
            r rVar2 = rVar instanceof r ? rVar : null;
            return rVar2 != null ? rVar2.g0() : t6.a.b;
        }
    }

    public static final class f extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            r rVar = (u1) this.t.getValue();
            r rVar2 = rVar instanceof r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SettingsPrivacyAnalyticsFragment.this.f0() : f0;
        }
    }

    public SettingsPrivacyAnalyticsFragment() {
        w61.h s = w.s(w61.i.s, new c(new b()));
        this.H0 = new l1(xShadow.a(h.class), new d(s), new f(s), new e(s));
    }

    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.G0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    @Override // com.github.rudroid.settings.ToolBarPreferenceFragmentCompat
    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        super.c4(view, bundle);
        b3.b(view, 2131099700);
        ToolBarPreferenceFragmentCompat.w4(this, C3(2131954583));
        Preference t4 = t4("privacy_statement");
        if (t4 != null) {
            t4.w = new com.github.rudroid.settings.privacy.d(this, t4);
        }
        SwitchPreferenceCompat t42 = t4("switch_enable_analytics");
        if (t42 != null) {
            fi.a aVar = fi.b.Companion;
            Context context = ((Preference) t42).r;
            k71.k.f(context, "getContext(...)");
            aVar.getClass();
            t42.H(fi.a.d(context));
            ((Preference) t42).v = new com.github.rudroid.settings.privacy.d(t42, this);
        }
        SwitchPreferenceCompat t43 = t4("switch_enable_crash_reporting");
        if (t43 != null) {
            fi.a aVar2 = fi.b.Companion;
            Context context2 = ((Preference) t43).r;
            k71.k.f(context2, "getContext(...)");
            aVar2.getClass();
            t43.H(fi.a.g(context2).getBoolean("key_crash_logging_enabled", true));
            ((Preference) t43).v = new c5.b(8, t43);
        }
    }

    public final void u4() {
        s4(2132148240);
    }


    public static Object C3(Object... a) {
        return null;
    }

    public static Object t4(Object... a) {
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
