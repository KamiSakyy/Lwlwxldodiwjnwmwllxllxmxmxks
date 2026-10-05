package com.github.rudroid.widget.shortcuts;

import com.github.domain.shortcuts.model.StoredShortcutModel;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class v implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ z5.n s;
    public final /* synthetic */ StoredShortcutModel t;

    public /* synthetic */ v(z5.n nVar, StoredShortcutModel storedShortcutModel, int i, int i2) {
        this.r = i2;
        this.s = nVar;
        this.t = storedShortcutModel;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a0.b(this.s, this.t, sVar, androidx.compose.runtime.t.L(1));
                break;
            default:
                a0.a(this.s, this.t, sVar, androidx.compose.runtime.t.L(1));
                break;
        }
        return w61.a0.a;
    }
}
