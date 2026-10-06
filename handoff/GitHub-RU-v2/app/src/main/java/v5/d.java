package v5;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public TextView f32724a;

    /* renamed from: b, reason: collision with root package name */
    public c f32725b;

    public d(TextView textView) {
        this.f32724a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f32724a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int c10 = u5.i.a().c();
        if (c10 != 0) {
            if (c10 == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i10);
                }
                return u5.i.a().h(0, charSequence.length(), 0, charSequence);
            }
            if (c10 != 3) {
                return charSequence;
            }
        }
        u5.i a10 = u5.i.a();
        if (this.f32725b == null) {
            this.f32725b = new c(textView, this);
        }
        a10.i(this.f32725b);
        return charSequence;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c {
        public c() {
        }
    }
}
