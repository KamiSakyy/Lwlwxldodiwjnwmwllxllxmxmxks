package com.github.rudroid.di;

import android.os.Build;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes.dex */
public final class l implements p61.d {

    public static final class a {
    }

    public static String a() {
        String g7 = x.i.g("GitHub/1.257.0 (com.github.rudroid; build:925; Android ", Build.VERSION.RELEASE, "; ", Build.MODEL, ")");
        k71.k.g(g7, "input");
        Pattern compile = Pattern.compile("[^\\u0020-\\u007e\\t]");
        k71.k.f(compile, "compile(...)");
        String replaceAll = compile.matcher(g7).replaceAll("");
        k71.k.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Object get() {
        return a();
    }
}
