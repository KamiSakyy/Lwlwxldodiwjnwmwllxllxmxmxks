package com.github.rudroid.settings;

import androidx.preference.Preference;
import com.github.rudroid.settings.preferences.SingleChoiceBottomSheet;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class s implements e7.k {
    public final /* synthetic */ int r;
    public final /* synthetic */ SettingsFragment s;
    public final /* synthetic */ SingleChoiceBottomSheet.b t;

    public /* synthetic */ s(SettingsFragment settingsFragment, SingleChoiceBottomSheet.b bVar, int i) {
        this.r = i;
        this.s = settingsFragment;
        this.t = bVar;
    }

    public final void t(Preference preference) {
        switch (this.r) {
            case 0:
                SingleChoiceBottomSheet.a aVar = SingleChoiceBottomSheet.Companion;
                SettingsFragment settingsFragment = this.s;
                String C3 = settingsFragment.C3(2131954560);
                k71.k.f(C3, "getString(...)");
                ArrayList arrayList = new ArrayList(settingsFragment.D4());
                String str = this.t.r;
                aVar.getClass();
                SingleChoiceBottomSheet.a.a(C3, str, arrayList, "key_single_choice_dialog_language").z4(settingsFragment.x3(), "SingeChoiceBottomSheet");
                break;
            default:
                SingleChoiceBottomSheet.a aVar2 = SingleChoiceBottomSheet.Companion;
                SettingsFragment settingsFragment2 = this.s;
                String C32 = settingsFragment2.C3(2131954608);
                k71.k.f(C32, "getString(...)");
                ArrayList arrayList2 = new ArrayList(settingsFragment2.E4());
                String str2 = this.t.r;
                aVar2.getClass();
                SingleChoiceBottomSheet.a.a(C32, str2, arrayList2, "key_single_choice_dialog_theme").z4(settingsFragment2.x3(), "SingeChoiceBottomSheet");
                break;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class Preference<T1,T2,T3,T4> {
        public Preference() {
        }
    }
}
