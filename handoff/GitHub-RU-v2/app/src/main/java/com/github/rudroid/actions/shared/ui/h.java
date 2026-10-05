package com.github.rudroid.actions.shared.ui;

import androidx.compose.runtime.f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends k71.l implements j71.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f1 f5252s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y3.m f5253t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f1 f1Var, y3.m mVar) {
        super(0);
        this.f5252s = f1Var;
        this.f5253t = mVar;
    }

    public final Object a() {
        this.f5252s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
        this.f5253t.f34224u = true;
        return w61.a0.a;
    }
}
