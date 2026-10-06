package j3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: /home/user/work/p/classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27001a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27002b;

    public k(boolean z10, boolean z11) {
        this.f27001a = z10;
        this.f27002b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f27001a);
        textPaint.setStrikeThruText(this.f27002b);
    }
}
