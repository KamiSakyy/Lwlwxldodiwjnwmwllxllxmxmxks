package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import o31.o;

/* loaded from: /home/user/work/p/classes4.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public double B;
    public int C;
    public int D;
    public final ValueAnimator r;
    public boolean s;
    public final ArrayList t;
    public final int u;
    public final float v;
    public final Paint w;
    public final RectF x;
    public final int y;
    public float z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969473);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.r = valueAnimator;
        this.t = new ArrayList();
        Paint paint = new Paint();
        this.w = paint;
        this.x = new RectF();
        this.D = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a.i, 2130969473, 2132018548);
        k41.b.J(2130969534, 200, context);
        k41.b.K(context, 2130969550, y21.a.b);
        this.C = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.u = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.y = getResources().getDimensionPixelSize(2131166030);
        this.v = r5.getDimensionPixelSize(2131166028);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.E;
                ClockHandView.this.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.C * 0.66f) : this.C;
    }

    public final void b(float f) {
        this.r.cancel();
        c(f);
    }

    public final void c(float f) {
        float f2 = f % 360.0f;
        this.z = f2;
        this.B = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a = a(this.D);
        float cos = (((float) Math.cos(this.B)) * a) + width;
        float sin = (a * ((float) Math.sin(this.B))) + height;
        float f3 = this.u;
        this.x.set(cos - f3, sin - f3, cos + f3, sin + f3);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((f) obj);
            if (Math.abs(clockFaceView.a0 - f2) > 0.001f) {
                clockFaceView.a0 = f2;
                clockFaceView.p();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float a = a(this.D);
        float cos = (((float) Math.cos(this.B)) * a) + f;
        float f2 = height;
        float sin = (a * ((float) Math.sin(this.B))) + f2;
        Paint paint = this.w;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.u, paint);
        double sin2 = Math.sin(this.B);
        paint.setStrokeWidth(this.y);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.B) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f, f2, this.v, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.r.isRunning()) {
            return;
        }
        b(this.z);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.A = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.A;
            if (this.s) {
                this.D = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) a(2)) + o.d(getContext(), 12) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.A;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.z != f;
        if (!z || !z5) {
            if (z5 || z2) {
                b(f);
            }
            this.A = z4 | z3;
            return true;
        }
        z3 = true;
        this.A = z4 | z3;
        return true;
    }
}
