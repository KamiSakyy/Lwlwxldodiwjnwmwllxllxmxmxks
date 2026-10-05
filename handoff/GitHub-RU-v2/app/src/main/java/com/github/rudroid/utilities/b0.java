package com.github.rudroid.utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    public static final void a(Drawable drawable, Context context, int i) {
        drawable.mutate();
        drawable.setTint(context.getColor(i));
    }
}
