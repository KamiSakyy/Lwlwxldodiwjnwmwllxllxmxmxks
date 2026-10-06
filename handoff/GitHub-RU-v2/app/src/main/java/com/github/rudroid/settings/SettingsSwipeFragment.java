package com.github.rudroid.settings;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.preference.Preference;
import com.github.rudroid.settings.SettingsSwipeFragment;
import com.github.rudroid.settings.preferences.SingleChoiceBottomSheet;
import com.github.rudroid.settings.preferences.SwipeActionPreference;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SettingsSwipeFragment extends ToolBarPreferenceFragmentCompat {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] D0;
    public final com.github.rudroid.fragments.util.c B0 = new com.github.rudroid.fragments.util.c(new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(3));
    public final androidx.lifecycle.l1 C0;

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return SettingsSwipeFragment.this;
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
            return (androidx.lifecycle.u1) this.s.a();
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
            return ((androidx.lifecycle.u1) this.s.getValue()).K0();
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
            androidx.lifecycle.r rVar = (androidx.lifecycle.u1) this.s.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
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
            androidx.lifecycle.o1 f0;
            androidx.lifecycle.r rVar = (androidx.lifecycle.u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SettingsSwipeFragment.this.f0() : f0;
        }
    }

    static {
        r71.e mVar = new k71.m(SettingsSwipeFragment.class, "showFooter", "getShowFooter()Z", 0);
        k71.x.a.getClass();
        D0 = new r71.e[]{mVar};
        Companion = new a();
    }

    public SettingsSwipeFragment() {
        w61.h s = sy.w.s(w61.i.s, new c(new b()));
        this.C0 = new androidx.lifecycle.l1(k71.x.a(j3.class), new d(s), new f(s), new e(s));
    }

    public static void A4(SettingsSwipeFragment settingsSwipeFragment, String str, Bundle bundle) {
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
        Preference t4 = settingsSwipeFragment.t4("right_swipe");
        SwipeActionPreference swipeActionPreference = t4 instanceof SwipeActionPreference ? (SwipeActionPreference) t4 : null;
        if (bVar == null || swipeActionPreference == null) {
            return;
        }
        settingsSwipeFragment.C4(swipeActionPreference, Integer.parseInt(bVar.r));
    }

    public static void z4(SettingsSwipeFragment settingsSwipeFragment, String str, Bundle bundle) {
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
        Preference t4 = settingsSwipeFragment.t4("left_swipe");
        SwipeActionPreference swipeActionPreference = t4 instanceof SwipeActionPreference ? (SwipeActionPreference) t4 : null;
        if (bVar == null || swipeActionPreference == null) {
            return;
        }
        settingsSwipeFragment.C4(swipeActionPreference, Integer.parseInt(bVar.r));
    }

    public final ArrayList B4() {
        String[] stringArray = B3().getStringArray(2130903040);
        k71.k.f(stringArray, "getStringArray(...)");
        ArrayList arrayList = new ArrayList(stringArray.length);
        int length = stringArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = stringArray[i];
            int i3 = i2 + 1;
            k71.k.d(str);
            String[] stringArray2 = B3().getStringArray(2130903041);
            k71.k.f(stringArray2, "getStringArray(...)");
            String str2 = stringArray2[i2];
            k71.k.f(str2, "get(...)");
            arrayList.add(new SingleChoiceBottomSheet.b(str2, str));
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    public final void C4(SwipeActionPreference swipeActionPreference, int i) {
        String str = ((Preference) swipeActionPreference).C;
        if (k71.k.b(str, "right_swipe")) {
            fi.a aVar = fi.b.Companion;
            Context i4 = i4();
            aVar.getClass();
            fi.a.f(i4, i);
            return;
        }
        if (k71.k.b(str, "left_swipe")) {
            fi.a aVar2 = fi.b.Companion;
            Context i42 = i4();
            aVar2.getClass();
            fi.a.e(i42, i);
        }
    }

    public final void D4(g3 g3Var, SwipeActionPreference swipeActionPreference) {
        int b2;
        String C3;
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
        ((Preference) swipeActionPreference).w = new n2(b2, this, C3);
    }

    public final void E4(Preference preference, String str, int i) {
        SingleChoiceBottomSheet.a aVar = SingleChoiceBottomSheet.Companion;
        t71.n nVar = com.github.rudroid.utilities.n2.a;
        Locale locale = Locale.getDefault();
        k71.k.f(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        k71.k.f(lowerCase, "toLowerCase(...)");
        String D3 = D3(2131954600, new Object[]{lowerCase});
        k71.k.f(D3, "getString(...)");
        ArrayList arrayList = new ArrayList(B4());
        String valueOf = String.valueOf(i);
        String str2 = k71.k.b(preference.C, "left_swipe") ? "swipe_dialog_request_key_left" : "swipe_dialog_request_key_right";
        aVar.getClass();
        SingleChoiceBottomSheet.a.a(D3, valueOf, arrayList, str2).z4(x3(), "SingeChoiceBottomSheet");
    }

    @Override // com.github.rudroid.settings.ToolBarPreferenceFragmentCompat
    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        super.c4(view, bundle);
        ToolBarPreferenceFragmentCompat.w4(this, C3(2131954558));
        ((j3) this.C0.getValue()).t.e(F3(), new p2(this));
        final int i = 0;
        x3().i0("swipe_dialog_request_key_left", F3(), new androidx.fragment.app.f1(this) { // from class: com.github.rudroid.settings.o2
            public final /* synthetic */ SettingsSwipeFragment s;

            {
                this.s = this;
            }

            public final void e(String str, Bundle bundle2) {
                switch (i) {
                    case 0:
                        SettingsSwipeFragment.z4(this.s, str, bundle2);
                        break;
                    default:
                        SettingsSwipeFragment.A4(this.s, str, bundle2);
                        break;
                }
            }
        });
        final int i2 = 1;
        x3().i0("swipe_dialog_request_key_right", F3(), new androidx.fragment.app.f1(this) { // from class: com.github.rudroid.settings.o2
            public final /* synthetic */ SettingsSwipeFragment s;

            {
                this.s = this;
            }

            public final void e(String str, Bundle bundle2) {
                switch (i2) {
                    case 0:
                        SettingsSwipeFragment.z4(this.s, str, bundle2);
                        break;
                    default:
                        SettingsSwipeFragment.A4(this.s, str, bundle2);
                        break;
                }
            }
        });
    }

    public final void u4() {
        String str;
        Object obj;
        String str2;
        s4(2132148242);
        Preference t4 = t4("right_swipe");
        Object obj2 = null;
        SwipeActionPreference swipeActionPreference = t4 instanceof SwipeActionPreference ? (SwipeActionPreference) t4 : null;
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
            ArrayList B4 = B4();
            int size = B4.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = B4.get(i);
                i++;
                if (Integer.parseInt(((SingleChoiceBottomSheet.b) obj).r) == c2) {
                    break;
                }
            }
            SingleChoiceBottomSheet.b bVar = (SingleChoiceBottomSheet.b) obj;
            if (bVar == null || (str2 = bVar.s) == null) {
                str2 = "";
            }
            swipeActionPreference.B(str2);
            final int i2 = 0;
            ((Preference) swipeActionPreference).w = new e7.k(this) { // from class: com.github.rudroid.settings.m2
                public final /* synthetic */ SettingsSwipeFragment s;

                {
                    this.s = this;
                }

                public final void t(Preference preference) {
                    int i3 = i2;
                    int i5 = c2;
                    SettingsSwipeFragment settingsSwipeFragment = this.s;
                    switch (i3) {
                        case 0:
                            SettingsSwipeFragment.a aVar2 = SettingsSwipeFragment.Companion;
                            String C3 = settingsSwipeFragment.C3(2131954598);
                            k71.k.f(C3, "getString(...)");
                            settingsSwipeFragment.E4(preference, C3, i5);
                            break;
                        default:
                            SettingsSwipeFragment.a aVar3 = SettingsSwipeFragment.Companion;
                            String C32 = settingsSwipeFragment.C3(2131954595);
                            k71.k.f(C32, "getString(...)");
                            settingsSwipeFragment.E4(preference, C32, i5);
                            break;
                    }
                }
            };
        }
        Preference t42 = t4("left_swipe");
        SwipeActionPreference swipeActionPreference2 = t42 instanceof SwipeActionPreference ? (SwipeActionPreference) t42 : null;
        if (swipeActionPreference2 != null) {
            if (swipeActionPreference2.h0) {
                swipeActionPreference2.h0 = false;
            }
            swipeActionPreference2.j();
            fi.a aVar2 = fi.b.Companion;
            Context i42 = i4();
            aVar2.getClass();
            final int b2 = fi.a.b(i42);
            ArrayList B42 = B4();
            int size2 = B42.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                Object obj3 = B42.get(i3);
                i3++;
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
            final int i5 = 1;
            ((Preference) swipeActionPreference2).w = new e7.k(this) { // from class: com.github.rudroid.settings.m2
                public final /* synthetic */ SettingsSwipeFragment s;

                {
                    this.s = this;
                }

                public final void t(Preference preference) {
                    int i32 = i5;
                    int i52 = b2;
                    SettingsSwipeFragment settingsSwipeFragment = this.s;
                    switch (i32) {
                        case 0:
                            SettingsSwipeFragment.a aVar22 = SettingsSwipeFragment.Companion;
                            String C3 = settingsSwipeFragment.C3(2131954598);
                            k71.k.f(C3, "getString(...)");
                            settingsSwipeFragment.E4(preference, C3, i52);
                            break;
                        default:
                            SettingsSwipeFragment.a aVar3 = SettingsSwipeFragment.Companion;
                            String C32 = settingsSwipeFragment.C3(2131954595);
                            k71.k.f(C32, "getString(...)");
                            settingsSwipeFragment.E4(preference, C32, i52);
                            break;
                    }
                }
            };
        }
        boolean booleanValue = ((Boolean) this.B0.a(this, D0[0])).booleanValue();
        Preference t43 = t4("footer");
        if (t43 != null) {
            t43.D(booleanValue);
        }
    }


    public static  f0(Object... a) {
        return null;
    }

    public static  t4(Object... a) {
        return null;
    }

    public static  F3(Object... a) {
        return null;
    }

    public static  x3(Object... a) {
        return null;
    }

    public static  s4(Object... a) {
        return null;
    }

    public static  C3(Object... a) {
        return null;
    }
}
