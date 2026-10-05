package u5;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import z70.m2;

/* loaded from: /home/user/work/p/classes.dex */
public final class w implements Spannable {

    /* renamed from: r, reason: collision with root package name */
    public boolean f32255r = false;

    /* renamed from: s, reason: collision with root package name */
    public Spannable f32256s;

    public w(Spannable spannable) {
        this.f32256s = spannable;
    }

    public final void a() {
        Spannable spannable = this.f32256s;
        if (!this.f32255r) {
            if ((Build.VERSION.SDK_INT < 28 ? new m2(8) : new v(8)).a(spannable)) {
                this.f32256s = new SpannableString(spannable);
            }
        }
        this.f32255r = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f32256s.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f32256s.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f32256s.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f32256s.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f32256s.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f32256s.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i10, Class cls) {
        return this.f32256s.getSpans(i, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f32256s.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i10, Class cls) {
        return this.f32256s.nextSpanTransition(i, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f32256s.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i10, int i11) {
        a();
        this.f32256s.setSpan(obj, i, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return this.f32256s.subSequence(i, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f32256s.toString();
    }
}
