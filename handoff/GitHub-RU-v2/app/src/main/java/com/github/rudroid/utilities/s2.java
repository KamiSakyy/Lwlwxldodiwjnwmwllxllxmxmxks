package com.github.rudroid.utilities;

import android.content.Context;
import android.text.ParcelableSpan;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import kotlin.NoWhenBranchMatchedException;
import lg.g;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s2 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final /* synthetic */ a[] v;

        static {
            a aVar = new a("Bold", 0);
            r = aVar;
            a aVar2 = new a("Medium", 1);
            s = aVar2;
            a aVar3 = new a("Monospace", 2);
            t = aVar3;
            a aVar4 = new a("Strikethrough", 3);
            u = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            v = aVarArr;
            v8.l0.t(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) v.clone();
        }
    }

    public static final /* synthetic */ class b {
        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a aVar = a.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a aVar2 = a.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a aVar3 = a.r;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Context context, int i, String str, boolean z) {
        k71.k.g(context, "context");
        k71.k.g(str, "target");
        d(spannableStringBuilder, str, new ForegroundColorSpan(context.getColor(i)), z);
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, Context context, String str, int i, int i2) {
        k71.k.g(context, "context");
        k71.k.g(str, "textToAddBackground");
        int V = t71.p.V(6, spannableStringBuilder, str);
        if (V >= 0) {
            int length = str.length() + V;
            int a2 = lg.i.a(spannableStringBuilder, V, length, 2) + length;
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, i2), V, a2, 17);
            spannableStringBuilder.setSpan(new g.a(context, i), V, a2, 17);
        }
    }

    public static void d(Spannable spannable, String str, ParcelableSpan parcelableSpan, boolean z) {
        if (t71.p.T(str)) {
            return;
        }
        int V = z ? t71.p.V(6, spannable, str) : t71.p.R(spannable, str, 0, false, 6);
        if (V >= 0) {
            spannable.setSpan(parcelableSpan, V, str.length() + V, 17);
        }
    }

    public static void e(Spannable spannable, Context context, a aVar, String str, boolean z) {
        TextAppearanceSpan textAppearanceSpan;
        ParcelableSpan parcelableSpan;
        k71.k.g(spannable, "<this>");
        k71.k.g(context, "context");
        k71.k.g(aVar, "style");
        k71.k.g(str, "target");
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            textAppearanceSpan = new TextAppearanceSpan(context, 2132017459);
        } else if (ordinal == 1) {
            textAppearanceSpan = new TextAppearanceSpan(context, 2132017558);
        } else {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                parcelableSpan = new StrikethroughSpan();
                d(spannable, str, parcelableSpan, z);
            }
            textAppearanceSpan = new TextAppearanceSpan(context, 2132017561);
        }
        parcelableSpan = textAppearanceSpan;
        d(spannable, str, parcelableSpan, z);
    }

    public static /* synthetic */ void f(Spannable spannable, Context context, a aVar, String str, int i) {
        if ((i & 4) != 0) {
            str = spannable.toString();
        }
        e(spannable, context, aVar, str, false);
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, String str, j71.c cVar) {
        int R;
        k71.k.g(str, "textToLink");
        if (!t71.p.T(str) && (R = t71.p.R(spannableStringBuilder, str, 0, false, 6)) >= 0) {
            spannableStringBuilder.setSpan(new t2(cVar, str), R, str.length() + R, 17);
        }
    }
}
