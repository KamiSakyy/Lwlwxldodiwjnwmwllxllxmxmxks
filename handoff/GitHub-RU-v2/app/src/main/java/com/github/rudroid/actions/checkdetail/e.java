package com.github.rudroid.actions.checkdetail;

import androidx.compose.runtime.f1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class e implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4658r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f1 f4659s;

    public /* synthetic */ e(f1 f1Var, int i) {
        this.f4658r = i;
        this.f4659s = f1Var;
    }

    public final Object a() {
        switch (this.f4658r) {
            case k5.f.J /* 0 */:
                this.f4659s.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f4659s.setValue(Boolean.TRUE);
                break;
            default:
                this.f4659s.setValue(Boolean.FALSE);
                break;
        }
        return w61.a0.a;
    }
}
