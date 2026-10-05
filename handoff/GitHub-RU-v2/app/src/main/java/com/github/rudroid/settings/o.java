package com.github.rudroid.settings;

import android.view.View;
import androidx.preference.Preference;
import com.github.rudroid.settings.preferences.SingleChoiceBottomSheet;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class o implements e7.k, b5.o {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ o(int i, Object obj) {
        this.s = obj;
        this.r = i;
    }

    public boolean b(View view) {
        ((SideSheetBehavior) this.s).w(this.r);
        return true;
    }

    public void t(Preference preference) {
        SettingsFragment settingsFragment = (SettingsFragment) this.s;
        SingleChoiceBottomSheet.a aVar = SingleChoiceBottomSheet.Companion;
        String C3 = settingsFragment.C3(2131954608);
        k71.k.f(C3, "getString(...)");
        ArrayList arrayList = new ArrayList(settingsFragment.E4());
        String valueOf = String.valueOf(this.r);
        aVar.getClass();
        SingleChoiceBottomSheet.a.a(C3, valueOf, arrayList, "key_single_choice_dialog_theme").z4(settingsFragment.x3(), "SingeChoiceBottomSheet");
    }

}
