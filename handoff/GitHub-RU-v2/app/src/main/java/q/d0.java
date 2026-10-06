package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: /home/user/work/p/classes.dex */
public final class d0 extends y {

    /* renamed from: e, reason: collision with root package name */
    public c0 f30560e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f30561f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f30562g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f30563h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f30564j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f30562g = null;
        this.f30563h = null;
        this.i = false;
        this.f30564j = false;
        this.f30560e = c0Var;
    }

    @Override // q.y
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, 2130969717);
        c0 c0Var = this.f30560e;
        Context context = c0Var.getContext();
        int[] iArr = j.a.f26256g;
        l51.h C = l51.h.C(context, attributeSet, iArr, 2130969717);
        TypedArray typedArray = (TypedArray) C.t;
        a5.c1.o(c0Var, c0Var.getContext(), iArr, attributeSet, (TypedArray) C.t, 2130969717);
        Drawable t10 = C.t(0);
        if (t10 != null) {
            c0Var.setThumb(t10);
        }
        Drawable s2 = C.s(1);
        Drawable drawable = this.f30561f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f30561f = s2;
        if (s2 != null) {
            s2.setCallback(c0Var);
            s2.setLayoutDirection(c0Var.getLayoutDirection());
            if (s2.isStateful()) {
                s2.setState(c0Var.getDrawableState());
            }
            f();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f30563h = i1.c(typedArray.getInt(3, -1), this.f30563h);
            this.f30564j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f30562g = C.q(2);
            this.i = true;
        }
        C.G();
        f();
    }

    public final void f() {
        Drawable drawable = this.f30561f;
        if (drawable != null) {
            if (this.i || this.f30564j) {
                Drawable mutate = drawable.mutate();
                this.f30561f = mutate;
                if (this.i) {
                    mutate.setTintList(this.f30562g);
                }
                if (this.f30564j) {
                    this.f30561f.setTintMode(this.f30563h);
                }
                if (this.f30561f.isStateful()) {
                    this.f30561f.setState(this.f30560e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f30561f != null) {
            int max = this.f30560e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f30561f.getIntrinsicWidth();
                int intrinsicHeight = this.f30561f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f30561f.setBounds(-i, -i10, i, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f30561f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
