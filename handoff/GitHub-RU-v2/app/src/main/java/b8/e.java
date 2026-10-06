package b8;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: /home/user/work/p/classes.dex */
public final class e extends Drawable implements Animatable {

    /* renamed from: x, reason: collision with root package name */
    public static final LinearInterpolator f3811x = new LinearInterpolator();

    /* renamed from: y, reason: collision with root package name */
    public static final p6.a f3812y = new p6.a(1);

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f3813z = {-16777216};

    /* renamed from: r, reason: collision with root package name */
    public d f3814r;

    /* renamed from: s, reason: collision with root package name */
    public float f3815s;

    /* renamed from: t, reason: collision with root package name */
    public Resources f3816t;

    /* renamed from: u, reason: collision with root package name */
    public ValueAnimator f3817u;

    /* renamed from: v, reason: collision with root package name */
    public float f3818v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3819w;

    public e(Context context) {
        context.getClass();
        this.f3816t = context.getResources();
        d dVar = new d();
        this.f3814r = dVar;
        dVar.i = f3813z;
        dVar.a(0);
        dVar.f3800h = 2.5f;
        dVar.f3794b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f3811x);
        ofFloat.addListener(new c(this, dVar));
        this.f3817u = ofFloat;
    }

    public static void d(float f6, d dVar) {
        if (f6 <= 0.75f) {
            dVar.f3810u = dVar.i[dVar.f3801j];
            return;
        }
        float f10 = (f6 - 0.75f) / 0.25f;
        int[] iArr = dVar.i;
        int i = dVar.f3801j;
        int i10 = iArr[i];
        int i11 = iArr[(i + 1) % iArr.length];
        dVar.f3810u = ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r1) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r3) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r4) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r2))));
    }

    public final void a(float f6, d dVar, boolean z10) {
        float interpolation;
        float f10;
        if (this.f3819w) {
            d(f6, dVar);
            float floor = (float) (Math.floor(dVar.m / 0.8f) + 1.0d);
            float f11 = dVar.f3802k;
            float f12 = dVar.l;
            dVar.f3797e = (((f12 - 0.01f) - f11) * f6) + f11;
            dVar.f3798f = f12;
            float f13 = dVar.m;
            dVar.f3799g = x.i.a(floor, f13, f6, f13);
            return;
        }
        if (f6 != 1.0f || z10) {
            float f14 = dVar.m;
            p6.a aVar = f3812y;
            if (f6 < 0.5f) {
                interpolation = dVar.f3802k;
                f10 = (aVar.getInterpolation(f6 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = dVar.f3802k + 0.79f;
                interpolation = f15 - (((1.0f - aVar.getInterpolation((f6 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f10 = f15;
            }
            float f16 = (0.20999998f * f6) + f14;
            float f17 = (f6 + this.f3818v) * 216.0f;
            dVar.f3797e = interpolation;
            dVar.f3798f = f10;
            dVar.f3799g = f16;
            this.f3815s = f17;
        }
    }

    public final void b(float f6, float f10, float f11, float f12) {
        float f13 = this.f3816t.getDisplayMetrics().density;
        float f14 = f10 * f13;
        d dVar = this.f3814r;
        dVar.f3800h = f14;
        dVar.f3794b.setStrokeWidth(f14);
        dVar.f3806q = f6 * f13;
        dVar.a(0);
        dVar.f3807r = (int) (f11 * f13);
        dVar.f3808s = (int) (f12 * f13);
    }

    public final void c(int i) {
        if (i == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3815s, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f3814r;
        Paint paint = dVar.f3794b;
        RectF rectF = dVar.f3793a;
        float f6 = dVar.f3806q;
        float f10 = (dVar.f3800h / 2.0f) + f6;
        if (f6 <= 0.0f) {
            f10 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f3807r * dVar.f3805p) / 2.0f, dVar.f3800h / 2.0f);
        }
        rectF.set(bounds.centerX() - f10, bounds.centerY() - f10, bounds.centerX() + f10, bounds.centerY() + f10);
        float f11 = dVar.f3797e;
        float f12 = dVar.f3799g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((dVar.f3798f + f12) * 360.0f) - f13;
        paint.setColor(dVar.f3810u);
        paint.setAlpha(dVar.f3809t);
        float f15 = dVar.f3800h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f3796d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        Paint paint2 = dVar.f3795c;
        if (dVar.f3803n) {
            Path path = dVar.f3804o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f3804o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (dVar.f3807r * dVar.f3805p) / 2.0f;
            dVar.f3804o.moveTo(0.0f, 0.0f);
            dVar.f3804o.lineTo(dVar.f3807r * dVar.f3805p, 0.0f);
            Path path3 = dVar.f3804o;
            float f18 = dVar.f3807r;
            float f19 = dVar.f3805p;
            path3.lineTo((f18 * f19) / 2.0f, dVar.f3808s * f19);
            dVar.f3804o.offset((rectF.centerX() + min) - f17, (dVar.f3800h / 2.0f) + rectF.centerY());
            dVar.f3804o.close();
            paint2.setColor(dVar.f3810u);
            paint2.setAlpha(dVar.f3809t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f3804o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3814r.f3809t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f3817u.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3814r.f3809t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3814r.f3794b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f3817u.cancel();
        d dVar = this.f3814r;
        float f6 = dVar.f3797e;
        dVar.f3802k = f6;
        float f10 = dVar.f3798f;
        dVar.l = f10;
        dVar.m = dVar.f3799g;
        if (f10 != f6) {
            this.f3819w = true;
            this.f3817u.setDuration(666L);
            this.f3817u.start();
            return;
        }
        dVar.a(0);
        dVar.f3802k = 0.0f;
        dVar.l = 0.0f;
        dVar.m = 0.0f;
        dVar.f3797e = 0.0f;
        dVar.f3798f = 0.0f;
        dVar.f3799g = 0.0f;
        this.f3817u.setDuration(1332L);
        this.f3817u.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f3817u.cancel();
        this.f3815s = 0.0f;
        d dVar = this.f3814r;
        if (dVar.f3803n) {
            dVar.f3803n = false;
        }
        dVar.a(0);
        dVar.f3802k = 0.0f;
        dVar.l = 0.0f;
        dVar.m = 0.0f;
        dVar.f3797e = 0.0f;
        dVar.f3798f = 0.0f;
        dVar.f3799g = 0.0f;
        invalidateSelf();
    }
}
