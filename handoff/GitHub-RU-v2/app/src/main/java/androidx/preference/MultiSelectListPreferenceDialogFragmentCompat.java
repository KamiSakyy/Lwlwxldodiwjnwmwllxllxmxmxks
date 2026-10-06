package androidx.preference;

import android.os.Bundle;
import b21.v;
import e7.h;
import java.util.ArrayList;
import java.util.HashSet;
import k.d;

/* loaded from: /home/user/work/p/classes.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public final HashSet R0 = new HashSet();
    public boolean S0;
    public CharSequence[] T0;
    public CharSequence[] U0;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void C4(boolean z10) {
        if (z10 && this.S0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A4();
            HashSet hashSet = this.R0;
            multiSelectListPreference.c(hashSet);
            multiSelectListPreference.H(hashSet);
        }
        this.S0 = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void D4(v vVar) {
        int length = this.U0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.R0.contains(this.U0[i].toString());
        }
        CharSequence[] charSequenceArr = this.T0;
        h hVar = new h(this);
        d dVar = (d) vVar.t;
        dVar.f27422n = charSequenceArr;
        dVar.f27430v = hVar;
        dVar.f27426r = zArr;
        dVar.f27427s = true;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.a0
    public final void P3(Bundle bundle) {
        super.P3(bundle);
        HashSet hashSet = this.R0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.S0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.T0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.U0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A4();
        CharSequence[] charSequenceArr = multiSelectListPreference.f2977l0;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.f2978m0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.f2979n0);
        this.S0 = false;
        this.T0 = multiSelectListPreference.f2977l0;
        this.U0 = charSequenceArr2;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.a0
    public final void Z3(Bundle bundle) {
        super.Z3(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.R0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.S0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.T0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.U0);
    }

    public <T0> T0 A4(Object... a) {
        return null;
    }
}
