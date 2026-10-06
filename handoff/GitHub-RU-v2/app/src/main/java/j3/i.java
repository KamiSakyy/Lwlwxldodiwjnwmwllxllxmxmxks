package j3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.KotlinNothingValueException;
import y41.t1;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends ReplacementSpan {
    public int A;
    public boolean B;

    /* renamed from: r, reason: collision with root package name */
    public float f26988r;

    /* renamed from: s, reason: collision with root package name */
    public int f26989s;

    /* renamed from: t, reason: collision with root package name */
    public float f26990t;

    /* renamed from: u, reason: collision with root package name */
    public int f26991u;

    /* renamed from: v, reason: collision with root package name */
    public float f26992v;

    /* renamed from: w, reason: collision with root package name */
    public float f26993w;

    /* renamed from: x, reason: collision with root package name */
    public int f26994x;

    /* renamed from: y, reason: collision with root package name */
    public Paint.FontMetricsInt f26995y;

    /* renamed from: z, reason: collision with root package name */
    public int f26996z;

    public i(float f6, int i, float f10, int i10, s3.c cVar) {
        float u02 = i == 0 ? cVar.u0(t1.E(f6, 4294967296L)) : 0.0f;
        float u03 = i10 == 0 ? cVar.u0(t1.E(f10, 4294967296L)) : 0.0f;
        this.f26988r = f6;
        this.f26989s = i;
        this.f26990t = f10;
        this.f26991u = i10;
        this.f26992v = u02;
        this.f26993w = u03;
        this.f26994x = 3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f26995y;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        k71.k.m("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.B) {
            m3.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.A;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i10, float f6, int i11, int i12, int i13, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i10, Paint.FontMetricsInt fontMetricsInt) {
        float f6;
        float f10;
        this.B = true;
        float textSize = paint.getTextSize();
        this.f26995y = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            m3.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i11 = this.f26989s;
        if (i11 == 0) {
            f6 = this.f26992v;
        } else {
            if (i11 != 1) {
                m3.a.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f6 = this.f26988r * textSize;
        }
        this.f26996z = (int) Math.ceil(f6);
        int i12 = this.f26991u;
        if (i12 == 0) {
            f10 = this.f26993w;
        } else {
            if (i12 != 1) {
                m3.a.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f10 = this.f26990t * textSize;
        }
        this.A = (int) Math.ceil(f10);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            int i13 = this.f26994x;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                    }
                } else if (i13 != 2) {
                    if (i13 != 3) {
                        m3.a.a("Unknown verticalAlign.");
                    } else if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b10 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b10;
                        fontMetricsInt.descent = b() + b10;
                    }
                } else if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                    fontMetricsInt.ascent = fontMetricsInt.descent - b();
                }
            } else if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.B) {
            m3.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f26996z;
    }
}
