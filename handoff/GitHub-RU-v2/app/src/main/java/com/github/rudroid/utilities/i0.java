package com.github.rudroid.utilities;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 {
    public static final t71.n a = new t71.n(":[^:\\s]*(?:::[^:\\s]*)*:");

    public static final void a(SpannableStringBuilder spannableStringBuilder, TextView textView) {
        k71.k.g(spannableStringBuilder, "<this>");
        k71.k.g(textView, "view");
        b(textView, spannableStringBuilder.toString(), spannableStringBuilder);
    }

    public static final void b(TextView textView, String str, Spannable spannable) {
        k71.k.g(textView, "view");
        k71.k.g(str, "text");
        k71.k.g(spannable, "spannable");
        Context context = textView.getContext();
        k71.k.f(context, "getContext(...)");
        a.f(str, new androidx.compose.foundation.layout.k2(textView, g9.a.a(context), textView.getResources().getDimensionPixelSize(2131165323), spannable, 2));
    }
}
