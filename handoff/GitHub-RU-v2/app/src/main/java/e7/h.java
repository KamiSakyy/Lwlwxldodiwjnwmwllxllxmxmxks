package e7;

import android.content.DialogInterface;
import androidx.preference.MultiSelectListPreferenceDialogFragmentCompat;
import java.util.HashSet;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiSelectListPreferenceDialogFragmentCompat f22004a;

    public h(MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat) {
        this.f22004a = multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z10) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = this.f22004a;
        HashSet hashSet = multiSelectListPreferenceDialogFragmentCompat.R0;
        if (z10) {
            multiSelectListPreferenceDialogFragmentCompat.S0 = hashSet.add(multiSelectListPreferenceDialogFragmentCompat.U0[i].toString()) | multiSelectListPreferenceDialogFragmentCompat.S0;
        } else {
            multiSelectListPreferenceDialogFragmentCompat.S0 = hashSet.remove(multiSelectListPreferenceDialogFragmentCompat.U0[i].toString()) | multiSelectListPreferenceDialogFragmentCompat.S0;
        }
    }
}
