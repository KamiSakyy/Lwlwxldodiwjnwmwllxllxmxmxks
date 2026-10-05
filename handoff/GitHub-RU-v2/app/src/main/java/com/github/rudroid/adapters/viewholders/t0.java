package com.github.rudroid.adapters.viewholders;

import android.view.View;
import yz0.r5;
import yz0.u6;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class t0 implements View.OnClickListener {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6187r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.interfaces.w f6188s;

    public /* synthetic */ t0(com.github.rudroid.interfaces.w wVar, int i) {
        this.f6187r = i;
        this.f6188s = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6187r;
        com.github.rudroid.interfaces.w wVar = this.f6188s;
        switch (i) {
            case k5.f.J /* 0 */:
                int i10 = u0.f6197v;
                Object tag = view.getTag();
                if (tag instanceof r5) {
                    r5 r5Var = (r5) tag;
                    wVar.I1(r5Var.e(), r5Var.b(), r5Var.k());
                    break;
                }
                break;
            default:
                int i11 = k1.f6069v;
                Object tag2 = view.getTag();
                if (tag2 instanceof u6) {
                    u6 u6Var = (u6) tag2;
                    wVar.I1(u6Var.d, u6Var.e, u6Var.c);
                    break;
                }
                break;
        }
    }
}
