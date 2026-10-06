package q;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public TextView f30720a;

    /* renamed from: b, reason: collision with root package name */
    public s21.a f30721b;

    public t(TextView textView) {
        this.f30720a = textView;
        this.f30721b = new s21.a(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((sy.p) this.f30721b.s).l(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f30720a.getContext().obtainStyledAttributes(attributeSet, j.a.i, i, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z10) {
        ((sy.p) this.f30721b.s).r(z10);
    }

    public final void d(boolean z10) {
        ((sy.p) this.f30721b.s).s(z10);
    }
}
