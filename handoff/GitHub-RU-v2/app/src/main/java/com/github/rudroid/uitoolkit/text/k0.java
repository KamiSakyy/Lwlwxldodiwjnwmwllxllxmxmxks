package com.github.rudroid.uitoolkit.text;

import android.view.KeyEvent;

/* loaded from: /home/user/work/p/classes3.dex */
final class k0 implements j71.c {
    public static final k0 r = new k0();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (o2.c.c(r5) == 1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        KeyEvent keyEvent = ((o2.b) obj).a;
        k71.k.g(keyEvent, "$v$c$androidx-compose-ui-input-key-KeyEvent$-keyEvent$0");
        boolean z = o2.a.a(o2.c.a(keyEvent.getKeyCode()), o2.a.t);
        return Boolean.valueOf(z);
    }
}
