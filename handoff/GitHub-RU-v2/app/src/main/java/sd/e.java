package sd;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.github.rudroid.html.b;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class e extends URLSpan {

    /* renamed from: r, reason: collision with root package name */
    public b.a f31983r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f31984s;

    /* renamed from: t, reason: collision with root package name */
    public int f31985t;

    /* renamed from: u, reason: collision with root package name */
    public int f31986u;

    public e(Context context, String str, b.a aVar, boolean z10) {
        super(str);
        this.f31983r = aVar;
        this.f31984s = z10;
        this.f31985t = context.getColor(2131099993);
        this.f31986u = context.getColor(2131100995);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        k.g(view, "widget");
        b.a aVar = this.f31983r;
        if (aVar != null) {
            String url = getURL();
            k.f(url, "getURL(...)");
            aVar.d(view, url);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k.g(textPaint, "textPaint");
        boolean z10 = this.f31984s;
        textPaint.setColor(z10 ? this.f31986u : this.f31985t);
        textPaint.setFakeBoldText(z10);
        textPaint.setUnderlineText(!z10);
    }
}
