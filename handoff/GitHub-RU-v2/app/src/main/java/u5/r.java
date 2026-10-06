package u5;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/user/work/p/classes.dex */
public final class r implements TextWatcher, SpanWatcher {

    /* renamed from: r, reason: collision with root package name */
    public Object f32242r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicInteger f32243s = new AtomicInteger(0);

    public r(Object obj) {
        this.f32242r = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f32242r).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        ((TextWatcher) this.f32242r).beforeTextChanged(charSequence, i, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i10) {
        if (this.f32243s.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f32242r).onSpanAdded(spannable, obj, i, i10);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.f32243s.get() <= 0 || !(obj instanceof u)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i10) {
                    i = 0;
                }
                if (i11 > i12) {
                    i13 = i;
                    i14 = 0;
                    ((SpanWatcher) this.f32242r).onSpanChanged(spannable, obj, i13, i10, i14, i12);
                }
            }
            i13 = i;
            i14 = i11;
            ((SpanWatcher) this.f32242r).onSpanChanged(spannable, obj, i13, i10, i14, i12);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i10) {
        if (this.f32243s.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f32242r).onSpanRemoved(spannable, obj, i, i10);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        ((TextWatcher) this.f32242r).onTextChanged(charSequence, i, i10, i11);
    }
}
