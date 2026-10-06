package lg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.LineHeightSpan;
import k71.k;
import lg.b;
import u31.l;
import u31.n;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class gShadow extends ForegroundColorSpan implements LineHeightSpan.WithDensity {

    public static final class a extends gShadow {
        public static final C0026a Companion = new C0026a();
        public u31.j r;
        public u31.j s;
        public u31.j t;
        public u31.j u;
        public int v;

        /* renamed from: lg.g$a$a, reason: collision with other inner class name */
        public static final class C0026a {
            public static final u31.j a(C0026a c0026a, Context context, int i, n nVar) {
                c0026a.getClass();
                u31.j jVar = new u31.j(nVar);
                jVar.setTint(i);
                if (i == -16777216 || i == -1) {
                    float dimension = context.getResources().getDimension(2131166060);
                    int color = context.getColor(2131099749);
                    jVar.s.k = dimension;
                    jVar.invalidateSelf();
                    ColorStateList valueOf = ColorStateList.valueOf(color);
                    u31.h hVar = jVar.s;
                    if (hVar.e != valueOf) {
                        hVar.e = valueOf;
                        jVar.onStateChange(jVar.getState());
                    }
                }
                return jVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, int i) {
            super(r4.a.c(i) < 0.5d ? -1 : -16777216);
            k.g(context, "context");
            C0026a c0026a = Companion;
            l lVar = new l();
            l lVar2 = new l();
            u31.a aVar = new u31.a(0.0f);
            u31.a aVar2 = new u31.a(0.0f);
            u31.f fVar = new u31.f(0);
            u31.f fVar2 = new u31.f(0);
            u31.f fVar3 = new u31.f(0);
            u31.f fVar4 = new u31.f(0);
            l lVar3 = new l();
            l lVar4 = new l();
            n nVar = new n();
            nVar.a = lVar3;
            nVar.b = lVar;
            nVar.c = lVar2;
            nVar.d = lVar4;
            u31.k kVar = n.m;
            nVar.e = kVar;
            nVar.f = aVar;
            nVar.g = aVar2;
            nVar.h = kVar;
            nVar.i = fVar;
            nVar.j = fVar2;
            nVar.k = fVar3;
            nVar.l = fVar4;
            this.r = C0026a.a(c0026a, context, i, nVar);
            l lVar5 = new l();
            l lVar6 = new l();
            u31.a aVar3 = new u31.a(0.0f);
            u31.a aVar4 = new u31.a(0.0f);
            u31.f fVar5 = new u31.f(0);
            u31.f fVar6 = new u31.f(0);
            u31.f fVar7 = new u31.f(0);
            u31.f fVar8 = new u31.f(0);
            l lVar7 = new l();
            l lVar8 = new l();
            n nVar2 = new n();
            nVar2.a = lVar5;
            nVar2.b = lVar7;
            nVar2.c = lVar8;
            nVar2.d = lVar6;
            nVar2.e = aVar3;
            nVar2.f = kVar;
            nVar2.g = kVar;
            nVar2.h = aVar4;
            nVar2.i = fVar5;
            nVar2.j = fVar6;
            nVar2.k = fVar7;
            nVar2.l = fVar8;
            this.s = C0026a.a(c0026a, context, i, nVar2);
            l lVar9 = new l();
            l lVar10 = new l();
            l lVar11 = new l();
            l lVar12 = new l();
            u31.a aVar5 = new u31.a(0.0f);
            u31.a aVar6 = new u31.a(0.0f);
            u31.a aVar7 = new u31.a(0.0f);
            u31.a aVar8 = new u31.a(0.0f);
            u31.f fVar9 = new u31.f(0);
            u31.f fVar10 = new u31.f(0);
            u31.f fVar11 = new u31.f(0);
            u31.f fVar12 = new u31.f(0);
            n nVar3 = new n();
            nVar3.a = lVar9;
            nVar3.b = lVar10;
            nVar3.c = lVar11;
            nVar3.d = lVar12;
            nVar3.e = aVar5;
            nVar3.f = aVar6;
            nVar3.g = aVar7;
            nVar3.h = aVar8;
            nVar3.i = fVar9;
            nVar3.j = fVar10;
            nVar3.k = fVar11;
            nVar3.l = fVar12;
            this.t = C0026a.a(c0026a, context, i, nVar3);
            u31.f fVar13 = new u31.f(0);
            u31.f fVar14 = new u31.f(0);
            u31.f fVar15 = new u31.f(0);
            u31.f fVar16 = new u31.f(0);
            l lVar13 = new l();
            n nVar4 = new n();
            nVar4.a = lVar13;
            nVar4.b = lVar13;
            nVar4.c = lVar13;
            nVar4.d = lVar13;
            nVar4.e = kVar;
            nVar4.f = kVar;
            nVar4.g = kVar;
            nVar4.h = kVar;
            nVar4.i = fVar13;
            nVar4.j = fVar14;
            nVar4.k = fVar15;
            nVar4.l = fVar16;
            this.u = C0026a.a(c0026a, context, i, nVar4);
            this.v = context.getResources().getDimensionPixelSize(2131166297);
        }

        @Override // lg.g
        public final Drawable c() {
            return this.u;
        }

        @Override // android.text.style.LineHeightSpan
        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            k.g(fontMetricsInt, "fm");
        }

        @Override // lg.g
        public final Drawable h() {
            return this.r;
        }

        @Override // lg.g
        public final Drawable j() {
            return this.t;
        }

        @Override // lg.g
        public final Drawable o() {
            return this.s;
        }

        @Override // android.text.style.LineHeightSpan.WithDensity
        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
            k.g(fontMetricsInt, "fm");
            k.g(textPaint, "paint");
            Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
            int i5 = fontMetricsInt2.ascent;
            int i6 = this.v;
            fontMetricsInt.ascent = i5 - i6;
            fontMetricsInt.top = fontMetricsInt2.top - i6;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + i6;
            fontMetricsInt.descent = fontMetricsInt2.descent + i6;
        }
    }

    public static final class b extends gShadow {
        public static final a Companion = new a();
        public GradientDrawable r;
        public GradientDrawable s;
        public GradientDrawable t;
        public GradientDrawable u;
        public int v;

        public static final class a {
            public static final GradientDrawable a(a aVar, Context context, float[] fArr) {
                aVar.getClass();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(context.getColor(2131099693));
                gradientDrawable.setShape(0);
                gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(2131166310), context.getColor(2131099749));
                gradientDrawable.setCornerRadii(fArr);
                return gradientDrawable;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(Context context) {
            super(b.a.d(context, r1));
            k.g(context, "context");
            b.a aVar = lg.b.Companion;
            lg.b bVar = lg.b.z;
            aVar.getClass();
            float dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165307);
            a aVar2 = Companion;
            this.r = a.a(aVar2, context, new float[]{dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 0.0f, 0.0f, dimensionPixelSize, dimensionPixelSize});
            this.s = a.a(aVar2, context, new float[]{0.0f, 0.0f, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f});
            this.t = a.a(aVar2, context, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            this.u = a.a(aVar2, context, new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize});
            this.v = context.getResources().getDimensionPixelSize(2131166297);
        }

        @Override // lg.g
        public final Drawable c() {
            return this.u;
        }

        @Override // android.text.style.LineHeightSpan
        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            k.g(fontMetricsInt, "fm");
        }

        @Override // lg.g
        public final Drawable h() {
            return this.r;
        }

        @Override // lg.g
        public final Drawable j() {
            return this.t;
        }

        @Override // lg.g
        public final Drawable o() {
            return this.s;
        }

        @Override // android.text.style.LineHeightSpan.WithDensity
        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
            k.g(fontMetricsInt, "fm");
            k.g(textPaint, "paint");
            Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
            int i5 = fontMetricsInt2.ascent;
            int i6 = this.v;
            fontMetricsInt.ascent = i5 - i6;
            fontMetricsInt.top = fontMetricsInt2.top - i6;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + i6;
            fontMetricsInt.descent = fontMetricsInt2.descent + i6;
        }
    }

    public static final class c extends gShadow {
        public static final a Companion = new a();
        public GradientDrawable r;
        public GradientDrawable s;
        public GradientDrawable t;
        public GradientDrawable u;
        public int v;

        public static final class a {
            public static final GradientDrawable a(a aVar, Context context, lg.b bVar, float[] fArr) {
                aVar.getClass();
                GradientDrawable gradientDrawable = new GradientDrawable();
                lg.b.Companion.getClass();
                gradientDrawable.setColor(b.a.a(context, bVar));
                gradientDrawable.setShape(0);
                gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(2131166310), b.a.c(context, bVar));
                gradientDrawable.setCornerRadii(fArr);
                return gradientDrawable;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, lg.b bVar) {
            super(b.a.d(context, bVar));
            k.g(context, "context");
            lg.b.Companion.getClass();
            float dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165312);
            a aVar = Companion;
            this.r = a.a(aVar, context, bVar, new float[]{dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 0.0f, 0.0f, dimensionPixelSize, dimensionPixelSize});
            this.s = a.a(aVar, context, bVar, new float[]{0.0f, 0.0f, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f});
            this.t = a.a(aVar, context, bVar, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            this.u = a.a(aVar, context, bVar, new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize});
            this.v = context.getResources().getDimensionPixelSize(2131166296);
        }

        @Override // lg.g
        public final Drawable c() {
            return this.u;
        }

        @Override // android.text.style.LineHeightSpan
        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            k.g(fontMetricsInt, "fm");
        }

        @Override // lg.g
        public final Drawable h() {
            return this.r;
        }

        @Override // lg.g
        public final Drawable j() {
            return this.t;
        }

        @Override // lg.g
        public final Drawable o() {
            return this.s;
        }

        @Override // android.text.style.LineHeightSpan.WithDensity
        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
            k.g(fontMetricsInt, "fm");
            k.g(textPaint, "paint");
            Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
            int i5 = fontMetricsInt2.ascent;
            int i6 = this.v;
            fontMetricsInt.ascent = i5 - i6;
            fontMetricsInt.top = fontMetricsInt2.top - i6;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + i6;
            fontMetricsInt.descent = fontMetricsInt2.descent + i6;
        }
    }

    public abstract Drawable c();

    public abstract Drawable h();

    public abstract Drawable j();

    public abstract Drawable o();
}
