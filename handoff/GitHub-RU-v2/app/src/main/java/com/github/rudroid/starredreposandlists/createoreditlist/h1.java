package com.github.rudroid.starredreposandlists.createoreditlist;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 extends com.github.rudroid.activities.util.e<String, xz0.h> {
    public static final a Companion = new a();

    public static final class a {
    }

    public final Intent R(Context context, Object obj) {
        String str = (String) obj;
        k71.k.g(str, "input");
        EditListActivity.Companion.getClass();
        Intent intent = new Intent(context, (Class<?>) EditListActivity.class);
        intent.putExtra("EXTRA_SLUG", str);
        return intent;
    }

    public final Object y(Intent intent, int i) {
        Parcelable parcelable;
        if ((intent == null && i != -1) || intent == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = (Parcelable) intent.getParcelableExtra("EXTRA_USER_LIST_METADATA", xz0.h.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_USER_LIST_METADATA");
            parcelable = (xz0.h) (parcelableExtra instanceof xz0.h ? parcelableExtra : null);
        }
        return (xz0.h) parcelable;
    }
}
