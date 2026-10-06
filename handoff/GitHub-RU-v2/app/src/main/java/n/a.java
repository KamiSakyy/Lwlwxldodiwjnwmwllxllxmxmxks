package n;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements TransformationMethod {

    /* renamed from: r, reason: collision with root package name */
    public Locale f29238r;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f29238r);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i, Rect rect) {
    }
    public a(Object p1, Object p2) {
    }
}
