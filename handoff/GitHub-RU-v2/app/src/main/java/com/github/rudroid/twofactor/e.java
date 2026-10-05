package com.github.rudroid.twofactor;

import android.view.KeyEvent;
import com.github.rudroid.twofactor.TwoFactorActivity;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ KeyEvent.Callback s;

    public /* synthetic */ e(KeyEvent.Callback callback, int i) {
        this.r = i;
        this.s = callback;
    }

    public final Object a() {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        com.github.rudroid.activities.t tVar = this.s;
        switch (i) {
            case 0:
                TwoFactorActivity.a aVar = TwoFactorActivity.Companion;
                ((TwoFactorActivity) tVar).finish();
                break;
            default:
                TwoFactorDialog twoFactorDialog = (TwoFactorDialog) tVar;
                twoFactorDialog.z.a();
                twoFactorDialog.A.setValue(Boolean.FALSE);
                break;
        }
        return a0Var;
    }
}
