package com.github.rudroid.utilities;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u2 {
    public static final void a(TextView textView, int i) {
        k71.k.g(textView, "<this>");
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(i));
    }

    public static final void b(TextView textView, Drawable drawable) {
        k71.k.g(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], drawable, textView.getCompoundDrawablesRelative()[3]);
    }

    public static final void c(TextView textView, Drawable drawable) {
        k71.k.g(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
    }
}
