package com.github.rudroid.settings.codeoptions;

import a5.g1;
import android.text.Spannable;
import android.text.style.CharacterStyle;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 {
    public static final g3.g a(Spannable spannable) {
        g3.d dVar = new g3.d(spannable.toString());
        d71.b bVar = i0.s;
        bVar.getClass();
        g1 g1Var = new g1(8, bVar);
        while (g1Var.hasNext()) {
            i0 i0Var = (i0) g1Var.next();
            Object[] spans = spannable.getSpans(0, spannable.length(), i0Var.b());
            k71.k.f(spans, "getSpans(...)");
            for (Object obj : spans) {
                CharacterStyle characterStyle = (CharacterStyle) obj;
                k71.k.d(characterStyle);
                i0Var.a(characterStyle, spannable.getSpanStart(characterStyle), spannable.getSpanEnd(characterStyle), dVar);
            }
        }
        return dVar.k();
    }
}
