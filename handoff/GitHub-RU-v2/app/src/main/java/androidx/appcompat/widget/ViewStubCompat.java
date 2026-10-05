package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import q.l3;

/* loaded from: /home/user/work/p/classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: r, reason: collision with root package name */
    public int f1050r;

    /* renamed from: s, reason: collision with root package name */
    public int f1051s;

    /* renamed from: t, reason: collision with root package name */
    public WeakReference f1052t;

    /* renamed from: u, reason: collision with root package name */
    public LayoutInflater f1053u;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1050r = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.B, 0, 0);
        this.f1051s = obtainStyledAttributes.getResourceId(2, -1);
        this.f1050r = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1050r == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f1053u;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1050r, viewGroup, false);
        int i = this.f1051s;
        if (i != -1) {
            inflate.setId(i);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f1052t = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1051s;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1053u;
    }

    public int getLayoutResource() {
        return this.f1050r;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1051s = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1053u = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1050r = i;
    }

    public void setOnInflateListener(l3 l3Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f1052t;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }
}
