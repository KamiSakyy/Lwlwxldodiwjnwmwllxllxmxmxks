package com.github.rudroid.html;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.ParcelableSpan;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BulletSpan;
import android.text.style.QuoteSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.github.rudroid.utilities.a1;
import k71.k;
import sd.e;
import t71.p;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final td.b f15133a;

    public interface a {
        void d(View view, String str);
    }

    public b(a1 a1Var) {
        k.g(a1Var, "unfurledSVGProvider");
        this.f15133a = a1Var;
    }

    public static void a(b bVar, TextView textView, String str, a aVar, boolean z10, int i) {
        TextView.BufferType bufferType = TextView.BufferType.NORMAL;
        boolean z11 = false;
        boolean z12 = (i & 8) != 0 ? false : z10;
        boolean z13 = (i & 16) == 0;
        if ((i & 32) != 0) {
            bufferType = TextView.BufferType.SPANNABLE;
        }
        bVar.getClass();
        k.g(textView, "view");
        k.g(bufferType, "bufferType");
        Object[] objArr = null;
        if (aVar != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            textView.setMovementMethod(null);
        }
        if (str == null || p.T(str)) {
            textView.setText("");
            return;
        }
        Object tag = textView.getTag(2131362913);
        rd.b bVar2 = tag instanceof rd.b ? (rd.b) tag : null;
        if (bVar2 == null) {
            bVar2 = new rd.b(textView, z13);
        }
        Object tag2 = textView.getTag(2131363392);
        com.github.rudroid.html.a aVar2 = tag2 instanceof com.github.rudroid.html.a ? (com.github.rudroid.html.a) tag2 : null;
        if (aVar2 == null) {
            Context context = textView.getContext();
            k.f(context, "getContext(...)");
            aVar2 = new com.github.rudroid.html.a(context, bVar.f15133a);
        }
        aVar2.f15089c = z12;
        textView.setTag(2131362913, bVar2);
        textView.setTag(2131363392, aVar2);
        Context context2 = textView.getContext();
        k.f(context2, "getContext(...)");
        Spanned fromHtml = Html.fromHtml(str, 0, bVar2, aVar2);
        k.f(fromHtml, "fromHtml(...)");
        if (fromHtml instanceof Spannable) {
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            if (spans != null) {
                int length = (spans.length / 2) - 1;
                if (length >= 0) {
                    int length2 = spans.length - 1;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj = spans[i10];
                            spans[i10] = spans[length2];
                            spans[length2] = obj;
                            length2--;
                            if (i10 == length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                objArr = spans;
            }
            if (objArr != null) {
                int length3 = objArr.length;
                int i11 = 0;
                while (i11 < length3) {
                    Object obj2 = objArr[i11];
                    if (obj2 instanceof QuoteSpan) {
                        Spannable spannable = (Spannable) fromHtml;
                        ParcelableSpan parcelableSpan = (ParcelableSpan) obj2;
                        spannable.setSpan(new sd.b(context2), spannable.getSpanStart(parcelableSpan), spannable.getSpanEnd(parcelableSpan), spannable.getSpanFlags(parcelableSpan));
                        spannable.removeSpan(parcelableSpan);
                    } else if (obj2 instanceof URLSpan) {
                        boolean z14 = fromHtml.charAt(fromHtml.getSpanStart(obj2)) == '@' ? true : z11;
                        Spannable spannable2 = (Spannable) fromHtml;
                        String url = ((URLSpan) obj2).getURL();
                        k.f(url, "getURL(...)");
                        ParcelableSpan parcelableSpan2 = (ParcelableSpan) obj2;
                        spannable2.setSpan(new e(context2, url, aVar, z14), spannable2.getSpanStart(parcelableSpan2), spannable2.getSpanEnd(parcelableSpan2), spannable2.getSpanFlags(parcelableSpan2));
                        spannable2.removeSpan(parcelableSpan2);
                    } else if (obj2 instanceof BulletSpan) {
                        Spannable spannable3 = (Spannable) fromHtml;
                        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(2131165316);
                        int color = context2.getColor(2131100998);
                        ParcelableSpan parcelableSpan3 = (ParcelableSpan) obj2;
                        spannable3.setSpan(Build.VERSION.SDK_INT >= 28 ? sd.c.a(dimensionPixelSize, color, context2.getResources().getDimensionPixelSize(2131166284)) : new BulletSpan(dimensionPixelSize, color), spannable3.getSpanStart(parcelableSpan3), spannable3.getSpanEnd(parcelableSpan3), spannable3.getSpanFlags(parcelableSpan3));
                        spannable3.removeSpan(parcelableSpan3);
                    }
                    i11++;
                    z11 = false;
                }
            }
        }
        CharSequence t02 = p.t0(fromHtml);
        k.e(t02, "null cannot be cast to non-null type android.text.Spannable");
        textView.setText((Spannable) t02, bufferType);
    }
}
