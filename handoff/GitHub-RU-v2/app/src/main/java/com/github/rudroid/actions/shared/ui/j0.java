package com.github.rudroid.actions.shared.ui;

import androidx.compose.runtime.f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class j0 extends k71.l implements j71.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f1 f5266s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y3.m f5267t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(f1 f1Var, y3.m mVar) {
        super(0);
        this.f5266s = f1Var;
        this.f5267t = mVar;
    }

    public final Object a() {
        this.f5266s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
        this.f5267t.f34224u = true;
        return w61.a0.a;
    }
}
