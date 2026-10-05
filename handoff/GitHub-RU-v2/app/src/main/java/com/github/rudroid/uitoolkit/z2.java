package com.github.rudroid.uitoolkit;

import android.view.KeyEvent;

/* loaded from: /home/user/work/p/classes3.dex */
final class z2 implements j71.c {
    public final /* synthetic */ j71.a r;

    public z2(j71.a aVar) {
        this.r = aVar;
    }

    public final Object k(Object obj) {
        KeyEvent keyEvent = ((o2.b) obj).a;
        k71.k.g(keyEvent, "$v$c$androidx-compose-ui-input-key-KeyEvent$-it$0");
        if (keyEvent.getKeyCode() != 66) {
            return Boolean.FALSE;
        }
        this.r.a();
        return Boolean.TRUE;
    }
}
