package a31;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import o31.l;
import o31.m;
import o31.o;
import r31.d;
import u31.j;
import u31.n;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends Drawable implements l {
    public float A;
    public float B;
    public WeakReference C;
    public WeakReference D;
    public final WeakReference r;
    public final j s;
    public final m t;
    public final Rect u;
    public final c v;
    public float w;
    public float x;
    public final int y;
    public float z;

    public a(Context context) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.r = weakReference;
        o.c(context, o.b, "Theme.MaterialComponents");
        this.u = new Rect();
        m mVar = new m(this);
        this.t = mVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = mVar.a;
        textPaint.setTextAlign(align);
        c cVar = new c(context);
        this.v = cVar;
        boolean f = f();
        b bVar = cVar.b;
        j jVar = new j(n.a(f ? bVar.x.intValue() : bVar.v.intValue(), f() ? bVar.y.intValue() : bVar.w.intValue(), context).a());
        this.s = jVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && mVar.g != (dVar = new d(context2, bVar.u.intValue()))) {
            mVar.b(dVar, context2);
            textPaint.setColor(bVar.t.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i = bVar.C;
        if (i != -2) {
            this.y = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.y = bVar.D;
        }
        mVar.e = true;
        j();
        invalidateSelf();
        mVar.e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(bVar.s.intValue());
        if (jVar.s.d != valueOf) {
            jVar.q(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar.t.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.C;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.C.get();
            WeakReference weakReference3 = this.D;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(bVar.K.booleanValue(), false);
    }

    @Override // o31.l
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void b(View view, View view2) {
        float f;
        float f2;
        View view3;
        boolean z;
        FrameLayout d = d();
        if (d == null) {
            float y = view.getY();
            f2 = view.getX();
            view3 = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            view3 = d;
        }
        while (true) {
            z = view3 instanceof View;
            if (!z || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f += view4.getY();
            f2 += view4.getX();
            view3 = view3.getParent();
        }
        if (z) {
            float f3 = (this.x - this.B) + f;
            float f4 = (this.w - this.A) + f2;
            View view5 = view3;
            float height = ((this.x + this.B) - view5.getHeight()) + f;
            float width = ((this.w + this.A) - view5.getWidth()) + f2;
            if (f3 < 0.0f) {
                this.x = Math.abs(f3) + this.x;
            }
            if (f4 < 0.0f) {
                this.w = Math.abs(f4) + this.w;
            }
            if (height > 0.0f) {
                this.x -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.w -= Math.abs(width);
            }
        }
    }

    public final String c() {
        c cVar = this.v;
        b bVar = cVar.b;
        b bVar2 = cVar.b;
        String str = bVar.A;
        WeakReference weakReference = this.r;
        if (str == null) {
            if (!g()) {
                return null;
            }
            if (this.y == -2 || e() <= this.y) {
                return NumberFormat.getInstance(bVar2.E).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(bVar2.E, context.getString(2131953264), Integer.valueOf(this.y), "+");
        }
        int i = bVar.C;
        if (i == -2 || str == null || str.length() <= i) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(2131953030), str.substring(0, i - 1), "…");
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.D;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String c;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.s.draw(canvas);
        if (!f() || (c = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        m mVar = this.t;
        mVar.a.getTextBounds(c, 0, c.length(), rect);
        float exactCenterY = this.x - rect.exactCenterY();
        canvas.drawText(c, this.w, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), mVar.a);
    }

    public final int e() {
        int i = this.v.b.B;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean f() {
        return this.v.b.A != null || g();
    }

    public final boolean g() {
        b bVar = this.v.b;
        return bVar.A == null && bVar.B != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.v.b.z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.u.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.u.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.r.get();
        if (context == null) {
            return;
        }
        boolean f = f();
        c cVar = this.v;
        this.s.setShapeAppearanceModel(n.a(f ? cVar.b.x.intValue() : cVar.b.v.intValue(), f() ? cVar.b.y.intValue() : cVar.b.w.intValue(), context).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.C = new WeakReference(view);
        this.D = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        float f;
        float f2;
        int intValue;
        int intValue2;
        int intValue3;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f12;
        WeakReference weakReference = this.r;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.C;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.u;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.D;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean f13 = f();
        c cVar = this.v;
        float f14 = f13 ? cVar.d : cVar.c;
        this.z = f14;
        if (f14 != -1.0f) {
            this.A = f14;
            this.B = f14;
        } else {
            this.A = Math.round((f() ? cVar.g : cVar.e) / 2.0f);
            this.B = Math.round((f() ? cVar.h : cVar.f) / 2.0f);
        }
        if (f()) {
            String c = c();
            float f15 = this.A;
            m mVar = this.t;
            if (mVar.e) {
                mVar.a(c);
                f10 = mVar.c;
            } else {
                f10 = mVar.c;
            }
            this.A = Math.max(f15, (f10 / 2.0f) + cVar.b.L.intValue());
            float f16 = this.B;
            if (mVar.e) {
                mVar.a(c);
                f12 = mVar.d;
            } else {
                f12 = mVar.d;
            }
            float max = Math.max(f16, (f12 / 2.0f) + cVar.b.M.intValue());
            this.B = max;
            this.A = Math.max(this.A, max);
        }
        b bVar = cVar.b;
        b bVar2 = cVar.b;
        int i = cVar.l;
        int i2 = cVar.k;
        int intValue4 = bVar.O.intValue();
        if (f()) {
            intValue4 = bVar.Q.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                f = -1.0f;
                f2 = 2.0f;
                intValue4 = y21.a.c(intValue4, y21.a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), intValue4 - bVar.T.intValue());
                if (i2 == 0) {
                    intValue4 -= Math.round(this.B);
                }
                intValue = bVar.S.intValue() + intValue4;
                intValue2 = bVar2.J.intValue();
                if (intValue2 != 8388691 || intValue2 == 8388693) {
                    this.x = rect3.bottom - intValue;
                } else {
                    this.x = rect3.top + intValue;
                }
                int intValue5 = !f() ? bVar.P.intValue() : bVar.N.intValue();
                if (i2 == 1) {
                    intValue5 += f() ? cVar.j : cVar.i;
                }
                int intValue6 = bVar.R.intValue() + intValue5;
                intValue3 = bVar2.J.intValue();
                if (intValue3 != 8388659 || intValue3 == 8388691) {
                    if (i != 0) {
                        if (view.getLayoutDirection() == 0) {
                            f3 = rect3.left + this.A;
                            f4 = (this.B * f2) - intValue6;
                            f5 = f3 - f4;
                            this.w = f5;
                        } else {
                            f5 = (rect3.right - this.A) + ((this.B * f2) - intValue6);
                            this.w = f5;
                        }
                    } else if (view.getLayoutDirection() == 0) {
                        f5 = (rect3.left - this.A) + intValue6;
                        this.w = f5;
                    } else {
                        f3 = rect3.right + this.A;
                        f4 = intValue6;
                        f5 = f3 - f4;
                        this.w = f5;
                    }
                } else if (i == 0) {
                    if (view.getLayoutDirection() == 0) {
                        f7 = rect3.right + this.A;
                        f8 = intValue6;
                        f9 = f7 - f8;
                        this.w = f9;
                    } else {
                        f9 = (rect3.left - this.A) + intValue6;
                        this.w = f9;
                    }
                } else if (view.getLayoutDirection() == 0) {
                    f9 = (rect3.right - this.A) + ((this.B * f2) - intValue6);
                    this.w = f9;
                } else {
                    f7 = rect3.left + this.A;
                    f8 = (this.B * f2) - intValue6;
                    f9 = f7 - f8;
                    this.w = f9;
                }
                if (bVar.U.booleanValue()) {
                    b(view, null);
                } else {
                    ViewParent d = d();
                    if (d == null) {
                        d = view.getParent();
                    }
                    if ((d instanceof View) && (d.getParent() instanceof View)) {
                        b(view, (View) d.getParent());
                    }
                }
                float f17 = this.w;
                float f18 = this.x;
                float f19 = this.A;
                float f20 = this.B;
                rect2.set((int) (f17 - f19), (int) (f18 - f20), (int) (f17 + f19), (int) (f18 + f20));
                f6 = this.z;
                j jVar = this.s;
                if (f6 != f) {
                    u31.m g = jVar.s.a.g();
                    g.e = new u31.a(f6);
                    g.f = new u31.a(f6);
                    g.g = new u31.a(f6);
                    g.h = new u31.a(f6);
                    jVar.setShapeAppearanceModel(g.a());
                }
                if (rect.equals(rect2)) {
                    jVar.setBounds(rect2);
                    return;
                }
                return;
            }
        }
        f = -1.0f;
        f2 = 2.0f;
        if (i2 == 0) {
        }
        intValue = bVar.S.intValue() + intValue4;
        intValue2 = bVar2.J.intValue();
        if (intValue2 != 8388691) {
        }
        this.x = rect3.bottom - intValue;
        if (!f()) {
        }
        if (i2 == 1) {
        }
        int intValue62 = bVar.R.intValue() + intValue5;
        intValue3 = bVar2.J.intValue();
        if (intValue3 != 8388659) {
        }
        if (i != 0) {
        }
        if (bVar.U.booleanValue()) {
        }
        float f172 = this.w;
        float f182 = this.x;
        float f192 = this.A;
        float f202 = this.B;
        rect2.set((int) (f172 - f192), (int) (f182 - f202), (int) (f172 + f192), (int) (f182 + f202));
        f6 = this.z;
        j jVar2 = this.s;
        if (f6 != f) {
        }
        if (rect.equals(rect2)) {
        }
    }

    @Override // android.graphics.drawable.Drawable, o31.l
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c cVar = this.v;
        cVar.a.z = i;
        cVar.b.z = i;
        this.t.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
