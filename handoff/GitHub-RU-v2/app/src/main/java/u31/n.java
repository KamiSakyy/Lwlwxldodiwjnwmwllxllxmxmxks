package u31;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public static final k m = new k(0.5f);
    public sy.u a = new l();
    public sy.u b = new l();
    public sy.u c = new l();
    public sy.u d = new l();
    public d e = new a(0.0f);
    public d f = new a(0.0f);
    public d g = new a(0.0f);
    public d h = new a(0.0f);
    public f i;
    public f j;
    public f k;
    public f l;

    public n() {
        int i = 0;
        this.i = new f(i);
        this.j = new f(i);
        this.k = new f(i);
        this.l = new f(i);
    }

    public static m a(int i, int i2, Context context) {
        return b(context, i, i2, new a(0));
    }

    public static m b(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(x21.a.G);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            d d = d(obtainStyledAttributes, 5, aVar);
            d d2 = d(obtainStyledAttributes, 8, d);
            d d3 = d(obtainStyledAttributes, 9, d);
            d d4 = d(obtainStyledAttributes, 7, d);
            d d5 = d(obtainStyledAttributes, 6, d);
            m mVar = new m();
            mVar.a = sy.w.q(i4);
            mVar.e = d2;
            mVar.b = sy.w.q(i5);
            mVar.f = d3;
            mVar.c = sy.w.q(i6);
            mVar.g = d4;
            mVar.d = sy.w.q(i7);
            mVar.h = d5;
            return mVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static m c(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a.z, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static d d(TypedArray typedArray, int i, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new k(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean e() {
        return (this.b instanceof l) && (this.a instanceof l) && (this.c instanceof l) && (this.d instanceof l);
    }

    public final boolean f(RectF rectF) {
        boolean z = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && e();
    }

    public final m g() {
        m mVar = new m();
        mVar.a = this.a;
        mVar.b = this.b;
        mVar.c = this.c;
        mVar.d = this.d;
        mVar.e = this.e;
        mVar.f = this.f;
        mVar.g = this.g;
        mVar.h = this.h;
        mVar.i = this.i;
        mVar.j = this.j;
        mVar.k = this.k;
        mVar.l = this.l;
        return mVar;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
