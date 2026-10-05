package com.github.rudroid.activities;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: /home/user/work/p/classes.dex */
public final class s implements TextWatcher {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BaseEditTitleFragment f5896r;

    public s(BaseEditTitleFragment baseEditTitleFragment) {
        this.f5896r = baseEditTitleFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f5896r.I4(false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
