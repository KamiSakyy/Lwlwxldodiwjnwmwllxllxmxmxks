package com.github.rudroid.utilities;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t2 extends ClickableSpan {
    public final /* synthetic */ j71.c r;
    public final /* synthetic */ String s;

    public t2(j71.c cVar, String str) {
        this.r = cVar;
        this.s = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        k71.k.g(view, "widget");
        this.r.k(this.s);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k71.k.g(textPaint, "ds");
    }
}
