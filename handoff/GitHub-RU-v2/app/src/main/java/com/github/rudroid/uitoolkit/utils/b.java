package com.github.rudroid.uitoolkit.utils;

import android.graphics.Color;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static long a(String str) {
        long j = d2.t.j;
        if (str.length() == 0) {
            return j;
        }
        try {
            return d2.a0Shadow.c(Color.parseColor(str));
        } catch (Exception unused) {
            return j;
        }
    }
}
