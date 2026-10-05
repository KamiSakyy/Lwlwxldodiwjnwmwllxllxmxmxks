package com.github.rudroid.starredreposandlists.createoreditlist;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.github.rudroid.starredreposandlists.listdetails.ListDetailActivity;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 extends com.github.rudroid.activities.util.e<e1, xz0.h> {
    public static final a Companion = new a();

    public static final class a {
    }

    public final Intent R(Context context, Object obj) {
        e1 e1Var = (e1) obj;
        k71.k.g(e1Var, "input");
        ListDetailActivity.a aVar = ListDetailActivity.Companion;
        String str = e1Var.a;
        String str2 = e1Var.b;
        aVar.getClass();
        k71.k.g(str, "login");
        k71.k.g(str2, "slug");
        Intent intent = new Intent(context, (Class<?>) ListDetailActivity.class);
        intent.putExtra("EXTRA_LOGIN", str);
        intent.putExtra("EXTRA_SLUG", str2);
        return intent;
    }

    public final Object y(Intent intent, int i) {
        Parcelable parcelable;
        if (i != -1 || intent == null) {
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
