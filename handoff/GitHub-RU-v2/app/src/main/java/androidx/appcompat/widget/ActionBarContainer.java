package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import q.i2;

/* loaded from: /home/user/work/p/classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public boolean f914r;

    /* renamed from: s, reason: collision with root package name */
    public View f915s;

    /* renamed from: t, reason: collision with root package name */
    public View f916t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f917u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f918v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f919w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f920x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f921y;

    /* renamed from: z, reason: collision with root package name */
    public final int f922z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new q.a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f26250a);
        boolean z10 = false;
        this.f917u = obtainStyledAttributes.getDrawable(0);
        this.f918v = obtainStyledAttributes.getDrawable(2);
        this.f922z = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131363341) {
            this.f920x = true;
            this.f919w = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f920x ? !(this.f917u != null || this.f918v != null) : this.f919w == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f917u;
        if (drawable != null && drawable.isStateful()) {
            this.f917u.setState(getDrawableState());
        }
        Drawable drawable2 = this.f918v;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f918v.setState(getDrawableState());
        }
        Drawable drawable3 = this.f919w;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f919w.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f917u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f918v;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f919w;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f915s = findViewById(2131361848);
        this.f916t = findViewById(2131361856);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f914r || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        boolean z11 = true;
        if (this.f920x) {
            Drawable drawable = this.f919w;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f917u == null) {
                z11 = false;
            } else if (this.f915s.getVisibility() == 0) {
                this.f917u.setBounds(this.f915s.getLeft(), this.f915s.getTop(), this.f915s.getRight(), this.f915s.getBottom());
            } else {
                View view = this.f916t;
                if (view == null || view.getVisibility() != 0) {
                    this.f917u.setBounds(0, 0, 0, 0);
                } else {
                    this.f917u.setBounds(this.f916t.getLeft(), this.f916t.getTop(), this.f916t.getRight(), this.f916t.getBottom());
                }
            }
            this.f921y = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        if (this.f915s == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f922z) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i10);
        if (this.f915s == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f917u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f917u);
        }
        this.f917u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f915s;
            if (view != null) {
                this.f917u.setBounds(view.getLeft(), this.f915s.getTop(), this.f915s.getRight(), this.f915s.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f920x ? !(this.f917u != null || this.f918v != null) : this.f919w == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f919w;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f919w);
        }
        this.f919w = drawable;
        boolean z10 = this.f920x;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f919w) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f917u != null || this.f918v != null) : this.f919w == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f918v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f918v);
        }
        this.f918v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f921y && this.f918v != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.f920x ? !(this.f917u != null || this.f918v != null) : this.f919w == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(i2 i2Var) {
    }

    public void setTransitioning(boolean z10) {
        this.f914r = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z10 = i == 0;
        Drawable drawable = this.f917u;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f918v;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f919w;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f917u;
        boolean z10 = this.f920x;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.f918v && this.f921y) {
            return true;
        }
        return (drawable == this.f919w && z10) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
