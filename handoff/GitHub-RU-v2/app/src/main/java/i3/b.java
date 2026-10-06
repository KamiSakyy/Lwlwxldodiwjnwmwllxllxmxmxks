package i3;

import android.text.TextPaint;
import com.google.android.gms.internal.measurement.b4;

/* loaded from: /home/user/work/p/classes.dex */
public class b extends b4 {

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f25771x;

    /* renamed from: y, reason: collision with root package name */
    public TextPaint f25772y;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f25771x = charSequence;
        this.f25772y = textPaint;
    }

    public final int X(int i) {
        CharSequence charSequence = this.f25771x;
        return this.f25772y.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    public final int b0(int i) {
        CharSequence charSequence = this.f25771x;
        return this.f25772y.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
