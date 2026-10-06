package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import u31.m;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h extends ConstraintLayout {
    public g H;
    public int I;
    public u31.j J;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.g] */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969473);
        LayoutInflater.from(context).inflate(2131559302, (ViewGroup) this);
        u31.j jVar = new u31.j();
        this.J = jVar;
        u31.k kVar = new u31.k(0.5f);
        m g = jVar.s.a.g();
        g.e = kVar;
        g.f = kVar;
        g.g = kVar;
        g.h = kVar;
        jVar.setShapeAppearanceModel(g.a());
        this.J.q(ColorStateList.valueOf(-1));
        setBackground(this.J);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a.E, 2130969473, 0);
        this.I = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.H = new Runnable() { // from class: com.google.android.material.timepicker.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.o();
            }
        };
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.H;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void o();

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.H;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public final void setBackgroundColor(int i) {
        this.J.q(ColorStateList.valueOf(i));
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g {
        public g() {
        }
    }
    public Object onInitializeAccessibilityNodeInfo(Object p1) { return null; }
    public Object onLayout(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object onMeasure(Object p1, Object p2) { return null; }
    public Object setBackground(Object) { return null; }
}
