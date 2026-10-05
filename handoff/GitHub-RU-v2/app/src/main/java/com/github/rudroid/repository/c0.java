package com.github.rudroid.repository;

import android.view.KeyEvent;

/* loaded from: /home/user/work/p/classes.dex */
final class c0 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j71.a f19281r;

    public c0(j71.a aVar) {
        this.f19281r = aVar;
    }

    public final Object k(Object obj) {
        boolean z10;
        KeyEvent keyEvent = ((o2.b) obj).f29963a;
        k71.k.g(keyEvent, "$v$c$androidx-compose-ui-input-key-KeyEvent$-keyEvent$0");
        if (o2.a.a(o2.c.a(keyEvent.getKeyCode()), o2.a.f29956t)) {
            z10 = true;
            if (o2.c.c(keyEvent) != 1) {
                this.f19281r.a();
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
