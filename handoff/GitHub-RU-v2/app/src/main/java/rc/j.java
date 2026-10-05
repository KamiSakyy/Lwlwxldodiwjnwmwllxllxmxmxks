package rc;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes.dex */
public final class j extends ClickableSpan {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TextView f31356r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w61.k f31357s;

    public j(TextView textView, w61.k kVar) {
        this.f31356r = textView;
        this.f31357s = kVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        k71.k.g(view, "view");
        view.invalidate();
        ((View.OnClickListener) this.f31357s.s).onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k71.k.g(textPaint, "textPaint");
        this.f31356r.invalidate();
    }
}
