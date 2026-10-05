package y31;

import android.text.Editable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends o31.n {
    public final /* synthetic */ l r;

    public j(l lVar) {
        this.r = lVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.r.b().a();
    }

    @Override // o31.n, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.r.b().b();
    }
}
