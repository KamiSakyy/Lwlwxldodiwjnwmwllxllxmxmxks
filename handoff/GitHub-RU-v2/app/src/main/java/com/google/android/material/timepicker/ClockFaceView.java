package com.google.android.material.timepicker;

import a5.c1;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.i4;
import j4.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
class ClockFaceView extends h implements f {
    public final ClockHandView K;
    public final Rect L;
    public final RectF M;
    public final Rect N;
    public final SparseArray O;
    public final c P;
    public final int[] Q;
    public final float[] R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final String[] W;
    public float a0;
    public final ColorStateList b0;

    /* JADX WARN: Multi-variable type inference failed */
    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new Rect();
        this.M = new RectF();
        this.N = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.O = sparseArray;
        this.R = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a.h, 2130969473, 2132018548);
        Resources resources = getResources();
        ColorStateList W = i4.W(context, obtainStyledAttributes, 1);
        this.b0 = W;
        LayoutInflater.from(context).inflate(2131559301, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(2131362998);
        this.K = clockHandView;
        this.S = resources.getDimensionPixelSize(2131166029);
        int colorForState = W.getColorForState(new int[]{R.attr.state_selected}, W.getDefaultColor());
        this.Q = new int[]{colorForState, colorForState, W.getDefaultColor()};
        clockHandView.t.add(this);
        int defaultColor = o4.b.c(context, 2131100800).getDefaultColor();
        ColorStateList W2 = i4.W(context, obtainStyledAttributes, 0);
        setBackgroundColor(W2 != null ? W2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.P = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.W = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.W.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.W.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(2131559300, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.W[i]);
                textView.setTag(2131363014, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(2131362999, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                c1.p(textView, this.P);
                textView.setTextColor(this.b0);
            }
        }
        ClockHandView clockHandView2 = this.K;
        if (clockHandView2.s && !z) {
            clockHandView2.D = 1;
        }
        clockHandView2.s = z;
        clockHandView2.invalidate();
        this.T = resources.getDimensionPixelSize(2131166058);
        this.U = resources.getDimensionPixelSize(2131166059);
        this.V = resources.getDimensionPixelSize(2131166036);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.timepicker.h
    public final void o() {
        o oVar = new o();
        oVar.e(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != 2131362097 && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(2131362999);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.I * 0.66f) : this.I;
            Iterator it = list.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                j4.k kVar = oVar.i(((View) it.next()).getId()).e;
                kVar.A = 2131362097;
                kVar.B = round;
                kVar.C = f;
                f += 360.0f / list.size();
            }
        }
        oVar.b(this);
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.O;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b5.e.c(1, this.W.length, 1, false).b);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.V / Math.max(Math.max(this.T / displayMetrics.heightPixels, this.U / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void p() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.K.x;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.O;
            int size = sparseArray.size();
            rect = this.L;
            rectF = this.M;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.N);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.Q, this.R, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    public static  findViewById(Object... a) {
        return null;
    }

    public static  getViewTreeObserver(Object... a) {
        return null;
    }

    public static  setFocusable(Object... a) {
        return null;
    }

    public static  getContext(Object... a) {
        return null;
    }

    public static  removeView(Object... a) {
        return null;
    }

    public static  getChildCount(Object... a) {
        return null;
    }

    public static  getChildAt(Object... a) {
        return null;
    }

    public static  getResources(Object... a) {
        return null;
    }

    public static  setMeasuredDimension(Object... a) {
        return null;
    }

    public static  isShown(Object... a) {
        return null;
    }

    public static  getHeight(Object... a) {
        return null;
    }
    public Object getHeight() { return null; }
    public Object isShown() { return null; }
}
