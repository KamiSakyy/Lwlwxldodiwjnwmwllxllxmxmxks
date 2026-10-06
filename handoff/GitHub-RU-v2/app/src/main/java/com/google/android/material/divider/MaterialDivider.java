package com.google.android.material.divider;

import a41.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.measurement.i4;
import o31.o;
import u31.j;

/* loaded from: /home/user/work/p/classes4.dex */
public class MaterialDivider extends View {
    public final j r;
    public int s;
    public int t;
    public int u;
    public int v;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130969476, 2132018513), attributeSet, 2130969476);
        Context context2 = getContext();
        this.r = new j();
        TypedArray f = o.f(context2, attributeSet, x21.a.x, 2130969476, 2132018513, new int[0]);
        this.s = f.getDimensionPixelSize(3, getResources().getDimensionPixelSize(2131166039));
        this.u = f.getDimensionPixelOffset(2, 0);
        this.v = f.getDimensionPixelOffset(1, 0);
        setDividerColor(i4.W(context2, f, 0).getDefaultColor());
        f.recycle();
    }

    public int getDividerColor() {
        return this.t;
    }

    public int getDividerInsetEnd() {
        return this.v;
    }

    public int getDividerInsetStart() {
        return this.u;
    }

    public int getDividerThickness() {
        return this.s;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.v : this.u;
        if (z) {
            width = getWidth();
            i = this.u;
        } else {
            width = getWidth();
            i = this.v;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        j jVar = this.r;
        jVar.setBounds(i2, 0, i3, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.s;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.t != i) {
            this.t = i;
            this.r.q(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.v = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.u = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.s != i) {
            this.s = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
