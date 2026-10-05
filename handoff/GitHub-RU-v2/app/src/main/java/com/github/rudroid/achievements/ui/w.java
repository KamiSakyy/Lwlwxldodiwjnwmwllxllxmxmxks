package com.github.rudroid.achievements.ui;

import android.hardware.SensorManager;

/* loaded from: /home/user/work/p/classes.dex */
public final class w implements androidx.compose.runtime.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f4616a;

    public w(l lVar) {
        this.f4616a = lVar;
    }

    @Override // androidx.compose.runtime.i0
    public final void a() {
        l lVar = this.f4616a;
        ((SensorManager) lVar.f4532a.getValue()).unregisterListener(lVar);
    }
}
