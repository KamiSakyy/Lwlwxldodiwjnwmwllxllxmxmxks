package sd;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import k71.k;
import q4.l;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends TypefaceSpan {

    /* renamed from: r, reason: collision with root package name */
    public int f31978r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super("monospace");
        k.g(context, "context");
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = l.f30960a;
        this.f31978r = resources.getColor(2131099788, theme);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k.g(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.bgColor = this.f31978r;
    }
}
