package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l4 {
    public static final x.e a = new x.e(0);

    public static synchronized Uri a() {
        synchronized (l4.class) {
            x.e eVar = a;
            Uri uri = (Uri) eVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            eVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
