package com.google.android.material.internal;

import a5.c1;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.viewpager.widget.f;
import o31.b;
import q.u;

/* loaded from: /home/user/work/p/classes4.dex */
public class CheckableImageButton extends u implements Checkable {
    public static final int[] x = {R.attr.state_checked};
    public boolean u;
    public boolean v;
    public boolean w;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969262);
        this.v = true;
        this.w = true;
        c1.p(this, new f(5, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        return this.u ? View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i + 1), x) : super/*android.view.View*/.onCreateDrawableState(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(((i5.b) bVar).r);
        setChecked(bVar.t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, i5.b, o31.b] */
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super/*android.view.View*/.onSaveInstanceState());
        bVar.t = this.u;
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckable(boolean z) {
        if (this.v != z) {
            this.v = z;
            sendAccessibilityEvent(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.v || this.u == z) {
            return;
        }
        this.u = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.w = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        if (this.w) {
            super/*android.view.View*/.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.u);
    }
}
