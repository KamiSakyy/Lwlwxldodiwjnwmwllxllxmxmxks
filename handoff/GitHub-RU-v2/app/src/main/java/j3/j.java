package j3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: /home/user/work/p/classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f26997a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26998b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26999c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27000d;

    public j(int i, float f6, float f10, float f11) {
        this.f26997a = i;
        this.f26998b = f6;
        this.f26999c = f10;
        this.f27000d = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f27000d, this.f26998b, this.f26999c, this.f26997a);
    }
}
