package com.github.rudroid.shortcuts.activities;

import androidx.lifecycle.o1;
import androidx.lifecycle.u1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 implements j71.c {
    public final /* synthetic */ ShortcutViewFragment r;
    public final /* synthetic */ Object s;

    public s0(ShortcutViewFragment shortcutViewFragment, w61.h hVar) {
        this.r = shortcutViewFragment;
        this.s = hVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, w61.h] */
    public final Object k(Object obj) {
        o1 f0;
        k71.k.g((androidx.lifecycle.a1) obj, "<unused var>");
        androidx.lifecycle.r rVar = (u1) this.s.getValue();
        androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
        return (rVar2 == null || (f0 = rVar2.f0()) == null) ? this.r.f0() : f0;
    }
}
