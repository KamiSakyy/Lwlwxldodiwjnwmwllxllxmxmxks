package com.github.rudroid.uitoolkit.extensions;

import android.view.KeyEvent;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
class b implements j71.c {
    public final /* synthetic */ j71.c r;

    public b(j71.c cVar) {
        this.r = cVar;
    }

    public final Object k(Object obj) {
        KeyEvent keyEvent = ((o2.b) obj).a;
        k.g(keyEvent, "$v$c$androidx-compose-ui-input-key-KeyEvent$-keyEvent$0");
        if (o2.c.c(keyEvent) != 1) {
            return Boolean.FALSE;
        }
        return (Boolean) this.r.k(new o2.b(keyEvent));
    }
}
