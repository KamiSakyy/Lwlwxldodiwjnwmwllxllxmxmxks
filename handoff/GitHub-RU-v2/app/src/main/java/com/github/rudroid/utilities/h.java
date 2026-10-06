package com.github.rudroid.utilities;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static void a(AppBarLayout appBarLayout, String str, String str2) {
        LinearLayout linearLayout = (LinearLayout) appBarLayout.findViewById(2131363449);
        if (linearLayout != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2 == null ? "" : str2);
            sb.append(" ");
            sb.append(str == null ? "" : str);
            sb.append(" ");
            sb.append("");
            linearLayout.setContentDescription(sb.toString());
            if (Build.VERSION.SDK_INT >= 28) {
                linearLayout.setAccessibilityHeading(true);
            }
            linearLayout.setVisibility(((str == null || t71.p.T(str)) && (str2 == null || t71.p.T(str2))) ? 8 : 0);
        }
        TextView textView = (TextView) appBarLayout.findViewById(2131363450);
        if (textView != null) {
            textView.setText(str != null ? str : "");
            appBarLayout.setImportantForAccessibility(0);
            i0.b(textView, r6, new SpannableStringBuilder(str == null ? "" : str));
            textView.setVisibility((str == null || t71.p.T(str)) ? 8 : 0);
            if (Build.VERSION.SDK_INT >= 28) {
                appBarLayout.setAccessibilityHeading(true);
            }
        }
        TextView textView2 = (TextView) appBarLayout.findViewById(2131363447);
        if (textView2 != null) {
            textView2.setText(str2 != null ? str2 : "");
            textView2.setVisibility((str2 == null || t71.p.T(str2)) ? 8 : 0);
            appBarLayout.setImportantForAccessibility(0);
        }
        TextView textView3 = (TextView) appBarLayout.findViewById(2131363448);
        if (textView3 != null) {
            textView3.setText("");
            textView3.setVisibility(8);
            appBarLayout.setImportantForAccessibility(0);
        }
    }
    public Object c(Object p1, Object p2) { return null; }
    public Object c(Object, Object) { return null; }
    public Object c(Object, Object) { return null; }
}
