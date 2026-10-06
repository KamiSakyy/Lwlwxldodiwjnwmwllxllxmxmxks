package y4;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public TextPaint f34262a;

    /* renamed from: b, reason: collision with root package name */
    public TextDirectionHeuristic f34263b;

    /* renamed from: c, reason: collision with root package name */
    public int f34264c;

    /* renamed from: d, reason: collision with root package name */
    public int f34265d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
        }
        this.f34262a = textPaint;
        this.f34263b = textDirectionHeuristic;
        this.f34264c = i;
        this.f34265d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f34264c != cVar.f34264c || this.f34265d != cVar.f34265d) {
            return false;
        }
        TextPaint textPaint = this.f34262a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = cVar.f34262a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f34263b == cVar.f34263b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f34262a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f34263b, Integer.valueOf(this.f34264c), Integer.valueOf(this.f34265d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f34262a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb2.append(", textDir=" + this.f34263b);
        sb2.append(", breakStrategy=" + this.f34264c);
        sb2.append(", hyphenationFrequency=" + this.f34265d);
        sb2.append("}");
        return sb2.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f34262a = params.getTextPaint();
        this.f34263b = params.getTextDirection();
        this.f34264c = params.getBreakStrategy();
        this.f34265d = params.getHyphenationFrequency();
    }
    public c(android.text.TextPaint p1, android.text.TextDirectionHeuristic p2, int p3, int p4) {
    }
}
