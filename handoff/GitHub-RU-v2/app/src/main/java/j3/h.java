package j3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements LineHeightSpan {
    public int B;
    public int C;

    /* renamed from: r, reason: collision with root package name */
    public float f26979r;

    /* renamed from: s, reason: collision with root package name */
    public int f26980s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f26981t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26982u;

    /* renamed from: v, reason: collision with root package name */
    public float f26983v;

    /* renamed from: w, reason: collision with root package name */
    public int f26984w;

    /* renamed from: x, reason: collision with root package name */
    public int f26985x = Integer.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public int f26986y = Integer.MIN_VALUE;

    /* renamed from: z, reason: collision with root package name */
    public int f26987z = Integer.MIN_VALUE;
    public int A = Integer.MIN_VALUE;

    public h(float f6, int i, boolean z10, boolean z11, float f10, int i10) {
        this.f26979r = f6;
        this.f26980s = i;
        this.f26981t = z10;
        this.f26982u = z11;
        this.f26983v = f10;
        this.f26984w = i10;
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            m3.a.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13 = fontMetricsInt.descent;
        int i14 = fontMetricsInt.ascent;
        if (i13 - i14 <= 0) {
            return;
        }
        boolean z10 = i == 0;
        boolean z11 = i10 == this.f26980s;
        int i15 = this.f26984w;
        boolean z12 = this.f26982u;
        boolean z13 = this.f26981t;
        if (z10 && z11 && z13 && z12 && i15 != 2) {
            return;
        }
        if (this.f26985x == Integer.MIN_VALUE) {
            int i16 = i13 - i14;
            int ceil = (int) Math.ceil(this.f26979r);
            int i17 = ceil - i16;
            if (i15 != 1 || i17 > 0) {
                float f6 = this.f26983v;
                if (f6 == -1.0f) {
                    f6 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i17 <= 0 ? Math.ceil(i17 * f6) : Math.ceil((1.0f - f6) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = ceil2 + i18;
                this.f26987z = i19;
                int i20 = i19 - ceil;
                this.f26986y = i20;
                if (i15 == 0 || i17 >= 0) {
                    if (z13) {
                        i20 = fontMetricsInt.ascent;
                    }
                    this.f26985x = i20;
                    if (z12) {
                        i19 = i18;
                    }
                    this.A = i19;
                    this.B = fontMetricsInt.ascent - i20;
                    this.C = i19 - i18;
                } else if (i15 == 2) {
                    this.f26985x = z13 ? Math.max(fontMetricsInt.ascent, i20) : Math.min(fontMetricsInt.ascent, i20);
                    this.A = z12 ? Math.min(fontMetricsInt.descent, this.f26987z) : Math.max(fontMetricsInt.descent, this.f26987z);
                    this.B = 0;
                    this.C = 0;
                }
            } else {
                int i21 = fontMetricsInt.ascent;
                this.f26986y = i21;
                int i22 = fontMetricsInt.descent;
                this.f26987z = i22;
                this.f26985x = i21;
                this.A = i22;
                this.B = 0;
                this.C = 0;
            }
        }
        fontMetricsInt.ascent = z10 ? this.f26985x : this.f26986y;
        fontMetricsInt.descent = z11 ? this.A : this.f26987z;
    }
}
