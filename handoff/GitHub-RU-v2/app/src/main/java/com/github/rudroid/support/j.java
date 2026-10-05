package com.github.rudroid.support;

import android.text.Editable;
import android.text.TextWatcher;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements TextWatcher {
    public final /* synthetic */ SupportFragment r;

    public j(SupportFragment supportFragment) {
        this.r = supportFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        s J4 = this.r.J4();
        String valueOf = String.valueOf(charSequence);
        J4.z = valueOf;
        y1 y1Var = J4.y;
        y1Var.getClass();
        y1Var.k((Object) null, valueOf);
    }
}
