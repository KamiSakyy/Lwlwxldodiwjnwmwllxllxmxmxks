package com.github.rudroid.utilities;

import android.content.Context;
import android.content.Intent;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 {
    public static String a(String str) {
        k71.k.g(str, "input");
        return (String) x61.m.e0(t71.p.f0(str, new char[]{'/'}, 6));
    }

    public static final String b(int i) {
        if (Math.abs(i) >= 1000000) {
            String format = new DecimalFormat("0.#m").format(i / 1000000.0d);
            k71.k.f(format, "format(...)");
            return format;
        }
        if (Math.abs(i) < 1000) {
            return String.valueOf(i);
        }
        String format2 = new DecimalFormat("0.#k").format(i / 1000.0d);
        k71.k.f(format2, "format(...)");
        return format2;
    }

    public static boolean c(String str) {
        k71.k.g(str, "input");
        t71.o oVar = t71.o.s;
        Pattern compile = Pattern.compile("^\\-?[a-z0-9][a-z0-9\\-\\_]*$", 66);
        k71.k.f(compile, "compile(...)");
        return compile.matcher(str).matches();
    }

    public static void d(Context context, String str) {
        String string = context.getString(2131953210);
        k71.k.f(string, "getString(...)");
        k71.k.g(str, "content");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        context.startActivity(Intent.createChooser(intent, string));
    }
    public static Object p(Object p1, Object p2) { return null; }
}
