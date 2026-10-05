package com.github.rudroid.utilities;

import com.github.service.models.response.type.DiffLineType;
import yz0.u7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public static final String a(yz0.b1 b1Var) {
        k71.k.g(b1Var, "<this>");
        String str = b1Var.a;
        if (b1Var.c == DiffLineType.INJECTED_CONTEXT) {
            int i = (str.length() <= 0 || str.charAt(0) != '~') ? (str.length() > 1 && str.charAt(1) == '~' && str.charAt(0) == 8203) ? 1 : -1 : 0;
            if (i >= 0) {
                boolean z = t71.p.Q(str, ' ', i, 4) == i + 1;
                StringBuilder sb = new StringBuilder(str);
                sb.deleteCharAt(i);
                if (z) {
                    sb.insert(i, ' ');
                }
                String sb2 = sb.toString();
                k71.k.d(sb2);
                return sb2;
            }
        }
        return str;
    }

    public static final String b(u7 u7Var) {
        String str = u7Var.a;
        if (u7Var.c == DiffLineType.INJECTED_CONTEXT) {
            int i = (str.length() <= 0 || str.charAt(0) != '~') ? (str.length() > 1 && str.charAt(1) == '~' && str.charAt(0) == 8203) ? 1 : -1 : 0;
            if (i >= 0) {
                boolean z = t71.p.Q(str, ' ', i, 4) == i + 1;
                StringBuilder sb = new StringBuilder(str);
                sb.deleteCharAt(i);
                if (z) {
                    sb.insert(i, ' ');
                }
                String sb2 = sb.toString();
                k71.k.d(sb2);
                return sb2;
            }
        }
        return str;
    }

    public static final String c(yz0.b1 b1Var) {
        String str = b1Var.i;
        return (t71.w.F(str, "-", false) || t71.w.F(str, "+", false) || t71.w.F(str, "~", false)) ? t71.p.K(str, 1) : str;
    }

    public static final String d(u7 u7Var) {
        String str = u7Var.f;
        return (t71.w.F(str, "-", false) || t71.w.F(str, "+", false) || t71.w.F(str, "~", false)) ? t71.p.K(str, 1) : str;
    }
}
