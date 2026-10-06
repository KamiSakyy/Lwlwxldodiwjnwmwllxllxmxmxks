package o31;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public float c;
    public float d;
    public WeakReference f;
    public r31.d g;
    public final TextPaint a = new TextPaint(1);
    public final i31.b b = new i31.b(1, this);
    public boolean e = true;

    public m(l lVar) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(lVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void b(r31.d dVar, Context context) {
        if (this.g != dVar) {
            this.g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.a;
                i31.b bVar = this.b;
                dVar.e(context, textPaint, bVar);
                l lVar = (l) this.f.get();
                if (lVar != null) {
                    textPaint.drawableState = lVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                this.e = true;
            }
            l lVar2 = (l) this.f.get();
            if (lVar2 != null) {
                lVar2.a();
                lVar2.onStateChange(lVar2.getState());
            }
        }
    }
}
