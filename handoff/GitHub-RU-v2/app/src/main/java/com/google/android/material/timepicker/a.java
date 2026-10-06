package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import o31.n;
import q.pShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends n {
    public final /* synthetic */ ChipTextInputComboView r;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.r = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.r;
        if (isEmpty) {
            chipTextInputComboView.r.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        CharSequence a = ChipTextInputComboView.a(chipTextInputComboView, editable);
        pShadow pVar = chipTextInputComboView.r;
        if (TextUtils.isEmpty(a)) {
            a = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        pVar.setText(a);
    }
}
