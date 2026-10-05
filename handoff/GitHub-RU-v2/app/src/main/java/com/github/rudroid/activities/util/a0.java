package com.github.rudroid.activities.util;

import android.content.Context;
import android.content.Intent;

/* loaded from: /home/user/work/p/classes.dex */
public final class a0 extends e<Intent, h.a> {
    @Override // com.github.rudroid.activities.util.e
    public final Intent R(Context context, Object obj) {
        Intent intent = (Intent) obj;
        k71.k.g(intent, "input");
        return intent;
    }

    @Override // y9.a
    public final Object y(Intent intent, int i) {
        return new h.a(intent, i);
    }
}
