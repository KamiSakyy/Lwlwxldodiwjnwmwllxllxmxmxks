package com.github.rudroid.projects.ui;

import android.view.KeyEvent;

/* loaded from: /home/user/work/p/classes.dex */
final class q implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j71.a f18306r;

    public q(j71.a aVar) {
        this.f18306r = aVar;
    }

    public final Object k(Object obj) {
        boolean z10;
        KeyEvent keyEvent = ((o2.b) obj).f29963a;
        k71.k.g(keyEvent, "$v$c$androidx-compose-ui-input-key-KeyEvent$-keyEvent$0");
        if (keyEvent.isShiftPressed() && o2.a.a(o2.c.a(keyEvent.getKeyCode()), o2.a.l)) {
            this.f18306r.a();
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
